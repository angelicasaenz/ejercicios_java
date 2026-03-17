
import java.util.Scanner;

public class ejercicio2 {

    static Scanner sc = new Scanner(System.in);
    static int dineroDispo = 5_000_000;

    public static void main(String[] args) {
        menu();

    }

    public static void menu(){

        int opcion;
        System.out.println("""
                *****MENÚ BANCO*****
                1. Consultar dinero
                2. Retirar saldo
                3. Salir

                Por favor seleccione una opción...
                """);
        opcion = sc.nextInt();
        

        switch (opcion) {
            case 1:
                
                break;
            case 2:
                
                break;
        
            default:
                break;
        }
    }
    
}
