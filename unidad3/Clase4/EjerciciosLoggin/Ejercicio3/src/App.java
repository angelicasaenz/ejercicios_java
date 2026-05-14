import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class App {

    public static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) throws Exception {

        FileHandler archivo = new FileHandler("inventario.log", true);
        archivo.setFormatter(new MiFormato());
        logger.addHandler(archivo);

        Inventario i1 = new Inventario();
        i1.registrarMovimientos();
        
    }
}
