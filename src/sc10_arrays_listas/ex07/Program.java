package sc10_arrays_listas.ex07;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i=0; i<vetor.length;i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            }

        double maior = vetor[0];
        int posicaoMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("Maior valor:  %.1f%n", maior);
        System.out.println("Posição do maior valor: " + posicaoMaior);
        
        sc.close();

        
    }
}

