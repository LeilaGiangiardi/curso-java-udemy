package sc10_arrays_listas.ex01_vetores.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas alturas você vai digitar? ");
        int n = sc.nextInt();
        
        // Criando o vetor (array) de números reais com 'n' posições
        double[] vetor = new double[n];

        // Primeiro laço: Leitura dos dados
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }

        // Segundo laço: Soma de todos os elementos do vetor
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        // Cálculo da média
        double media = soma / n;

        System.out.println();
        System.out.printf("ALTURA MÉDIA: %.2f%n", media);

        sc.close();
    }
}