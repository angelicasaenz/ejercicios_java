
public class App {

    
    public static void main(String[] args) throws Exception {
        
        int resultado = dobleNumero(8);
        System.out.println("El doble es " + resultado );
    }

    public static int dobleNumero(int num) {

        return num *= 2;
    }
}
