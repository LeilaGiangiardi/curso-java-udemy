package sc05_estrutura_condicional;

import java.util.Scanner;

public class A04_exercicio1 {
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();

        if (num>0) {
            System.out.println("O número é positivo");
        }
        else{
            System.out.println("O número é negativo");
        }
        sc.close();
        
    }
    
}
