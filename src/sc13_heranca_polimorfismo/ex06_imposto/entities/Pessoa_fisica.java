package sc13_heranca_polimorfismo.ex06_imposto.entities;

public class Pessoa_fisica extends Pessoa {
    private double gasto_saude;

    public Pessoa_fisica() {
    }

    public Pessoa_fisica(String nome, double renda_anual, double gasto_saude) {
        super(nome, renda_anual);
        this.gasto_saude = gasto_saude;
    }

    @Override
    public double calc_imposto() {
        double impostoBasico;
        
        if (getRenda_anual()< 20000.00){
            impostoBasico = getRenda_anual()*0.15;
        }
        else{
            impostoBasico = getRenda_anual()*0.25;
        }
        
        impostoBasico = impostoBasico-(gasto_saude*0.50);

        if(impostoBasico<0.0){
            return 0.0;
        }
        return impostoBasico;
        }
    }


