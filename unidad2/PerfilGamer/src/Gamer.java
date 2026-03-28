public class Gamer {

    // Atributos
    private String username;
    private String favGame;
    private int level;
    private int winMatches;

    // Metodos

    // Constructor vacio
    public Gamer(){
        username = "";
        favGame = "";
        level = 0;
        winMatches = 0;

    }
    // Constructor con parametros
    public Gamer(String username, String favGame, int level, int winMatches){
        this.username = username;
        this.favGame = favGame;
        this.level = level;
        this.winMatches = winMatches;
    }

    // Getters

    public String getUsername(){
        return this.username;
    }
    public String getFavGame(){
        return this.favGame;
    }
    public int getLevel(){
        return this.level;
    }
    public int getWinMatches(){
        return this.winMatches;
    }

    // Setters

    public void setUsername(String username){
        this.username = username;
    }
    public void setFavGame(String favGame){
        this.favGame = favGame;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setWinMatches(int winMatches){
        this.winMatches = winMatches;
    }
}
