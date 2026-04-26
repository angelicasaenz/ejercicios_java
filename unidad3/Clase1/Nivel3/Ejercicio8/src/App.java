import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.FileReader;
import java.util.Scanner;

public class App {

/*     Objetivo:
    Combinar excepciones verificadas, no verificadas y personalizadas.

    Enunciado:
    Crea un programa bancario que:

    Intente leer un archivo de clientes.
    Solicite un monto para retirar.
    Si el monto es mayor al saldo, lance SaldoInsuficienteException.
    Si el usuario ingresa datos inválidos, maneje la excepción correspondiente.
    Debe manejar:
    FileNotFoundException
    InputMismatchException
    SaldoInsuficienteException */
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double saldo = 1000000;
        try {
            FileReader validarArchivo = new FileReader("clientes.csv");
            System.out.println("Abriendo archivo...");

            System.out.println("--------------------------------");
            System.out.println("Ingrese el monto a retirar: ");
            int monto = sc.nextInt();
            if (monto > saldo){
                throw new SaldoInsuficienteException("Saldo insuficiente");
            } else {
                saldo -= monto;
                System.out.println("Retiro exitoso, su nuevo saldo es: " + saldo);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (SaldoInsuficienteException e){
            System.out.println("Error! " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingrese un dato valido");
        }
        
    }
}
