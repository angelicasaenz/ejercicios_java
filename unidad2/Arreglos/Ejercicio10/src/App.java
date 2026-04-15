import java.util.Scanner;

public class App {

/*     10. Eliminar un elemento
    Llena un arreglo de 6 números y elimina un valor desplazando elementos.

    Guía:

    Busca la posición.
    Desplaza a la izquierda. */
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[6];

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese un número: ");
            arreglo[i] = sc.nextInt();
        }
        System.out.println("Ingrese el número que desea eliminar: ");
        int buscarPosicion = sc.nextInt();
        boolean existe = false;
        int posicion = -1;

        for(int i = 0; i < arreglo.length; i++){
            if (buscarPosicion == arreglo[i]) {
                posicion = i;
                existe = true;
                break;
        } 
        }

        System.out.println("Ese número no se encuentra en el arreglo");
        

    }
}
