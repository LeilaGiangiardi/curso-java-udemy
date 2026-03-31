package sc06_estruturas_repetitivas;

import java.util.Scanner;

public class A08_exercicio5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

    
        System.out.print("Quantos valores você vai digitar? ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        // O loop repete exatamente N vezes
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            // Lógica de intervalo: entre 10 e 20 
            if (x >= 10 && x <= 20) {
                in++; 
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}