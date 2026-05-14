import java.util.logging.Logger;

public class ServicioUsuarios {

    public static Logger logger = Logger.getLogger(AutenticacionException.class.getName());

    public void validarCredenciales(String username, String password) throws AutenticacionException{

        if(!username.equals("admin") && !password.equals("1234")){
             
            logger.warning("Acceso denegado");
            throw new AutenticacionException("Credenciales invalidas");
        }
            logger.info("Sesión iniciada");
            
    }
}
