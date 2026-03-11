package src.sc05_estrutura_condicional;

import java.util.Scanner;

public class A08_exercicio5 {
    public static void main(String[] args) {
    
        int cod;
        String nome;
        int quant = 0;
        double preco = 0;
        double valor_total;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do item(1-5): ");
        cod = sc.nextInt();
        if (cod == 1){
            nome = "cachorro Quente";
            preco = 4.00;
        }
        else if (cod == 2){
            nome = "X-Salada";
            preco = 4.50;
        }
        else if (cod == 3){
            nome = "X-bacon";
            preco = 5.00;
        }
        else if (cod == 4){
            nome = "Torrada simples";
            preco = 2.00;
        }
        else if (cod == 5){
            nome = "Refrigerante";
            preco = 1.50;
        }
        else{
            System.out.println("item não encontrado");
            return;
        }

        System.out.println("digite a quantidade de itens: ");
        quant = sc.nextInt();

        valor_total = (quant*preco);
        System.out.println("Valor total a pagar: R$"+valor_total);


        sc.close();
    }    
}
