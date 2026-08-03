package sc12_enumeracao_composicao.exercicio3.entities;

public class ItemDePedido {
    private Integer quantidade;
    private Double preco;
    private Produto produto;
    
    public ItemDePedido() {
    }

    public ItemDePedido(Integer quantidade, Double preço, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preço;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreço() {
        return preco;
    }

    public void setPreço(Double preço) {
        this.preco = preço;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal() {
        return quantidade * preco;
    }
    @Override
    public String toString() {
        return produto.getNome() 
                + ", $" 
                + String.format("%.2f", preco) 
                + ", Quantidade: " 
                + quantidade 
                + ", Subtotal: $" 
                + String.format("%.2f", subTotal()); 
    }
}
