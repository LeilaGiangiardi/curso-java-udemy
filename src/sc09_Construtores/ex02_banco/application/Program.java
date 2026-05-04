package sc09_Construtores.ex02_banco.application;

import java.util.Locale;
import java.util.Scanner;
import sc09_Construtores.ex02_banco.entities.Conta;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta; // Declaramos a variável aqui para usá-la em todo o escopo do main

        System.out.print("Entre com o número da conta: ");
        int numero = sc.nextInt();
        
        System.out.print("Entre com o titular da conta: ");
        sc.nextLine(); // Consumir a quebra de linha pendente do nextInt()
        String titular = sc.nextLine();

        System.out.print("Haverá um depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        // Lógica para escolher qual Construtor usar (Sobrecarga)
        if (resposta == 's') {
            System.out.print("Entre com o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com um valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        sc.close();
    }
}