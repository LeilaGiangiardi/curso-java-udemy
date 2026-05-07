package sc10_arrays_listas.ex03_negativos.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        if (n <= 10) {
            // Primeiro loop: leitura
            for (int i = 0; i < n; i++) {
                System.out.print("Digite um número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            System.out.println("NÚMEROS NEGATIVOS:");
            // Segundo loop: filtragem
            for (int i = 0; i < n; i++) {
                if (numeros[i] < 0) {
                    System.out.println(numeros[i]);
                }
            }
        } else {
            System.out.println("Erro: O número máximo permitido é 10.");
        }

        sc.close();
    }
}