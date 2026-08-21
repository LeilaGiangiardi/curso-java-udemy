package sc13_heranca_polimorfismo.ex02_calculo_salario.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sc13_heranca_polimorfismo.ex02_calculo_salario.entities.Funcionario;
import sc13_heranca_polimorfismo.ex02_calculo_salario.entities.Terceirizado;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lista agora usa a classe com letra maiúscula
        List<Funcionario> listaF = new ArrayList<>(); 

        System.out.print("Digite o numero de funcionários: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Funcionário #" + i);
            System.out.print("É terceirizado (S/N)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
        
            if (ch == 's' || ch == 'S' ){
                System.out.print("Digite o adicional: ");
                double adicional = sc.nextDouble();
                // Instanciando com letra maiúscula
                Funcionario fun1 = new Terceirizado(nome, horas, valorPorHora, adicional);
                listaF.add(fun1);
            }
            else {
                // Instanciando com letra maiúscula
                Funcionario func2 = new Funcionario(nome, horas, valorPorHora);
                listaF.add(func2);
            }
        }
        
        System.out.println("----------------------");
        System.out.println("Pagamentos: ");
        for (Funcionario funX : listaF){
            System.out.println(funX.getName() + " - $" + String.format("%.2f", funX.pagamento()));
        }

        sc.close();
    }
}