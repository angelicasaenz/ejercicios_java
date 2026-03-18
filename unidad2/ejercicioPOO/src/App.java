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
        Short short2 = new Short("Linkin Park", "What I've Done ");
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
        System.out.println("VUELO 1 \n Destino: " + v1.getDestino() + ", Origen: " + v1.getOrigen() + ", Fecha: " + v1.getFecha() + ", Pasajeros: " + v1.getPasajeros());
        System.out.println("VUELO 2 \n Destino: " + v2.getDestino() + ", Origen: " + v2.getOrigen() + ", Fecha: " + v2.getFecha() + ", Pasajeros: " + v2.getPasajeros());
        System.out.println("SHORT 1 \n Autor: " +short1.getAutor() + ", Titulo: "+ short1.getTitulo());
        System.out.println("SHORT 2 \n Autor: " +short2.getAutor() + ", Titulo: "+ short2.getTitulo());
        System.out.println("SHORT 3 \n Autor: " +short3.getAutor() + ", Titulo: "+ short3.getTitulo());

    }
}
