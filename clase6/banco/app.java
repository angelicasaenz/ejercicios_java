package clase6.banco;

import java.util.Scanner;

public class app {

    static Scanner sc = new Scanner(System.in);
    static int numCuenta = 12345;
    static int clave = 2026;
    static double saldo = 1_000_000;

    
    public static void main(String[] args) throws Exception {
        login();
        menu ();

        
    }

    public static void login() {
        boolean loginExitoso = false;
        int intentos = 0;
        int cuentaIngresada, claveIngresada;

        do {
            System.out.print("Ingrese el número de cuenta: ");
            cuentaIngresada = sc.nextInt();

            System.out.print( "Ingrese su clave: ");
            claveIngresada = sc.nextInt();
            
            if (cuentaIngresada == numCuenta && claveIngresada == clave ) {

                System.out.println("Ingresando al sistema....");
                loginExitoso = true;

            } else {
                System.out.println("Credenciales incorrectas");
                intentos ++;
            }
        } while (!loginExitoso && intentos < 3);

        if(intentos == 3){
            System.out.println("Cuenta bloqueada");
        }

           
    }   
    
    public static void transferencia(){

         sc.nextLine();
        System.out.print("Ingrese el número de cuenta de destino: ");
        String destino = sc.nextLine();
        System.out.print("Ingrese el monto a transferir: ");
        double monto = sc.nextDouble();

        if (monto > 0 && monto <= saldo) {
            System.out.println("Transferencia exitosa a la cuenta: " + destino);
            saldo -= monto;
            System.out.println("Su nuevo saldo es:  "+ saldo);
            
        } else if (monto > saldo){
            System.out.println("Saldo insuficiente");
            
        }else{
            System.out.println("Ingrese un monto valido");
        }
        sc.nextLine();
    }
    
    public static void retirar(){
        System.out.print("Ingrese el monto a retirar: ");
        double montoRetiro = sc.nextDouble();
        if (montoRetiro >0 && montoRetiro <= saldo) {
            saldo -= montoRetiro;
            System.out.println("Retire su dinero!");
            System.out.println("Su nuevo saldo es: " + saldo);
        }else if (montoRetiro > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Monto inválido");
        }

        sc.nextLine();
    }
    public static void menu () {

        int opcion;
        do {
            System.out.println("""
                \n *****MENÚ DEL SISTEMA*****
                1. Consular saldo
                2. Transferir dinero
                3. Retirar dinero
                4. Salir
                *****************************
                Por favor escoja la operación que desee realizar
                """);
        opcion = sc.nextInt();
     

                switch (opcion) {
                    case 1: 

                    // Consultar saldo
                        System.out.println("Su saldo es: " + saldo);
                        break;
                    case 2: 
                    // Transferencia
                    transferencia();
                        
                        break;
                    case 3: 

                    // Retirar dinero

                    retirar();
                        
                        break;
                    case 4: 

                    // Salir

                        System.out.println("\n Saliendo del sistema....");
                        
                        break;
                
                    default:
                        break;
                }
    

        } while (opcion != 4);
    }
}
