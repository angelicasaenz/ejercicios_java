public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
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