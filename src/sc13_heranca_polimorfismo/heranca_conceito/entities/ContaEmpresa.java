package sc13_heranca_polimorfismo.heranca_conceito.entities;

public class ContaEmpresa extends Conta{
    private Double LimiteEmprestimo;
    
    private ContaEmpresa(){
        super();
    }

    public ContaEmpresa(Integer number, String titular, Double saldo, Double limiteEmprestimo) {
        super(number, titular, saldo);
        LimiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return LimiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        LimiteEmprestimo = limiteEmprestimo;
    }
    
    public void limite(double quantia){
        if (quantia <= LimiteEmprestimo){
            saldo += quantia - 10.0;
        }
    }
}
