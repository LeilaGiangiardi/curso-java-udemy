package src.secao04;

import java.util.Locale;

public class A01_saida {

    public static void main(String[] args) {
         //como fazer um print formatado 
        double x = 10.35784;
        System.out.printf("%.2f%n", x);     
        System.out.printf("%.2f\n", x);

        //imprimir com ponto
        //Locale.setDefault(Locale.US);  //mudar a localização
        System.out.printf("%.2f\n", x);

        //concatenar
        System.out.println("Resultado = " + x + " Metros");
    
        //concatenar e formatar
        System.out.printf("Resultado = %.2f metros%n", x);
    
        //concatenar varios tipos de variaveis
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha RS %.2f reais%n", nome, idade, renda);


        //exercicio
        String product1 = "computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("products");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n", product2, price2);
    
        System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);
        
        System.out.printf("Measue with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}

