package ejercicosTutoria;

import java.util.Scanner;

public class ejercicio1 {

    static Scanner sc  = new Scanner(System.in);
    static String usuario = "admin";
    static int clave = 1234;
    public static void main(String[] args) {

        login();
    }

    
    public static void login() {

        String usuarioIngresado;
        int claveIngresada;
        int intentos = 0;
        boolean loginExitoso = false;

        do {
            System.out.print("Ingrese su usuario: " );
        usuarioIngresado = sc.nextLine();
        
        System.out.print("Ingrese su contraseña: ");
        claveIngresada = sc.nextInt();
        sc.nextLine();

        if (usuarioIngresado.equals(usuario) && claveIngresada == clave) {
            System.out.println("Acceso permitido");
            loginExitoso = true;
        } else {
            System.out.println("El usuario o contraseña son incorrectos tiene X oportunidades restantes antes que su usuario sea bloqueado");
            intentos++;
        }
        } while (!loginExitoso && intentos < 3);
        

    if (intentos == 3) {

        System.out.println("Acceso bloqueado");
        
    }

    }
    
}
