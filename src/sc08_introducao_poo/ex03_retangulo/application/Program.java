package sc08_introducao_poo.ex03_retangulo.application;

import java.util.Locale;
import java.util.Scanner;

import sc08_introducao_poo.ex03_retangulo.entities.Retangulo;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo rec = new Retangulo();
        System.out.println("Digite a base e altura do retangulo: ");
        rec.base = sc.nextDouble();
        rec.altura = sc.nextDouble();

        System.out.printf("Area: %.2f%n", rec.area());
        System.out.printf("perimetro = %.2f%n", rec.perimetro());
        System.out.printf("Diagonal = %.2f%n", rec.diagonal());
        sc.close();
    
    }
    
}
