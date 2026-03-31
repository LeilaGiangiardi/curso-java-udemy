package sc06_estruturas_repetitivas;

import java.util.Scanner;

public class A02_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* * PROBLEMA EXEMPLO:
         * Ler números inteiros até que um zero seja lido. 
         * Ao final, mostrar a soma dos números lidos.
         */

        System.out.print("Digite um número (0 para sair): ");
        int x = sc.nextInt();
        int soma = 0;

        // A estrutura repete ENQUANTO a condição for verdadeira
        while (x != 0) {
            soma = soma + x; // Acumula o valor na variável soma
            System.out.print("Digite outro número: ");
            x = sc.nextInt(); // Lê o próximo número para reavaliar a condição
        }

        System.out.println("SOMA FINAL = " + soma);

        sc.close();
        
    }
    
}
