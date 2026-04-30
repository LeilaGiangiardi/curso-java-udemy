package sc09_construtores.ex01_estoque.entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    // CONSTRUTOR (Seção 9): Obriga a passagem de dados na criação do objeto
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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

    // Formatação da saída de dados
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