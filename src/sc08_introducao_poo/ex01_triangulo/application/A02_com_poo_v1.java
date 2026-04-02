package sc08_introducao_poo.ex01_triangulo.application;

import java.util.Locale;
import java.util.Scanner;
import sc08_introducao_poo.ex01_triangulo.entities.Triangle; // Import fundamental!

public class A02_com_poo_v1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis do tipo Triangle
        Triangle x, y;
        
        // Instanciação (criação dos objetos na memória heap)
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Chamada do método (Reaproveitamento)
        double areaX = x.area();

        // Chamada do método (Reaproveitamento)    
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}