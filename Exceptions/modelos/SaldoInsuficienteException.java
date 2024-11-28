package Exceptions.modelos;

public class SaldoInsuficienteException extends Exception{
    private String message="No hay suficiente dinero en la cuenta para realizar la operacion.";
    public SaldoInsuficienteException(){};
    @Override
    public String getMessage() {
        return message;
    }
}
