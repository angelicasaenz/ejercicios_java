public class Profesor {

    // Atributos
    private Long id;
    private String nombre;
    

    // Constructor 
    public Profesor(Long id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    // Getters

    public Long getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }

    // Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Profesor: " + nombre;
    }

}
