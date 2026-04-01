
public class App {
    public static void main(String[] args) throws Exception {
        
        Coche miCoche = new Coche("Toyota", "Tacoma", 2022, 4);
        Motocicleta miMoto = new Motocicleta("TVS", "Rider", 2025, 125);
        Camion miCamion = new Camion("Volvo", "FMX", 2016, 95);

        miCoche.mostrarInformacion();
        miCoche.mover();
        miMoto.mostrarInformacion();
        miMoto.mover();
        miCamion.mostrarInformacion();
        miCamion.mover();

        System.out.println("\n--- Demostración de Polimorfismo (Vehiculo) ---");
        Vehiculo vehiculo1 = miCoche;
        Vehiculo vehiculo2 = miMoto;
        Vehiculo vehiculo3 = miCamion;

        vehiculo1.mostrarInformacion();
        vehiculo1.mover();
        System.out.println("---");
        vehiculo2.mostrarInformacion();
        vehiculo2.mover();
        System.out.println("---");
        vehiculo3.mostrarInformacion();
        vehiculo3.mover();

        System.out.println("\n--- Demostración de Polimorfismo (Arrancable) ---");
        Arrancable arrancable1 = miCoche;
        Arrancable arrancable2 = miMoto;

        arrancable1.arrancar();
        arrancable2.arrancar();
    }

}
