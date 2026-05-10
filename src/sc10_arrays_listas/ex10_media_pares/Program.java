package sc10_arrays_listas.ex10_media_pares;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int [] vetor = new int[n];

        int somaPares = 0;
        int contPares = 0;
        for (int i=0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();

            if (vetor[i]%2 == 0){
                somaPares += vetor[i];
                contPares++;
            }
        }
        
        if (contPares == 0) {
            System.out.println("Nenhum número par");
        }       
        else {
            double media = (double) somaPares / contPares;
            System.out.printf("Média dos pares6 = %.1f%n", media);
        }
       
        sc.close();
    }
}
