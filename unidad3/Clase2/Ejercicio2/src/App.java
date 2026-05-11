public class App {
    public static void main(String[] args) throws Exception {
        

        PlataformaCursos devSenior = new PlataformaCursos();
        Curso c1 = new Curso("Java", 30);
        Curso c2 = new Curso("Python", 20);
        Curso c3 = new Curso("Ciberseguridad", 25);


        // Caso 1 Una reserva válida
        try {
            devSenior.solicitarReserva(c1, 2);
            System.out.println("Se realizó con exito la reserva");
        } catch (CantidadInvalidaException | CuposNoDisponiblesException e) {
            System.out.println("Error: " + e.getMessage());
        }    
        // Caso 2 Una cantidad inválida
        try {
            devSenior.solicitarReserva(c2, 0);
            System.out.println("Se realizó con exito la reserva");
        } catch (CantidadInvalidaException | CuposNoDisponiblesException e) {
            System.out.println("Error: " + e.getMessage());
        }    
        // Caso 3 Cupos insuficientes

        try {
            devSenior.solicitarReserva(c3, 30);
            System.out.println("Se realizó con exito la reserva");
        } catch (CantidadInvalidaException | CuposNoDisponiblesException e) {
            System.out.println("Error: " + e.getMessage());
        }    
    
    }
}



/* Ejercicio 2: Reserva de cupos en cursos
Contexto
Una institución necesita permitir que estudiantes reserven cupos en cursos.

Cada curso tiene: - Nombre - Número de cupos disponibles

Cuando un estudiante intente reservar, el sistema debe validar: - Que la cantidad de cupos solicitados sea válida - Que existan cupos suficientes

Si ocurre un problema, debe lanzarse una excepción.

Requisitos
1. Crear la clase Curso
Debe almacenar: - Nombre - Cupos disponibles

Debe implementar el método:

reservarCupo(int cantidad)
Este método debe: - Validar la cantidad solicitada - Verificar disponibilidad de cupos - Lanzar excepciones cuando sea necesario

2. Crear la clase ServicioReservas
Debe implementar el método:

realizarReserva(Curso curso, int cantidad)
Este método debe: - Llamar al método de reserva del curso - Propagar las excepciones sin manejarlas

3. Crear la clase PlataformaCursos
Debe implementar el método:

solicitarReserva(Curso curso, int cantidad)
Este método debe: - Delegar la operación al servicio de reservas

4. Probar en Main
Debes probar los siguientes casos: - Una reserva válida - Una cantidad inválida - Cupos insuficientes

Objetivo
Practicar la propagación de excepciones en varias capas:

Curso -> ServicioReservas -> PlataformaCursos -> Main */