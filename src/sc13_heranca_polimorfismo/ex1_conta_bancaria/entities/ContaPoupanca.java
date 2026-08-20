package sc13_heranca_polimorfismo.ex1_conta_bancaria.entities;


// 1. FINAL EM CLASSES:
// Se colocarmos 'final' na declaração da classe (public final class ContaPoupanca),
// NENHUMA outra classe poderá herdar (extends) de ContaPoupanca.
// Isso garante segurança (ninguém vai criar uma sub-poupança) 

public final class ContaPoupanca extends Conta{
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
    
    // 2. FINAL EM MÉTODOS:
    // A palavra 'final' aqui garante que este método NÃO poderá ser sobreposto (@Override) 
    // caso alguma classe herde de ContaPoupanca no futuro.
    // protege regras de negócio que não podem mudar
    @Override //procura o metodo na superclasse
    public final void saque(Double quantia){
        saldo -= quantia; // Sem a taxa de 5.0
    }
    
    
}
