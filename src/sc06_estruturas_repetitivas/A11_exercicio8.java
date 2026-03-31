package sc06_estruturas_repetitivas;

import java.util.Scanner;

public class A11_exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        // Começamos com 1 pois é o elemento neutro da multiplicação
        int fat = 1;

        /* O loop percorre de N até 1, multiplicando os valores
           Se N for 0, o loop nem inicia e o resultado permanece 1. */
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}