package sc13_heranca_polimorfismo.ex03_etiqueta_produtos.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {
    private LocalDate dataFabricacao;
    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
        super(nome, preco); 
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiqueta() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append(getNome());
        sb.append(" (usado) - $ "); 
        sb.append(String.format("%.2f", getPreco())); 
        sb.append(" (Data de fabricação: ");
        sb.append(dataFabricacao.format(fmt));
        sb.append(")");
        return sb.toString();
    }
}