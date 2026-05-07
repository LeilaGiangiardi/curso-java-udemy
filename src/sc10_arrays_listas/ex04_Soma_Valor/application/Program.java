package sc10_arrays_listas.ex04_Soma_Valor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        
        double[] numeros = new double[n];
        double soma = 0.0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            soma = soma+numeros[i];
        }

        System.out.println();
        System.out.print("VALORES = ");
        
        // Laço específico para imprimir os números lado a lado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Pula uma linha para não grudar nos resultados abaixo
        System.out.println(); 

        double media = soma / numeros.length;

        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}