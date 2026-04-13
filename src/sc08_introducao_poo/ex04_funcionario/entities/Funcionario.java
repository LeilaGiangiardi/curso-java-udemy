package sc08_introducao_poo.ex04_funcionario.entities;

public class Funcionario {
    public String name;
    public double salario_bruto;
    public double imposto;

    public double salario(){
        return salario_bruto-imposto;
    }

    public void salario_porcentagem(double porcentagem){
        salario_bruto += salario_bruto*porcentagem/100.0;
    }

    @Override
    public String toString() {
        return name + ", $" + String.format("%.2f", salario());
    }

    
}
