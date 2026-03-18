
package unidad1.clase8.vsModularEjercicio1.src;

import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        String nombre = leerNombre(sc);
        int edad = leerEdad(sc);

        if (esMayorEdad(edad)) {
            System.out.println("Bienvenido: "+ nombre+ ", registro permitido.");
        } else {
            System.out.println("Lo sentimos "+ nombre+ ", debes ser mayor de edad.");
        }
    }

    // Leer nombre
    public static String leerNombre(Scanner entrada) {
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }

    // Leer edad
    public static int leerEdad(Scanner entrada) {
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        return edad;
    }


    // Validar edad
    public static boolean esMayorEdad(int edad) {
        return edad >= 18;
    }
}
