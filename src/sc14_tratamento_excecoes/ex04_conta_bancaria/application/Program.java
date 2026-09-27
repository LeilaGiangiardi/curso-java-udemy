package sc14_tratamento_excecoes.ex04_conta_bancaria.application;

import java.util.Locale;
import java.util.Scanner;

import sc14_tratamento_excecoes.ex04_conta_bancaria.model.entities.Conta;
import sc14_tratamento_excecoes.ex04_conta_bancaria.model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados da conta: ");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite para saque: ");
        double limiteSaque = sc.nextDouble();

        // instanciando a conta com os dados digitados
        Conta conta1 = new Conta(numero, titular, saldo, limiteSaque);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double valor = sc.nextDouble();
        
        // tenta realizar o saque e atualizar o saldo
        try {
            conta1.sacar(valor);
            System.out.println("saldo atualizado: " + conta1.getSaldo());
        }
        // captura a nossa exceção personalizada caso alguma regra de saque seja violada
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }
        // captura qualquer outro erro inesperado que não previmos
        catch (RuntimeException e) {
            System.out.println("erro inesperado aconteceu.");
        }
        
        sc.close();
    }
}