package unidad2.ejercicioPOO.src;

// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner sc = new Scanner(System.in);

        Short short1 = new Short();
        short1.setAutor("Pantera");
        short1.setTitulo("Cementery Gates");

        // Ejercicio 1: Instanciar dos objetos de la clase Short usando el constructor por defecto y el constructor con parámetros
        // Con parametros
        Short short2 = new Short("Ana", "Gatos jugando");
        // Sin parametros
        Short short3 = new Short();
        short3.setAutor("Korn");
        short3.setTitulo("Freak on a leash");

        // Ejercicio 2: Instanciar dos objetos de la clase Vuelo usando el constructor por defecto y el constructor con parámetros
        //Con parametros
        Vuelo v1 = new Vuelo("Bogota", "San andres", "12/05/2026", 2);
        // Sin parametros
        Vuelo v2 = new Vuelo();
        v2.setDestino("Oslo");
        v2.setOrigen("Berlín");
        v2.setFecha("09/06/2026");
        v2.setPasajeros(3);
        
       
        //Ejercicio 3: Escribir por consola los atributos de los objetos. Tip: Debes acceder a los atributos usando métodos getters
        //ejemplo: System.out.PrintLn( miVuelo.getOrigen() );
        System.out.println(v1.getDestino(), v1.getOrigen(), v1.getFecha(), v1.getPasajeros());
        System.out.println(v2.getOrigen());
        System.out.println(short2.getAutor());
        System.out.println();

    }
}
