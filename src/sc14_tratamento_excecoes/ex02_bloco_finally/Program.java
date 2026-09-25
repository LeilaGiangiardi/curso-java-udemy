package sc14_tratamento_excecoes.ex02_bloco_finally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        // aponta para o caminho onde o arquivo deveria estar
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        
        try {
            // tenta abrir o arquivo e ler todas as linhas dele
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } 
        catch (IOException e) {
            // captura o erro especificamente se o arquivo não for encontrado ou não puder ser lido
            System.out.println("Error opening file: " + e.getMessage());
        } 
        finally {
            // o bloco finally executa sempre, dando erro (catch) ou dando sucesso (try).
            // é o local padrão para fechar recursos que abrimos (arquivos, banco de dados, scanners)
            // para evitar que fiquem travando a memória do computador.
            if (sc != null) {
                sc.close();
            }
        }
    }
}