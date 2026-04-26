public class CuentaBancaria {

    // Atributos
    double saldoDisponible;
    // constructor
    public CuentaBancaria(double saldoDisponible){
        this.saldoDisponible = saldoDisponible;
    }
    // Geters
    public double getSaldoDisponible(){
        return this.saldoDisponible;
    }
    // Setters
    public void setSaldoDisponible(double saldoDisponible){
        this.saldoDisponible = saldoDisponible;
    }

    // Metodo para retirar

    public void retirar (double monto) throws SaldoInsuficienteException{
        
        if (monto > saldoDisponible) {
            throw new SaldoInsuficienteException("Operación invalida, no tiene saldo suficiente.");     
        } else {
            saldoDisponible = saldoDisponible - monto;
            System.out.println("Su nuevo saldo es: " + saldoDisponible);
            
        }
    }
}

