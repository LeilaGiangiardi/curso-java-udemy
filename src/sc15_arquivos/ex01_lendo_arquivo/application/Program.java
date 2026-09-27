package sc15_arquivos.ex01_lendo_arquivo.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        // aponta para o caminho do arquivo de texto
        File file1 = new File("C:\\Users\\leila\\OneDrive\\Área de Trabalho\\curso-java-udemy\\src\\sc15_arquivos\\ex01_lendo_arquivo\\texto_exemplo.txt");
        
        Scanner sc = null;

        try {
            // tenta abrir o arquivo (pode gerar IOException se não encontrar)
            sc = new Scanner(file1);
            
            // enquanto houver novas linhas no arquivo, lê e imprime
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } 
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } 
        finally {
            // boa prática: sempre fechar os recursos externos no bloco finally
            if (sc != null) {
                sc.close();
            }
        }
    }
}