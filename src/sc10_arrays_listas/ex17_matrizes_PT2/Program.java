package sc10_arrays_listas.ex17_matrizes_PT2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o número de linhas (M): ");
            int m = sc.nextInt();
            
            System.out.print("Digite o número de colunas (N): ");
            int n = sc.nextInt();

            // Instanciando a matriz bidimensional
            int[][] mat = new int[m][n];

            System.out.println("Digite os elementos da matriz:");
            // Lendo os dados da matriz
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            System.out.print("Digite o número que deseja buscar (X): ");
            int x = sc.nextInt();

            // Buscando o número X e seus vizinhos
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    
                    // Se o número atual for igual ao X que estamos procurando
                    if (mat[i][j] == x) {
                        System.out.println("Posição " + i + "," + j + ":");
                        
                        // Só tem vizinho à ESQUERDA se a coluna (j) for maior que 0
                        if (j > 0) {
                            System.out.println("Esquerda: " + mat[i][j - 1]);
                        }
                        
                        // Só tem vizinho ACIMA se a linha (i) for maior que 0
                        if (i > 0) {
                            System.out.println("Acima: " + mat[i - 1][j]);
                        }
                        
                        //Só tem vizinho à DIREITA se a coluna (j) for menor que o limite final de colunas
                        if (j < mat[i].length - 1) {
                            System.out.println("Direita: " + mat[i][j + 1]);
                        }
                        
                        //Só tem vizinho ABAIXO se a linha (i) for menor que o limite final de linhas
                        if (i < mat.length - 1) {
                            System.out.println("Abaixo: " + mat[i + 1][j]);
                        }
                    }
                }
            }
        }
    }

