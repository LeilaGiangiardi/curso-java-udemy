package sc06_estruturas_repetitivas;

import java.util.Scanner;

public class A03_exercicio1 {
    public static void main(String[] args) {
        //leitura de senha
        Scanner sc = new Scanner(System.in);
        int senha;
        System.out.println("Digite a senha:");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida");
            System.out.println("Digite novamente:");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
        sc.close();

    }
    
}
