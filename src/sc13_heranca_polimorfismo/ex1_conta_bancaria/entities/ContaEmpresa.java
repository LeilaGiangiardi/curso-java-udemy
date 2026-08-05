package sc13_heranca_polimorfismo.ex1_conta_bancaria.entities;

public class ContaEmpresa extends Conta{
    private Double LimiteEmprestimo;
    
    private ContaEmpresa(){
        super();
    }

    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        LimiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return LimiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        LimiteEmprestimo = limiteEmprestimo;
    }
    
    public void emprestimo(double quantia){
        if (quantia <= LimiteEmprestimo){
            saldo += quantia - 10.0;
        }
    }
}
