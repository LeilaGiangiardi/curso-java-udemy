package sc09_construtores.ex01_estoque.application;

import java.util.Locale;
import java.util.Scanner;
import sc09_construtores.ex01_estoque.entities.Produto;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        // Exemplo usando a SOBRECARGA (Sem quantidade inicial)
        Produto produto = new Produto(nome, preco);

        System.out.println();
        System.out.println("Dados do produto (Estoque inicial zero): " + produto);

        System.out.println();
        System.out.print("Digite o número de produtos a serem adicionados ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}