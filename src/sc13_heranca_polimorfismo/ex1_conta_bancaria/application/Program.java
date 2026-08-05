package sc13_heranca_polimorfismo.ex1_conta_bancaria.application;

import sc13_heranca_polimorfismo.ex1_conta_bancaria.entities.Conta;
import sc13_heranca_polimorfismo.ex1_conta_bancaria.entities.ContaEmpresa;
import sc13_heranca_polimorfismo.ex1_conta_bancaria.entities.ContaPoupanca;

public class Program {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta(1001, "Alex", 0.0);
        ContaEmpresa contaE1 = new ContaEmpresa(1002, "Maria", 0.0, 500.0);

        // --- UPCASTING ---
        // É a conversão da subclasse para a superclasse. 
        // 100% seguro e aceito implicitamente pelo compilador (relação "é um").
        Conta contaExemplo = contaE1;
        Conta contaExemplo2 = new ContaEmpresa(1003, "Bob", null, 200.0);
        Conta contaExemplo3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
    
        // --- DOWNCASTING ---
        // É a conversão da superclasse para a subclasse.
        // Exige o casting manual explícito (especificar o tipo entre parênteses).
        ContaEmpresa contaExemplo4 = (ContaEmpresa) contaExemplo2;
        contaExemplo4.emprestimo(100.00);
    

        // --- A PROBLEMÁTICA DO DOWNCASTING ---
        // O compilador aceita o código abaixo, mas na hora de executar (Runtime),
        // o programa "quebra" (ClassCastException) porque uma Conta Poupança não pode ser convertida para Empresa.
        // ContaEmpresa contaExemplo5 = (ContaEmpresa) contaExemplo3;
   
        // --- SOLUÇÃO: PROTEÇÃO COM INSTANCEOF ---
        // O 'instanceof' verifica quem o objeto realmente é na memória (no Heap) antes de tentar converter.
        
        // Pergunta: O objeto dentro de contaExemplo3 nasceu como ContaEmpresa? (Retorna False)
        if (contaExemplo3 instanceof ContaEmpresa){
            ContaEmpresa contaExemplo5 = (ContaEmpresa) contaExemplo3;
            contaExemplo5.emprestimo(200.0);
            System.out.println("Foi feito um empréstimo!");        
        }
        // O bloco acima é totalmente ignorado, protegendo o sistema de travar.

        // Pergunta: O objeto dentro de contaExemplo3 nasceu como ContaPoupanca? (Retorna True)
        if (contaExemplo3 instanceof ContaPoupanca){
            // Como é seguro, fazemos o downcasting para liberar o acesso ao método específico.
            ContaPoupanca contaExemplo5 = (ContaPoupanca) contaExemplo3;
            contaExemplo5.atualizarSaldo();
            System.out.println("Saldo atualizado!");
        }
    }   
}