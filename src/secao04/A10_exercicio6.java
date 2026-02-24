package src.secao04;

import java.util.Locale;
import java.util.Scanner;

public class A10_exercicio6 {
    public static void main(String[] args) {
        /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: 
        A, B e C. Em seguida, calcule e mostre: 
        a) a área do triângulo retângulo que tem A por base e C por altura. 
        b) a área do círculo de raio C. (pi = 3.14159) 
        c) a área do trapézio que tem A e B por bases e C por altura. 
        d) a área do quadrado que tem lado B. 
        e) a área do retângulo que tem lados A e B. */

        Locale.setDefault(Locale.US);

        double a;
        double b;
        double c;
        double triangulo;
        double circulo;
        double trapezio;
        double quadrado;
        double retangulo;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor de A: ");
        a = sc.nextDouble();
        System.out.println("digite o valor de B: ");
        b = sc.nextDouble();
        System.out.println("digite o valor de C: ");
        c = sc.nextDouble();

        triangulo = (a*c)/2;
        circulo = 3.14159 * Math.pow(c, 2);
        trapezio = ((a+b)*c)/2;
        quadrado = b*b;
        retangulo = a*b;

        System.out.println("RESULTADOS");

        System.out.printf("Triangulo:%.3f%n",triangulo);
        System.out.printf("Circulo:%.3f%n",circulo);
        System.out.printf("trapezio:%.3f%n",trapezio);
        System.out.printf("Quadrado:%.3f%n",quadrado);
        System.out.printf("Retangulo:%.3f%n",retangulo);

        sc.close();

    }
    
}
