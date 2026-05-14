import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class App {

    public static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) throws Exception {

        try {
            FileHandler archivo = new FileHandler("historial.log", true);
            archivo.setFormatter(new SimpleFormatter());
            logger.addHandler(archivo);

            CuentaBancaria c1 = new CuentaBancaria(1000000);

            c1.retirarDinero(300000);
        } catch (SaldoInsuficienteException e) {
            logger.severe("Error al retirar dinero " + e.getMessage());
        
        }
    }
}
