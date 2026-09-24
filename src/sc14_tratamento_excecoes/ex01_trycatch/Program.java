package sc14_tratamento_excecoes.ex01_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // O bloco 'try' (tentar) guarda o código que tem "risco" de dar erro.
        try {
            System.out.println("Digite alguns nomes separados por espaço:");
            String[] vetor = sc.nextLine().split(" "); // Ex: Maria Joao Alex
            
            System.out.print("Digite a posição (índice) do nome que deseja ver: ");
            int posicao = sc.nextInt();
            
            System.out.println("Nome escolhido: " + vetor[posicao]);
        } 
        // O bloco 'catch' (capturar) "pega" o erro no ar antes que ele quebre o programa.
        catch (ArrayIndexOutOfBoundsException e) {
            // Este erro ocorre se o usuário digitar uma posição que não existe no vetor (ex: posição 10 num vetor de 3)
            System.out.println("Erro: Posição inválida no vetor!");
        } 
        catch (InputMismatchException e) {
            // Este erro ocorre se o usuário digitar uma letra quando o programa espera um número (nextInt)
            System.out.println("Erro: Você deve digitar um número inteiro para a posição!");
        }


        // continua a execução normalmente até o final
        System.out.println("O programa continuou rodando até o fim com sucesso!");

        sc.close();
    }
}