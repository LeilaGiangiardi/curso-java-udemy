package sc06_estruturas_repetitivas;
import java.util.Locale;
import java.util.Scanner;

public class A10_exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pares de números você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            
            int x = sc.nextInt();
            int y = sc.nextInt();

            // Verificação do denominador zero
            if (y == 0) {
                System.out.println("divisao impossivel");
            } 
            else {
                /* Fazemos um "casting" (double) para que o Java entenda 
                   que queremos o resultado com casas decimais. */
                double divisao = (double) x / y;
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();
    }
}