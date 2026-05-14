
public class CuentaBancaria {

    private double saldoDisponible;

    public CuentaBancaria(double saldoDisponible){
        this.saldoDisponible = saldoDisponible;
    }

    
    public void retirarDinero(double monto) throws SaldoInsuficienteException{

        if (monto > saldoDisponible) {
            App.logger.warning("Intento de retiro superior al saldo");
            throw new SaldoInsuficienteException("Saldo insuficiente");

        }
        App.logger.info("Retiro realizado correctamente");
        saldoDisponible -= monto;

    }

}
