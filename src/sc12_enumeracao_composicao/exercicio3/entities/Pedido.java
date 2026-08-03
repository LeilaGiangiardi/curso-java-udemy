package sc12_enumeracao_composicao.exercicio3.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import sc12_enumeracao_composicao.exercicio3.entities_enum.StatusPedido;

public class Pedido {
    private LocalDateTime data;
    private StatusPedido status;
    private Cliente cliente;

    private List<ItemDePedido> items = new ArrayList<>();
    
    public Pedido() {
    }

    public Pedido(LocalDateTime data, StatusPedido status, Cliente cliente) {
        this.data = data;
        this.status = status;
        this.cliente = cliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(ItemDePedido item){
        items.add(item);
    }

    public void removerItem(ItemDePedido item){
        items.remove(item);
    }

    public Double total(){
        double soma = 0;
        for (ItemDePedido i: items){
            soma += i.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        // Formatador para a data/hora exata da compra
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        StringBuilder sb = new StringBuilder();
        sb.append("RESUMO DO PEDIDO:\n");
        sb.append("Momento do pedido: ").append(data.format(fmt)).append("\n");
        sb.append("Status do pedido: ").append(status).append("\n");
        
        sb.append("Cliente: ").append(cliente).append("\n");
        
        sb.append("Itens do pedido:\n");
        
        for (ItemDePedido item : items) {
            sb.append(item).append("\n");
        }
        
        sb.append("Preço total: $").append(String.format("%.2f", total()));
        
        return sb.toString();
    }
    
}