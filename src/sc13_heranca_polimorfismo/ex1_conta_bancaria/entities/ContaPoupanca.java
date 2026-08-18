package sc13_heranca_polimorfismo.ex1_conta_bancaria.entities;

public class ContaPoupanca extends Conta{
    private Double taxaDeJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
        super(numero, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    
    public void atualizarSaldo (){
        saldo += saldo*taxaDeJuros;
    }
    
    @Override //procura o metodo na superclasse
    public void saque(Double quantia){
        saldo -= quantia; // Sem a taxa de 5.0
    }
    
    
}
