package src.secao04;

import java.util.Locale;
import java.util.Scanner;

public class A05_exercicio1 {
    public static void main(String[] args) {
        
        /*faça um programa para ler dois valores inteiros
        e depois mostrar na tela a soma desses números com 
        uma mensagem explicativa */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, y;
        int resultado;

        System.out.println("Digite dois numero inteiros para ser feita a soma:");
        x = sc.nextInt();
        y = sc.nextInt();

        resultado = x + y;
        System.out.println("Resultado: "+resultado);

        sc.close();
    }
}
