public class Video {

    // Atributos
    private String titulo;

    public Video(String titulo){
        this.titulo = titulo;
    }

    // Getters

    public String getTitulo(){
        return titulo;
    }

    // Setters
    public void setTitulo(String nuevoTitulo){
        this.titulo = nuevoTitulo;

    }

    @Override
    public String toString(){
        return "Video: " + titulo;
    }
}
