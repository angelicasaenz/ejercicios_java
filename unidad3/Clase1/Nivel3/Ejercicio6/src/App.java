import java.util.Scanner;

public class App {

/*     Ejercicio 6: Excepción personalizada simple
    Objetivo:
    Crear y usar una excepción personalizada.

    Enunciado:
    Diseña una excepción personalizada llamada EdadInvalidaException.

    El programa debe solicitar la edad de una persona y lanzar la excepción si la edad es menor que 18.

    Indicaciones:
    Crear una clase que herede de Exception.
    Lanzarla usando throw.
    Capturarla en main. */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese su edad: ");
            int edad = sc.nextInt();
            
            if (edad < 18) {
            throw new EdadInvalidaException("Edad invalida, debe ser mayor de 18");
        } else{
            System.out.println("Bienvenido al sistema");
        }
        } catch (EdadInvalidaException e) {
            System.out.println("Error " + e.getMessage());
        }
       
        
    }
}
