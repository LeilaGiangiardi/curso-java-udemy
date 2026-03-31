package sc06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class A13_do_while {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp; // Variável declarada fora para ser alcançada pelo while

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            
            // Fórmula de conversão: F = 9C/5 + 32
            double F = 9.0 * C / 5.0 + 32.0;
            
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            
            System.out.print("Deseja repetir (s/n)? ");
            /* sc.next() lê a String, .charAt(0) pega apenas o primeiro caractere */
            resp = sc.next().charAt(0);
            
        } while (resp != 'n'); // Repete enquanto a resposta não for 'n'

        sc.close();
    }
}
    