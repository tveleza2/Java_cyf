package Exceptions.modelos;

public class CuentaBancaria {
    private float saldoInicial;
    public CuentaBancaria(float saldo){
        this.saldoInicial=saldo;
    };
    public CuentaBancaria(){};
    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    public float getSaldoInicial() {
        return saldoInicial;
    }
    public void retirarDinero(float amount) throws SaldoInsuficienteException{
        if (this.saldoInicial-amount<0){
            throw new SaldoInsuficienteException();
        }
        this.saldoInicial = this.saldoInicial-amount;
    }
}
