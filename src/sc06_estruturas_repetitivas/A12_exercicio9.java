package sc06_estruturas_repetitivas;

import java.util.Scanner;

public class A12_exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas (N): ");
        int n = sc.nextInt();

        // O laço percorre de 1 até N
        for (int i = 1; i <= n; i++) {
            
            int quadrado = i * i;      // Cálculo do i ao quadrado
            int cubo = i * i * i;      // Cálculo do i ao cubo

            // Imprime os três valores separados por espaço em cada linha
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
        }

        sc.close();
    }
}