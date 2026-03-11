package src.sc05_estrutura_condicional;

import java.util.Scanner;

public class A07_exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora inicial e a hora final do jogo (formato 0-23h): ");
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        
        if (horaInicial < horaFinal) {
            // Caso simples: começou e terminou no mesmo dia
            duracao = horaFinal - horaInicial;
        } else {
            // Caso complexo: passou pela meia-noite 
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " horas(s)");

        sc.close();
    }
}
