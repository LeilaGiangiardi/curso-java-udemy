package sc15_arquivos.ex02_FileReader_BufferReader.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        
        String diretorio = "C:\\Users\\leila\\Desktop\\curso-java-udemy\\src\\sc15_arquivos\\ex02_FileReader_BufferReader\\texto_exemplo2.txt";
        
        // try-with-resources
        // ao instanciar os leitores dentro dos parênteses do try, o java fecha
        // automaticamente o bufferedReader e o fileReader no final da execução,
        // eliminando completamente a necessidade de escrever o bloco finally manual.
        try (BufferedReader br1 = new BufferedReader(new FileReader(diretorio))) {
            
            // le a primeira linha do arquivo
            String linha = br1.readLine(); 

            // repete a leitura enquanto a linha nao for nula (fim do arquivo)
            while (linha != null) {
                System.out.println(linha);
                linha = br1.readLine();
            }
        } 
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}