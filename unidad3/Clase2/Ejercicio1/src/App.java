public class App {


    public static void main(String[] args) throws Exception {

        Biblioteca virgilioBarco = new Biblioteca();
        Libro l1 = new Libro("Noches Blancas", 3);
        Libro l2 = new Libro("La muerte feliz", 10);
        Libro l3 = new Libro("La peste", 2);
        

        // Solicitar prestamo
        // Libro 1
        try {
            virgilioBarco.procesarPrestamo(l1, 2);
            System.out.println("Se ha prestado correctamente el libro: " + l1.getTitulo());
        } catch (CantidadInvalidaException | LibroNoDisponibleException e) {
            System.out.println("Error con " + l1.getTitulo() + ": " + e.getMessage());
        }

        // Libro 2
        try {
            virgilioBarco.procesarPrestamo(l2, 0);
            System.out.println("Se ha prestado correctamente el libro: " + l2.getTitulo());
        } catch (CantidadInvalidaException | LibroNoDisponibleException e) {
            System.out.println("Error con " + l2.getTitulo() + ": " + e.getMessage());
        }

        // Libro 3
        try {
            virgilioBarco.procesarPrestamo(l3, 6);
            System.out.println("Se ha prestado correctamente el libro: " + l3.getTitulo());
        } catch (CantidadInvalidaException | LibroNoDisponibleException e) {
            System.out.println("Error con " + l3.getTitulo() + ": " + e.getMessage());
        }
        
    }
}




/* Ejercicio 1: Sistema de préstamo de libros
Una biblioteca necesita gestionar el préstamo de libros a sus usuarios.
Cada libro tiene:
un título,
una cantidad disponible.
Cuando un usuario solicite un préstamo, el sistema debe verificar:
que la cantidad solicitada sea mayor que cero,
que haya suficientes unidades disponibles.
Si alguna regla no se cumple, debe lanzarse una excepción personalizada.

Requisitos
1. Crear la clase Libro
Debe almacenar:

título,
cantidad disponible.
Debe implementar el método:
prestar(int cantidad)
este método debe validar:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
que la cantidad sea válida, que existan unidades disponibles.

Si ocurre un error, debe lanzar la excepción correspondiente.

2. Crear la clase Biblioteca
Debe tener el método:

procesarPrestamo(Libro libro, int cantidad)
Este método debe invocar el préstamo del libro y permitir que la excepción se propague.

3. Crear excepciones personalizadas
Debes implementar:

CantidadInvalidaException LibroNoDisponibleException

Ambas deben heredar de Exception.

4. Crear la clase Main
Debe:

crear un libro, solicitar préstamos, capturar excepciones, mostrar mensajes al usuario.

Objetivo

Practicar la propagación básica:

Libro -> Biblioteca -> Main */