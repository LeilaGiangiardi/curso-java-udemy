package sc08_introducao_poo.ex05_aluno.application;

import java.util.Locale;
import java.util.Scanner;
import sc08_introducao_poo.ex05_aluno.entities.Aluno;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome do aluno: ");
        aluno.nome = sc.nextLine();
        
        System.out.print("Nota 1 (máx 30): ");
        aluno.nota1 = sc.nextDouble();
        
        System.out.print("Nota 2 (máx 35): ");
        aluno.nota2 = sc.nextDouble();
        
        System.out.print("Nota 3 (máx 35): ");
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        System.out.printf("NOTA FINAL = %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60.0) {
            System.out.println("REPROVADO (FAILED)");
            System.out.printf("FALTARAM %.2f PONTOS%n", aluno.pontosFaltantes());
        } else {
            System.out.println("APROVADO (PASS)");
        }

        sc.close();
    }
}