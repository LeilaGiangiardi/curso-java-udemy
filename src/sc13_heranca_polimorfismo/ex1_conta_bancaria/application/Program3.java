package sc13_heranca_polimorfismo.ex1_conta_bancaria.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import sc13_heranca_polimorfismo.ex1_conta_bancaria.entities.Conta;
import sc13_heranca_polimorfismo.ex1_conta_bancaria.entities.ContaEmpresa;
import sc13_heranca_polimorfismo.ex1_conta_bancaria.entities.ContaPoupanca;

public class Program3 {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Conta> list = new ArrayList<>();
		
		list.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
		list.add(new ContaEmpresa(1002, "Maria", 1000.0, 400.0));
		list.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
		list.add(new ContaEmpresa(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Conta acc : list) {
			sum += acc.getSaldo();
		}
		
		System.out.printf("Saldo total de todas as contas: %.2f%n", sum);
		
		for (Conta acc : list) {
			acc.depositar(10.0);
		}
		for (Conta acc : list) {
			System.out.printf("Conta %d com saldo atualizado: %.2f%n", acc.getNumero(), acc.getSaldo());
		}
	}
}
