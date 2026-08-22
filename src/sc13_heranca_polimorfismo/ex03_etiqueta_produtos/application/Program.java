package sc13_heranca_polimorfismo.ex03_etiqueta_produtos.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sc13_heranca_polimorfismo.ex03_etiqueta_produtos.entities.Produto;
import sc13_heranca_polimorfismo.ex03_etiqueta_produtos.entities.ProdutoImportado;
import sc13_heranca_polimorfismo.ex03_etiqueta_produtos.entities.ProdutoUsado;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite a quantidade de produtos: ");
        int n = sc.nextInt();
        
        List<Produto> listaProdutos = new ArrayList<>();
         
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do produto #" + i + ":");
            System.out.print("É um produto comum, usado, ou importado (c/u/i)? ");
            char ch = sc.next().charAt(0);
            
            System.out.print("Nome: ");
            sc.nextLine(); // Limpeza de buffer ANTES de ler o texto!
            String nome = sc.nextLine();
            
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            
            if (ch == 'c' || ch == 'C') {
                Produto produto = new Produto(nome, preco);
                listaProdutos.add(produto);
            }
            else if (ch == 'u' || ch == 'U') {
                System.out.print("Digite a data de fabricação (DD/MM/YYYY): ");
                String dataTexto = sc.next();
                LocalDate dataFabricacao = LocalDate.parse(dataTexto, fmt);
                Produto produto = new ProdutoUsado(nome, preco, dataFabricacao);
                listaProdutos.add(produto);
            }   
            else if (ch == 'i' || ch == 'I') {
                System.out.print("Valor da taxa alfandegária: ");
                Double taxa = sc.nextDouble();
                Produto produto = new ProdutoImportado(nome, preco, taxa);
                listaProdutos.add(produto);
            }
        }

        System.out.println();
        System.out.println("--- ETIQUETAS DE PREÇO ---");
        for (Produto produto : listaProdutos) {
            System.out.println(produto.etiqueta());
        }

        sc.close();
    }
}