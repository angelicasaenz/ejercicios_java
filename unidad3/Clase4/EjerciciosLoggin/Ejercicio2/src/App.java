import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        Logger logger = Logger.getLogger(App.class.getName());

        FileHandler archivo = new FileHandler("app.log", true);
        archivo.setFormatter(new SimpleFormatter());
        logger.addHandler(archivo);

        logger.setUseParentHandlers(false);

        logger.info("Inicio del sistema");
        logger.info("Proceso ejecutado");
        logger.info("Fin del sistema");



    }
}
