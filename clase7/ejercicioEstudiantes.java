package clase7;

import java.util.Scanner;

public class ejercicioEstudiantes {
    
    static Scanner sc = new Scanner(System.in);
    static String estudiante;
    static double nota1;
    static double nota2;
    static double nota3;
    static double promedio;

    public static void main(String[] args) {
        
        
        int opcion = 0;
        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();

        switch (opcion) {
            case 1:
                infoEstudiante();
                break;
            case 2:
                mostrarInfo();
                break;
            case 3:
                double prom = calcularProm();
                System.out.printf("El promedio del estudiante %s es: %.2f", estudiante, prom);
                System.out.println();
                break;
            case 0:
                System.out.println("Saliendo del sistema...");
                break;
        
            default:
                break;
        }
        } while (opcion > 0 && opcion < 4);

        
        
    }

    //Creación del menú

    public static void menu() {

        System.out.println("""
                --- Sistema de Registro de Estudiantes ---

                    1. Registrar datos de un estudiante
                    2. Mostrar datos del estudiante actual
                    3. Calcular promedio de notas del estudiante actual
                    0. Salir
                    Ingrese su opción:
                """);
        
    }

    // Registrar información del estudiante
    public static void infoEstudiante(){
         
        System.out.println("Por favor ingrese el nombre del estudiante: ");
        estudiante =  sc.nextLine();
        while (!validarNombre(estudiante)) {
            System.out.println("Nombre invalido, ingrese nuevamente: ");
            estudiante = sc.nextLine();
        }
        System.out.println("Ingrese la nota 1: ");
        nota1 = sc.nextDouble();
        while (!validarNota(nota1)) {
            System.out.println("Nota invalida, ingrese nuevamente: ");
            nota1 = sc.nextDouble();
        }
        System.out.println("Ingrese la nota 2: ");
        nota2 = sc.nextDouble();
        while (!validarNota(nota2)) {
            System.out.println("Nota invalida, ingrese nuevamente: ");
            nota2 = sc.nextDouble();
        }
        System.out.println("Ingrese la nota 3: ");
        nota3 = sc.nextDouble();
        while (!validarNota(nota3)) {
            System.out.println("Nota invalida, ingrese nuevamente: ");
            nota3 = sc.nextDouble();
        }


    }

    // Mostrar información del estudiante
    public static void mostrarInfo(){

        System.out.printf("El Estudiante %s, tiene las siguientes notas: Nota 1: %.2f, Nota 2: %.2f, Nota 3: %.2f", estudiante, nota1, nota2, nota3);
        System.out.println(" ");
    }

    // Calcular promedio del estudiante
    public static double calcularProm(){
        return (nota1+nota2+nota3)/3;
    }

    // Validar nota
    public static boolean validarNota (double nota){
        if (nota >=0 && nota <=100 ) {
            return true;
        } else {
            return false;
        }
    }

    // Validar nombre
    public static boolean validarNombre (String nombre){
        if (nombre.equals(" ") || nombre.equals("" ) || nombre.equals("       ")) {
            return false;
        } else {
            return true;
        }
    }
}
