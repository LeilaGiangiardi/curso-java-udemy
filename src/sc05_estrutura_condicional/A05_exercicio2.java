package src.sc05_estrutura_condicional;

import java.util.Scanner;

public class A05_exercicio2 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
        sc.close();
    }
    
}
