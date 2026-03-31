package sc05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class A12_OperadoresAtribuicaoCumulativa {

    public static void main(String[] args) {

        /*TABELA DE REFERÊNCIA: OPERADORES DE ATRIBUIÇÃO CUMULATIVA
         * -------------------------------------------------------
         * a += b;  ->  a = a + b;
         * a -= b;  ->  a = a - b;
         * a *= b;  ->  a = a * b;
         * a /= b;  ->  a = a / b;
         * a %= b;  ->  a = a % b;
         * -------------------------------------------------------
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos consumidos: ");
        int minutos = sc.nextInt();

        double conta = 50.0; // Valor da franquia básica do plano

        if (minutos > 100) {
            /* * Uso do Operador de Atribuição Cumulativa (+=)
             * Em vez de: conta = conta + (minutos - 100) * 2.0;
             */
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();
    }
}