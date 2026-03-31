package sc06_estruturas_repetitivas;

import java.util.Scanner;

public class A05_exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int cod;
        System.out.println("TABELA\n 1 - Álcool\n 2 - Gasolina\n 3 - Diesel\n 4 - Fim");
        System.out.println("Digite o código:");
        cod = sc.nextInt();


        while (cod != 4) {
            if (cod == 1) {
                alcool++;
            } 
            else if (cod == 2) {
                gasolina++;
            } 
            else if (cod == 3) {
                diesel++;
            }
            System.out.println("Digite o código:");
            cod = sc.nextInt();
        }    
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();        
    }
}
