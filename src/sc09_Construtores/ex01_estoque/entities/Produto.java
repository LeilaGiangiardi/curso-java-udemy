package sc09_construtores.ex01_estoque.entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    // 1. CONSTRUTOR PADRÃO
    // Permite criar o objeto vazio: new Produto()
    public Produto() {
    }

    // 2. CONSTRUTOR COMPLETO
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // 3. SOBRECARGA: Construtor sem a quantidade
    // Útil quando o produto inicia com estoque zero por padrão
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        //this.quantidade = 0; // Opcional, Java já inicia int com 0
    }

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome 
            + ", R$ " 
            + String.format("%.2f", preco) 
            + ", " 
            + quantidade 
            + " unidades, Total: R$ " 
            + String.format("%.2f", valorTotalEmEstoque());
    }
}