package sc10_arrays_listas.ex09_abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double [] vetor = new double[n];

        double soma = 0;
        for (int i = 0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        
        double media = soma/vetor.length;
        System.out.printf("Média do vetor = %.3f%n", media);

        System.out.println("Elementos abaixo da média:");
        double abaixoMedia = 0;
        for (int i = 0; i<vetor.length; i++){
            if (vetor[i]<media){
                System.out.printf("%.1f%n", vetor[i]);
            }
        }
        sc.close();
}
}