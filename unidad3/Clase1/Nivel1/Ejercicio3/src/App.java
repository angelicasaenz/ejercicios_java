import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

/*     Ejercicio 3: Lectura de archivo (Checked Exception)
    Objetivo:
    Practicar una excepción verificada (FileNotFoundException).

    Enunciado:
    Crea un programa que intente abrir un archivo llamado datos.txt.

    Si el archivo no existe, captura la excepción y muestra un mensaje indicando el problema.

    Indicaciones:
    Usa FileReader.
    Usa try-catch.
    Captura FileNotFoundException. */
    public static void main(String[] args) throws Exception {
        

        try {
            FileReader archivo = new FileReader("datos.txt");
            System.out.println("Archivo abierto correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        }
    }
}
