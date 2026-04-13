package sc08_introducao_poo.ex02_estoque.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        // O "this" referencia o atributo da classe para não confundir com o parâmetro
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // Sobrecarga do método toString para facilitar a exibição
    public String toString() {
        return name 
            + ", $ " 
            + String.format("%.2f", price) 
            + ", " 
            + quantity 
            + " units, Total: $ " 
            + String.format("%.2f", totalValueInStock());
    }

    
}
