import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int[] arregloNormal = new int[5];
        int[] arregloInvertido = new int[5];


        for(int i = 0; i < arregloNormal.length; i++){
            System.out.println("Ingrese un número: ");
            arregloNormal[i] = sc.nextInt();
        }

        for(int j = 0, i = arregloNormal.length -1; i >= 0; i--, j++){
        arregloInvertido[j] = arregloNormal[i];

        }

        System.out.println("\nArreglo invertido:");
        for(int i = 0; i < arregloInvertido.length; i++){
            System.out.print(arregloInvertido[i] + " ");
        }
        
        sc.close();
    }
}
