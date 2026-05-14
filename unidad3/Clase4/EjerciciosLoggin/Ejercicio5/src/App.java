import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class App {

    public static Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) throws Exception {

        
        
        try {
            
            FileHandler archivo = new FileHandler("credenciales.log", true);
            archivo.setFormatter(new SimpleFormatter());
            logger.addHandler(archivo);

            ServicioUsuarios servicio = new ServicioUsuarios();

            Scanner sc = new Scanner(System.in);

            System.out.println("Usuario: ");
            String username = sc.nextLine();

            System.out.println("Contraseña: ");
            String password = sc.nextLine();

            servicio.validarCredenciales(username, password);
            System.out.println("Acceso concedido");

        } catch (AutenticacionException e) {
            logger.severe("Error de autenticación: " + e.getMessage());
            System.out.println("Acceso denegado: " + e.getMessage());
        }
    }
}
