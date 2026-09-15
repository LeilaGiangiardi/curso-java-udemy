package sc13_heranca_polimorfismo.ex06_imposto.entities;

public class Pessoa_juridica extends Pessoa {
    private int n_Funcionarios;

    public Pessoa_juridica() {
    }

    public Pessoa_juridica(String nome, double renda_anual, int n_Funcionarios) {
        super(nome, renda_anual);
        this.n_Funcionarios = n_Funcionarios;
    }

    public int getN_Funcionarios() {
        return n_Funcionarios;
    }

    public void setN_Funcionarios(int n_Funcionarios) {
        this.n_Funcionarios = n_Funcionarios;
    }

    @Override
    public double calc_imposto() {
        if (n_Funcionarios> 10){
            return  getRenda_anual()*0.14;
        }
        else{
            return getRenda_anual()*0.16;
        }
    }

}
