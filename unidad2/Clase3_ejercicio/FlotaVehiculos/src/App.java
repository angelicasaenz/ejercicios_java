
public class App {
    public static void main(String[] args) throws Exception {
        
        Coche miCoche = new Coche("Toyota", "Tacoma", 2022, 4);
        Motocicleta miMotocicleta = new Motocicleta("TVS", "Rider", 2025, 125);
        Camion miCamion = new Camion("Volvo", "FMX", 2016, 95);

        miCoche.mostrarInformacion();
        miCoche.mover();
        miMotocicleta.mostrarInformacion();
        miMotocicleta.mover();
        miCamion.mostrarInformacion();
        miCamion.mover();
    }

}
