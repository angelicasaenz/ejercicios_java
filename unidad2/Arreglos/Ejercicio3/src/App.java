import java.util.Scanner;

public class App {

/*     3. Promedio de notas
    Almacena 4 notas en un arreglo y calcula el promedio.

    Guía:

    Usa tipo double.
    Suma y divide entre la cantidad de elementos. */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];

        double suma = 0;
        double promedio = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Ingrese la nota: ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        promedio = suma/notas.length;

        System.out.println("El promedio es: " + promedio);
    }
}
