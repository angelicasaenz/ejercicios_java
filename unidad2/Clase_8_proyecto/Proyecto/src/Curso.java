import java.util.ArrayList;
import java.util.List;

public class Curso {

    // Atributos
    private Long id;
    private String nombre;

    private Profesor profesor; // asociación
    private List<Leccion> lecciones; // composición
    private List<Registro> registros; // Asociación

    public Curso(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.lecciones = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarLeccion(String titulo) { 
        lecciones.add(new Leccion(titulo)); //composición
    }

    public void agregarRegistro(Registro registro) {
        registros.add(registro); //asociación
    }

    public List<Leccion> getLecciones() {
        return this.lecciones;
    }

    public List<Registro> getRegistros() {
        return this.registros;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String toString() {
        return "Curso: " + this.nombre;
    }

}
