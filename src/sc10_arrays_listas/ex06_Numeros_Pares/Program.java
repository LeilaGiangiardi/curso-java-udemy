package sc10_arrays_listas.ex06_Numeros_Pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i=0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Números pares: ");
        int contagemPares = 0;
        for (int i = 0; i<vetor.length; i++){
            if (vetor[i]%2 == 0){
                contagemPares++;
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.println();
        System.out.println("quantidade de pares: "+contagemPares);
        

        sc.close();
    }
}
