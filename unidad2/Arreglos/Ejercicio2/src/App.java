import java.util.Scanner;

public class App {

    /* 2. Suma de elementos
    Crea un arreglo de 6 números enteros, llénalo con datos ingresados por el usuario y muestra la suma total de sus elementos.

    Guía:
    Usa una variable acumuladora.
    Recorre el arreglo sumando cada valor. 
    */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];
        int suma = 0;

        for(int i = 0; i < numeros.length; i ++){
            System.out.println("Ingrese un número: ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos del arreglo es: " + suma);


        sc.close();
    }
}
