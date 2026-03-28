import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        

        // Constructor sin parametros
        Gamer g1 = new Gamer();
        g1.setUsername("juanpis_06");
        g1.setFavGame("Fifa");
        g1.setLevel(45);
        g1.setWinMatches(23);

        // Contructor con parametros
        Gamer g2 = new Gamer("ange_96", "Spiderman", 89, 58);

        // Ingreso de datos por consola
        Gamer g3 = new Gamer();
        System.out.println("Ingrese el nombre del jugador: ");
        String username = sc.nextLine();
        g3.setUsername(username);
        System.out.println("Ingrese su juego favorito: ");
        String favGame = sc.nextLine();
        g3.setFavGame(favGame);
        System.out.println("Ingrese el nivel en el que va: ");
        int level = sc.nextInt();
        g3.setLevel(level);
        System.out.println("Ingrese el número de partidas ganadas: ");
        int winMatches = sc.nextInt();
        g3.setWinMatches(winMatches);

        

    } 
}
