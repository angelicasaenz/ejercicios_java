public class ServicioReservas {

    // Metodo realizar reserva

    public void realizarReserva(Curso curso, int cantidad) throws CantidadInvalidaException, CuposNoDisponiblesException {
        curso.reservarCupo(cantidad);
    }

}
