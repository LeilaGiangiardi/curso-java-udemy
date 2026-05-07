package sc10_arrays_listas.ex05_alturas.application;

import java.util.Locale;
import java.util.Scanner;

import sc10_arrays_listas.ex05_alturas.entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        double somaAlturas = 0.0;
        int contagemMenores = 0;

        for(int i=0; i<vetor.length; i++){
            System.out.println("Dados da "+(i+1)+"pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine(); //limpeza de buffer antes de ler uma String
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("altura: ");
            double altura = sc.nextDouble();

            vetor[i] = new Pessoa(nome, idade, altura);
            
            somaAlturas += vetor[i].getAltura();
            
            if (vetor[i].getIdade()<16){
                contagemMenores++;
            }   
        }

        double alturaMedia = somaAlturas/n;
        double percentualMenores = (double) contagemMenores*100/n;

        System.out.printf("%nAltura média: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenores);

        for (int i = 0; i<vetor.length; i++){
            if (vetor[i].getIdade()<16){
                System.out.println(vetor[i].getNome());
            }
        }
        sc.close();
    }
}
