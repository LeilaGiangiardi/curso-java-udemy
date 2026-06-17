package sc10_arrays_listas.matrizes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz: ");
        int n = sc.nextInt();

        
        //[][] -> bidimencional
        int [][] matriz = new int[n][n]; //instanciando a matriz

        System.out.println("Digite a matriz abaixo ");
        for (int i = 0; i<n; i++){ //percorre as linhas
            for (int j = 0; j<n; j++){ //percorre as colunas
                System.out.print("Digite o valor da posição "+(i)+"x"+(j)+": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal principal: ");
        for (int i=0; i<n; i++){
            System.out.print(matriz[i][i]+ " ");
        }
        System.out.println();

        
        int count = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (matriz[i][j] < 0 ){
                    count++;
                }
            }
        }
        System.out.println("quantidade de números negativos: " + count);
        sc.close();
    }
}
