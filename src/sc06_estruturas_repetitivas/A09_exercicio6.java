package sc06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class A09_exercicio6 {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US); // Garante o uso do ponto decimal (.)
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de casos de teste (N): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            
            // Leitura dos 3 valores reais
            double v1 = sc.nextDouble();
            double v2 = sc.nextDouble();
            double v3 = sc.nextDouble();

            // Cálculo da média ponderada
            double media = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0) / 10.0;

            // Saída formatada com uma casa decimal
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}