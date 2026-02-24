package src.sc04_estrutura_sequencial;

import java.util.Scanner;

public class A07_exercicio3 {
    public static void main(String[] args) {
       
        /*Faça um programa para ler quatro valores inteiros a,b,c,d
        e calculo e mostre a diferença do produto de a e b 
        pelo produto de c e d 
        formula: diferença = (a*b - c*d) */

        int a;
        int b;
        int c;
        int d;
        int diferença;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quatro numero inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferença = ((a*b)-(c*d));
        System.out.println("Diferença: "+diferença);


        sc.close();
    }
    
}
