package src.secao04;

import java.util.Locale;
import java.util.Scanner;

public class A09_exercicio5 {
    public static void main(String[] args) {
        /*fazer um programa para ler o código de uma peça 1,
        o numero de peças 1, o valor unitario de cada peça 1, o codigo de uma peça 2,
        o numero de peças 2 e o valor unitario de cada peça 2.
        calcule e mostre o valor a ser pago */

        int cod_peca1;
        int quant_peca1;
        double preco_peca1;
        int cod_peca2;
        int quant_peca2;
        double preco_peca2;
        double valor_total;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da peça 1: ");
        cod_peca1 = sc.nextInt();
        System.out.println("Digite a quantide de peças 1: ");
        quant_peca1 = sc.nextInt();
        System.out.println("Digite o preço da peça 1: ");
        preco_peca1 = sc.nextDouble();
        System.out.println("vamos para a peça 2");
         System.out.println("Digite o código da peça 2: ");
        cod_peca2 = sc.nextInt();
        System.out.println("Digite a quantide de peças 2: ");
        quant_peca2 = sc.nextInt();
        System.out.println("Digite o preço da peça 2: ");
        preco_peca2 = sc.nextDouble();

        valor_total = (quant_peca1*preco_peca1) + (quant_peca2*preco_peca2);
        System.out.printf("valor total a pagar:%.2f",valor_total);

        sc.close();
        
    }
}
