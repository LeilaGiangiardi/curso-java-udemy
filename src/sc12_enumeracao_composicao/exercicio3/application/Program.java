package sc12_enumeracao_composicao.exercicio3.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import sc12_enumeracao_composicao.exercicio3.entities.Pedido;
import sc12_enumeracao_composicao.exercicio3.entities.Produto;
import sc12_enumeracao_composicao.exercicio3.entities.Cliente;
import sc12_enumeracao_composicao.exercicio3.entities.ItemDePedido;
import sc12_enumeracao_composicao.exercicio3.entities_enum.StatusPedido;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---Digite os dados do cliente--- ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite a data de nascimento (DD/MM/YYYY): ");
        String dataTexto = sc.next();
        LocalDate dataNascimento = LocalDate.parse(dataTexto, fmt);
        Cliente cliente1 = new Cliente(nome, email, dataNascimento);

        System.out.println("---Digite os dados do pedido---");
        System.out.print("Status: ");
        String statusTexto = sc.next();
        StatusPedido status = StatusPedido.valueOf(statusTexto);
        
        // Corrigido aqui (adicionado o ; no final):
        Pedido pedido1 = new Pedido(LocalDateTime.now(), status, cliente1);

        System.out.print("Quantos itens tem no pedido? ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("---Digite os dados do #" + i + " produto---");
            System.out.print("Nome do produto: ");
            sc.nextLine(); // Limpa o buffer do Enter
            String nomeProduto = sc.nextLine();
            
            System.out.print("Preço do produto: ");
            Double precoProduto = sc.nextDouble();
            
            System.out.print("Digite a quantidade: ");
            int quantidadeProduto = sc.nextInt();
           
            // Cria o produto puro
            Produto produtoX = new Produto(nomeProduto, precoProduto);
            // Associando a quantidade, o preço e o Produto
            ItemDePedido itemX = new ItemDePedido(quantidadeProduto, precoProduto, produtoX);
            // Adiciona o item pronto dentro do Pedido
            pedido1.adicionarItem(itemX);
        }
        
        System.out.println();
        System.out.println(pedido1);
        
        sc.close();
    }
}