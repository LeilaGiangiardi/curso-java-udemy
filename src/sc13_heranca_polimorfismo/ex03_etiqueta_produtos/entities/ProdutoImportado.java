package sc13_heranca_polimorfismo.ex03_etiqueta_produtos.entities;

public class ProdutoImportado extends Produto {
    private Double taxas;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxas) {
        super(nome, preco);
        this.taxas = taxas;
    }

    public Double getTaxas() {
        return taxas;
    }

    public void setTaxas(Double taxas) {
        this.taxas = taxas;
    }

    public Double precoTotal() {
        return getPreco() + taxas; 
    }

    @Override
    public String etiqueta() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome());
        sb.append(" - $ ");
        sb.append(String.format("%.2f", precoTotal())); 
        sb.append(" (Taxa alfandegária: $ ");
        sb.append(String.format("%.2f", taxas)); 
        sb.append(")");
        return sb.toString();
    }
}