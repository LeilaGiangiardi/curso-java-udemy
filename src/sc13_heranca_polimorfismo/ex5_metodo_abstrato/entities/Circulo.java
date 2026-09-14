package sc13_heranca_polimorfismo.ex5_metodo_abstrato.entities;

import sc13_heranca_polimorfismo.ex5_metodo_abstrato.entities.enums.Cor;

public class Circulo extends Forma {

    private double raio;

    public Circulo() {
    }

    public Circulo(Cor cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI*raio*raio;
    }


}
