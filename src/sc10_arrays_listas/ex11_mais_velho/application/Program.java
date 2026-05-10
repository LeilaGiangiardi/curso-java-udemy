package sc10_arrays_listas.ex11_mais_velho.application;

import java.util.Scanner;

import sc10_arrays_listas.ex11_mais_velho.entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        
        Pessoa [] pessoas = new Pessoa[n];

        for (int i=0; i<pessoas.length; i++){
            System.out.println("Dados da "+(i+1)+"ª pessoa:");
            System.out.print("nome: ");
            String nome = sc.next();
            System.out.print("idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new Pessoa(nome, idade);}

        Pessoa maisVelha = pessoas[0];
             
        for (int i = 1; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > maisVelha.getIdade()) {
                maisVelha = pessoas[i]; 
            }
        }
    System.out.println("Pessoa mais velha: " + maisVelha.getNome());
    sc.close();
    }
    
}
