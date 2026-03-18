package unidad2.ejercicioPOO.src;

public class Short {

    // Atributos

    private String titulo;
    private String autor;
    private int vistas;

    // Acciones(metodos)
    
    // Constructor

    public Short(){
        titulo = "";
        autor = "";
        vistas = 0;

    }

    public Short(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }

    // Getters
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getVistas(){
        return this.vistas;
    }

    // Setters
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    
}
