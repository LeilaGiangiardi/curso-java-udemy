package src.sc05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class A09_exercicio6 {
    public static void main(String[] args) {
        // Configura o ponto como separador decimal (padrão americano)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = sc.nextDouble();

        //para representar que um número está "entre" dois valores, usamos o operador lógico &&  
        if (valor >= 0 && valor <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } 
        else if (valor > 25.0 && valor <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } 
        else if (valor > 50.0 && valor <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } 
        else if (valor > 75.0 && valor <= 100.0) {
            System.out.println("Intervalo (75,100]");
        } 
        else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}