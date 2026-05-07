package sc10_arrays_listas.ex02_Produtos.application;

import java.util.Locale;
import java.util.Scanner;
import sc10_arrays_listas.ex02_Produtos.entities.Produto;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos deseja cadastrar? ");
        int n = sc.nextInt();
        
        // Criando o vetor de referências (ainda estão todas como 'null')
        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine(); // Limpeza do buffer (para não pular o nome!)
            System.out.print("Nome do produto " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.print("Preço do produto " + (i + 1) + ": ");
            double preco = sc.nextDouble();
            
            // Instanciando o objeto e guardando a referência no vetor
            vetor[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            // Acessamos o preço usando o método GET do objeto naquela posição
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;

        System.out.println();
        System.out.printf("PREÇO MÉDIO = %.2f%n", media);

        sc.close();
    }
}