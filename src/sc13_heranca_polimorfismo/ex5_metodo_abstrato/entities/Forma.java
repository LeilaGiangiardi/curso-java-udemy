package sc13_heranca_polimorfismo.ex5_metodo_abstrato.entities;

import sc13_heranca_polimorfismo.ex5_metodo_abstrato.entities.enums.Cor;

public abstract class Forma {
    private Cor cor;
    
    public Forma() {
    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract double area();
}
