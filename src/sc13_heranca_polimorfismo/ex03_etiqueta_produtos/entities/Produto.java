package sc13_heranca_polimorfismo.ex03_etiqueta_produtos.entities;

public class Produto {
    private String nome;
    private Double preco; 
    
    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public String etiqueta() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(" - $ ");
        sb.append(String.format("%.2f", preco)); // Ajustado para %.2f
        return sb.toString();
    }
}