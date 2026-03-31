package sc05_estrutura_condicional;
import java.util.Scanner;

public class A06_exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo os dois valores inteiros 
        System.out.println("Digite dois números inteiros:");
        int A = sc.nextInt();
        int B = sc.nextInt();

        // || -> "OU"
        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Nao são multiplos");
        }

        sc.close();
    }
}

