package sc06_estruturas_repetitivas;

import java.util.Scanner;

public class A06_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite o valor de N:");
        int N = sc.nextInt();
        int soma = 0;

        for (int i = 1; i <= N; i++) {
            System.out.printf("Digite os valores %d a serem somados:", N);
            int x = sc.nextInt();
            soma = soma + x;
    
            }
            System.out.printf("Resultado da soma entre os %d valores: %d:", N, soma);
    }
}


