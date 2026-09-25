package sc14_tratamento_excecoes.ex01_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // 1. a pilha de execução começa aqui no main
        method1();
        System.out.println("Fim do programa");
    }

    public static void method1() {
        System.out.println("***METHOD1 START***");
        // 2. o main chamou o method1, que agora chama o method2 (empilhando a execução)
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
        
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("posição inválida!");
            
            // 3. e.printStackTrace() imprime a famosa "pilha de chamadas" (stack trace).
            // se der erro, ele mostra o rastro exato do problema em vermelho no console:
            // onde estourou (method2) <- quem chamou (method1) <- onde começou (main)
            e.printStackTrace();
            
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("erro de entrada");
        }
        
        sc.close();
        System.out.println("***METHOD2 END***");
    }
}