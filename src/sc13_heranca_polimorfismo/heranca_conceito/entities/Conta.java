package sc13_heranca_polimorfismo.heranca_conceito.entities;

public class Conta {
    private Integer number;
    private String titular;
    protected Double saldo;
    
    public Conta() {
    }

    public Conta(Integer number, String titular, Double saldo) {
        this.number = number;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque(Double quantia) {
        saldo -= quantia;
    }

    public void depositar (Double quantia){
        saldo += quantia;
    }
}
