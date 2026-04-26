public class App {

/*     Ejercicio 7: Excepción personalizada en una clase
    Objetivo:
    Aplicar excepciones personalizadas dentro de métodos.

    Enunciado:
    Crea una clase CuentaBancaria con un método retirar(double monto).

    Si el monto es mayor que el saldo disponible, debe lanzar una excepción personalizada llamada SaldoInsuficienteException.

    Indicaciones:
    Crear la excepción personalizada.
    Crear el método retirar.
    Usar throw.
    Manejar la excepción en main. */

    public static void main(String[] args) throws Exception {

        CuentaBancaria c1 = new CuentaBancaria(300000);
        
        try {
            c1.retirar(200000);
            System.out.println("Retiro exitoso");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
