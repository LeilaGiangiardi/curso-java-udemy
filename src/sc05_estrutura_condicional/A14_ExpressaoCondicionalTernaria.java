package src.sc05_estrutura_condicional;

import java.util.Locale;

public class A14_ExpressaoCondicionalTernaria {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        double preco = 34.5;
        
        /* * Sintaxe: ( condição ) ? valor_se_verdadeiro : valor_se_falso
         */
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("Desconto: " + desconto);
    }
}