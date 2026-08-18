package sc13_heranca_polimorfismo.ex1_conta_bancaria.application;

import sc13_heranca_polimorfismo.ex1_conta_bancaria.entities.Conta;
import sc13_heranca_polimorfismo.ex1_conta_bancaria.entities.ContaPoupanca;

public class Program2 {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta(1001, "Alex", 1000.0);
        conta1.saque(200.0);
        System.out.println(conta1.getSaldo());
   
        Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        conta2.saque(200.0);
        System.out.println(conta2.getSaldo());
    }
}
