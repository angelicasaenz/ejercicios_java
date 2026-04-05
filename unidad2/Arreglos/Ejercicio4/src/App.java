import java.util.Scanner;


public class App {

/*     4. Mostrar en orden inverso
    Llena un arreglo de 5 posiciones y muestra los valores en orden inverso.

    Guía:

    Recorre el arreglo desde el final hacia el inicio. */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int[] inverso = new int[5];

        for(int i =0; i <inverso.length; i++){
            System.out.println("Ingrese un número: ");
            inverso[i] = sc.nextInt();
        }

        for(int i = inverso.length - 1; i >= 0; i--){
            System.out.println("Número: " + inverso[i]);
        }

}
}
