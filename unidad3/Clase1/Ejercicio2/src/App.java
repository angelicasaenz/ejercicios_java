import java.util.Scanner;

public class App {

/*     Ejercicio 2: Acceso a arreglo (Unchecked Exception)
    Objetivo:
    Practicar ArrayIndexOutOfBoundsException.

    Enunciado:
    Declara un arreglo de 5 elementos y solicita al usuario una posición para consultar.

    Si el usuario ingresa una posición inválida, captura la excepción y muestra un mensaje adecuado.

    Indicaciones:
    Crea un arreglo con valores fijos.
    Usa Scanner.
    Captura ArrayIndexOutOfBoundsException. */

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int[] arreglo = {27, 23, 54, 26, 56};

        System.out.println("Ingrese la posición a consultar: ");
        int posicion = sc.nextInt();
        int posicionEncontrada; 
        for(int i = 0; i < arreglo.length; i++){
            if (i == posicion) {
                
            }
        }

    }
}
