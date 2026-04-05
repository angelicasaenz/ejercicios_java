import java.util.Scanner;

public class App {

/*     Llena un arreglo de 8 números. Luego pide un número y verifica si está en el arreglo.

    Guía:

    Usa una variable boolean.
    Recorre comparando valores. */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[8];

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese un número: ");
            arreglo[i] = sc.nextInt();
        }
        System.out.println("Ingrese el número que desea buscar: ");
        int num_buscado = sc.nextInt();
        boolean esta = false;

        for(int i = 0; i < arreglo.length; i++){
            if (num_buscado == arreglo[i]) {
                esta = true;
            }
        }
    
        if (esta == true) {
            System.out.println("EL número buscado si está");
        } else {
            System.out.println("El número buscado no está");
        }

    }
}
