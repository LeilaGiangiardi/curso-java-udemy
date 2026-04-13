package sc08_introducao_poo.ex06_static.application;

import java.util.Locale;
import java.util.Scanner;
import sc08_introducao_poo.ex06_static.util.Calculadora; // Import da classe utilitária

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        // Acesso direto via NOME DA CLASSE
        double c = Calculadora.circunferencia(raio);
        double v = Calculadora.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);

        sc.close();
    }
}