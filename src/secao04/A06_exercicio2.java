package src.secao04;

import java.util.Locale;
import java.util.Scanner;

public class A06_exercicio2 {
    public static void main(String[] args) {
        /*Faça um programa para ler o valor do raio de um circulo, 
        e depois mostrar o valor da área deste cículo com quatro casas decimais*/

        Locale.setDefault(Locale.US);
        double raio;
        double area;
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        raio = sc.nextDouble();
        
        area = pi * Math.pow(raio, 2);

        System.out.printf("Resultado %.4f", area);

        sc.close();


    }
}
