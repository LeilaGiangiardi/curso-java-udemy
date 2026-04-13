package sc08_introducao_poo.ex04_funcionario.application;

import java.util.Locale;
import java.util.Scanner;

import sc08_introducao_poo.ex04_funcionario.entities.Funcionario;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario fun = new Funcionario();

        System.out.print("Name: ");
        fun.name = sc.nextLine();

        System.out.print("Salario bruto: ");
        fun.salario_bruto = sc.nextDouble();

        System.out.print("Imposto: ");
        fun.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + fun);
        System.out.println();
        System.out.print("Qual a porcentagem de aumento salarial? ");
        double porcentagem = sc.nextDouble(); 
        fun.salario_porcentagem(porcentagem);   
        
        System.out.println();
        System.out.println("dados atualizados do funcionário: " + fun);

        sc.close();
    
    }
    
}
