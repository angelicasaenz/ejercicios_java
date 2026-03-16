package clase6;

import java.util.Scanner;

public class industrial {
    
    static Scanner sc = new Scanner(System.in);
    static int stockMatPrima = 500;
    static int matPrimaxPieza = 25;
    static int prodMax = 20;
    static String danioMaquina;
    static int piezasProducir; 
    public static void main(String[] args) throws Exception{
        operario();
        menu();
    }

    public static void operario() {

        int codEmpleado = 4567;
        int turno = 0;
        int codIngresado;
        int intentos = 0;
        do {
            System.out.print("Ingrese su código de empleado: ");
            codIngresado = sc.nextInt();
            System.out.print("Ingrese su turno: ");
            turno = sc.nextInt();
            
            if (codEmpleado == codIngresado && turno > 0 && turno <= 3) {
                System.out.println("Acceso permitido");
                
            } else {
                System.out.println("Acceso denegado");
                intentos++;
            }
        } while (intentos > 3);

        sc.nextLine();

    }

    public static void menu(){

        int opcion;
        boolean maquinaOperando;
        do {
            System.out.println("""
                ***** MENÚ DE PRODUCCIÓN *****

                1. Producir piezas
                2. Ver stock de materia prima
                3. Reportar daño de máquina
                4. Cerrar turno

                ******************************
                """);
        System.out.println("Por favor elija la operación que va a realizar");
        opcion = sc.nextInt();
        maquinaOperando = true;

        switch (opcion) {
            case 1:
                // Producir piezas
                System.out.print("Ingrese el número de piezas a producir: ");
                piezasProducir = sc.nextInt();
                double materiaNecesaria = piezasProducir * matPrimaxPieza;
                if (piezasProducir > 0 && piezasProducir <= prodMax) {
                    stockMatPrima -= (piezasProducir * 25);
                    System.out.println("Producción realizada con exito");
                    System.out.printf("Stock restante: %d kg", stockMatPrima );
                } else if (stockMatPrima < materiaNecesaria) {
                    System.out.println("No hay suficiente materia prima");
                } else {
                    System.out.println("Ingrese un número valido de piezas a poducir");
                }
                break;
            case 2:
                //Ver stock de materia prima
                System.out.println("Materia prima en stock: " + stockMatPrima);
                
                break;
            case 3:
                //Reportar daño en máquina
                System.out.print("Ingrese el daño presentado en la máquina: ");
                sc.nextLine();
                danioMaquina = sc.nextLine();
                maquinaOperando = false;
                if (!maquinaOperando) {
                    
                    System.out.println("Maquina en mantenimiento");
                    System.out.println("Producción detenida!!!");
                }
    
                break;
            case 4:
                //Cerrar turno
                System.out.printf("""
                        *** CIERRE DE TURNO ***
                        Durante el turno se presentaron las siguientes novedades:
                        Total de piezas producidas: %d
                        Materia prima restante: %d
                        Estado final de la máquina: %s
                        """, piezasProducir, stockMatPrima, danioMaquina);
                
                break;
            default:
                System.out.println("Opción invalida, intente nuevamente");
                break;
        }
        } while (opcion != 4);
    }

}
