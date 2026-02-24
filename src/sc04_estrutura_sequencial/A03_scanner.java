package src.sc04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class A03_scanner {
    public static void main(String[] args) {

        // defindo local para imprimir com ponto (padrão US)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Para ler uma palavra (texto sem espaços)
        System.out.println("Digite uma palavra: ");
        String x = sc.next();// aguarda a entrada do usuario
        System.out.println("Você digitou: " + x);

        // para ler um número inteiro
        int y;
        System.out.println("Digite um número: ");
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        // para ler um número com ponto flutuante
        double z;
        System.out.println("Digite um número com ponto flutuante: ");
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z);

        // para ler um caractere
        char a;
        System.out.println("Digite um caractere: ");
        a = sc.next().charAt(0); // pega o primeiro caractere da string
        System.out.println("Você digitou: " + a);

        // para ler varios dados na mesma linha
        String b;
        int c;
        double d;
        System.out.println("Digite uma palavra, um número e um número com ponto flutuante: ");
        b = sc.next();
        c = sc.nextInt();
        d = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Para ler um texto ATÉ A QUEBRA DE LINHA
        int e;
        String s1, s2, s3;
        System.out.println("Digite um número e 3 palavras: ");
        e = sc.nextInt();

        sc.nextLine(); // vai consumir a quebra de linha pendente
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Dados digitados:");
        System.out.println(e);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close(); // faça sc.close() quando não precisar mais do objeto sc
    }
}
