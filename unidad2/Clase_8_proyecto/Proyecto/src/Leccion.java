import java.util.ArrayList;
import java.util.List;

public class Leccion {

    // Atributos
    private String titulo;
    private List<Video> videos;


    // Constructor 
    public Leccion(String titulo){
        this.titulo = titulo;
        this.videos = new ArrayList<>();
    }

    // Metodo para la lista

    public void agregarVideo(String titulo){
        // composición
        videos.add(new Video(titulo));
    }

    // Getter

    public String getTitulo() {
        return this.titulo;
    }

    public String toString(){
        return"Lección: " + this.titulo;
    }
}
