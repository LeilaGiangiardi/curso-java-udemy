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

        // Exemplo de uso do SET e GET
        produto.setNome("Computador"); // Alterando o nome via encapsulamento
        System.out.println("Nome atualizado: " + produto.getNome());

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        sc.close();
    }
}