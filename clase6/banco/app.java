package clase6.banco;

import java.util.Scanner;

public class app {

    static Scanner sc = new Scanner(System.in);
    static int numCuenta = 12345;
    static int clave = 1234;
    static int saldoInicial = 1_000_000;

    
    public static void main(String[] args) throws Exception {
        login();

        
    }

    public static void login() {
        
        do {
            System.out.println("Ingrese el número de cuenta: ");
            int cuentaIngresada = sc.nextInt();
            System.out.println( "Ingrese su clave: ");
            int claveIngresada = sc.nextInt();

            int intentos = 0;
            
            if (cuentaIngresada == numCuenta && claveIngresada == clave && intentos < 3) {

                System.out.println("Ingresando al sistema....");
            } else {
                intentos ++;
                System.out.println("Ha superado los intentos permitidos");
            }
        } while (intentos < 3);

        
    }


    
}
