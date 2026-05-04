package sc09_Construtores.ex01_estoque.entities;

public class Produto {

    // Atributos agora são PRIVADOS para garantir o encapsulamento
    private String nome;
    private double preco;
    private int quantidade;

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

    // --- MÉTODOS GETTERS E SETTERS ---
    // Gerados automaticamente no VS Code (Source Action > Generate Getters and Setters)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Apenas o GET para quantidade. 
    // A alteração deve ser feita apenas pelos métodos adicionar/remover.
    public int getQuantidade() {
        return quantidade;
    }

    // --- MÉTODOS DE REGRA DE NEGÓCIO ---

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