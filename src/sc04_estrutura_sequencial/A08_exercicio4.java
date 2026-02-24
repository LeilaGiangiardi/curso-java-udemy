package src.sc04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class A08_exercicio4 {
    public static void main(String[] args) {
        /*fazer um programa uqe leia o número de um funcionario
        seu numero de horas trabalhadas, o valor que recebe por hora
        e calcula o salario desse funcionario
        mostre o numero e o salario do funcionario com duas casas decimais. */
        

        int num_funcionario;
        int horas_trabalhadas;
        double valor_por_hora;
        double salario;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de funcionário: ");
        num_funcionario = sc.nextInt();
        System.out.println("Digite as horas trabalhadas: ");
        horas_trabalhadas = sc.nextInt();
        System.out.println("Digite o valor recebido por horas: ");
        valor_por_hora = sc.nextDouble();

        salario = horas_trabalhadas*valor_por_hora;

        System.out.printf("Salário do funcionario número %d é U$1%.2f", num_funcionario, salario);        
        
        sc.close();
   
   
   
    }
}
