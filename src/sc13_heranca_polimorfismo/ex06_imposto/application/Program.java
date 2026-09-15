package sc13_heranca_polimorfismo.ex06_imposto.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sc13_heranca_polimorfismo.ex06_imposto.entities.Pessoa;
import sc13_heranca_polimorfismo.ex06_imposto.entities.Pessoa_fisica;
import sc13_heranca_polimorfismo.ex06_imposto.entities.Pessoa_juridica;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();
        System.out.print("Digite a quantidade de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados " + i + " pessoa: ");
            System.out.print("Pessoa fisica ou juridica (F/J)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();
            if (ch == 'F' || ch == 'f') {
                System.out.print("Gastos com saude: ");
                double gastoSaude = sc.nextDouble();
                list.add(new Pessoa_fisica(nome, renda, gastoSaude));
            }
            if (ch == 'J' || ch == 'j'){
                System.out.print("Numero de funcionarios: ");
                int n_Funcionarios = sc.nextInt();
                list.add(new Pessoa_juridica(nome, renda, n_Funcionarios));
            }
        }
        System.out.println();
        System.out.println("-------------impostos pagos-------------");
        double somaImposto = 0.0;
        for (Pessoa p : list){
            double imposto = p.calc_imposto();
            System.out.println(p.getNome()+"$"+ String.format("%.2f", imposto));
            somaImposto += imposto;
        }
        System.out.println();
        System.out.print("total de impostos: $"+ somaImposto);
        sc.close();
    }

}

