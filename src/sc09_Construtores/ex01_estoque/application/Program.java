package sc09_construtores.ex01_estoque.application;

import java.util.Locale;
import java.util.Scanner;
import sc09_construtores.ex01_estoque.entities.Produto; // Seu import customizado

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1. Leitura dos dados em variáveis auxiliares
        System.out.println("Entre com os dados do produto:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        
        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        // 2. Instanciação do objeto usando o CONSTRUTOR (Seção 9)
        // O objeto Produto nasce aqui já com os dados obrigatórios
        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        // 3. Adição de produtos
        System.out.println();
        System.out.print("Digite o número de produtos a serem adicionados ao estoque: ");
        int qtdAdicionar = sc.nextInt();
        produto.adicionarProdutos(qtdAdicionar);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        // 4. Remoção de produtos
        System.out.println();
        System.out.print("Digite o número de produtos a serem removidos do estoque: ");
        int qtdRemover = sc.nextInt();
        produto.removerProdutos(qtdRemover);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}