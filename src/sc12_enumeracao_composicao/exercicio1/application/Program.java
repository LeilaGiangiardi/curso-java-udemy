package sc12_enumeracao_composicao.exercicio1.application;


import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import sc12_enumeracao_composicao.exercicio1.entities.ContratoPorHora;
import sc12_enumeracao_composicao.exercicio1.entities.Departamento;
import sc12_enumeracao_composicao.exercicio1.entities.Funcionario;
import sc12_enumeracao_composicao.exercicio1.entities_enum.Level;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        //System.out.println("digite as informações do trabalho");
        System.out.print("Nome do funcionário: ");
        String nomeFuncionario = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Sálario base: ");
        double salarioBase = sc.nextDouble();

        Funcionario fun1 = new Funcionario(nomeFuncionario, 
             // 2. CONVERSÃO DE ENUM: O Scanner leu o texto (String), mas o construtor exige o tipo Level.
            // O Level.valueOf() pega o texto (ex: "PLENO") e converte para a constante do Enum.
            Level.valueOf(level), 

            salarioBase, 
            // 4. COMPOSIÇÃO: O Funcionario "tem um" Departamento.
            new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos esse funcionário vai ter? ");
        int n = sc.nextInt();
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
        for (int i=1; i<=n; i++){
            System.out.println("Digite os dados do contrato "+(i)+": ");
            System.out.print("Data (DD/MM/YYYY): ");
            String dataTexto = sc.next();
            LocalDate dataContrato = LocalDate.parse(dataTexto, fmt);   
            System.out.print("Valor por hora: ");
            double valorhora = sc.nextDouble();
            System.out.print("Digite a duração em horas: ");
            int horas = sc.nextInt();

            ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorhora, horas);
            fun1.addContrato(contrato);
        };

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
        System.out.println();
        System.out.println("Digite o mês e ano para calcular o salaário (MM/YYYY): ");
        String mesEAno = sc.next();
        YearMonth ym = YearMonth.parse(mesEAno, fmt2);
        int mes = ym.getMonthValue();
        int ano = ym.getYear();



        System.out.println("Nome: " + fun1.getNome());
        System.out.println("Departmento: " + fun1.getDepartamento().getNome());
        System.out.println("Salário na data " + mesEAno + ": " + String.format("%.2f", fun1.renda(ano, mes)));


        sc.close();
    }
}
