public class PlataformaCursos {

    // Metodo solicitar reserva
    ServicioReservas servicio = new ServicioReservas();

    public void solicitarReserva(Curso curso, int cantidad) throws CantidadInvalidaException, CuposNoDisponiblesException {
        servicio.realizarReserva(curso, cantidad);
    }

}
