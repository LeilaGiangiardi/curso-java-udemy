package sc13_heranca_polimorfismo.ex02_calculo_salario.entities;

public class Terceirizado extends Funcionario {
    private Double pagamentoExtra;

    public Terceirizado() {
        super();
    }

    public Terceirizado(String name, Integer horas, Double valorPorHora, Double pagamentoExtra) {
        super(name, horas, valorPorHora);
        this.pagamentoExtra = pagamentoExtra;
    }

    public Double getPagamentoExtra() {
        return pagamentoExtra;
    }

    public void setPagamentoExtra(Double pagamentoExtra) {
        this.pagamentoExtra = pagamentoExtra;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + pagamentoExtra * 1.1;
    }
}