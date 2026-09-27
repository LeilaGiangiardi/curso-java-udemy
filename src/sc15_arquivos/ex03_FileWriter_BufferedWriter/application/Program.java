package sc15_arquivos.ex03_FileWriter_BufferedWriter.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        
        String[] linhas = new String[] { "Olá", "Tudo bem?", "boa tarde" };
        String diretorio = "C:\\Users\\leila\\Desktop\\curso-java-udemy\\src\\sc15_arquivos\\ex03_FileWriter_BufferedWriter\\exemplo_saida.txt";

        // instancia o escritor. o parametro 'true' garante que o texto sera adicionado ao final do arquivo (append)
        // sem recriar ou apagar o original
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(diretorio, true))) {
            
            // percorre o vetor escrevendo cada frase no arquivo
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine(); // adiciona a quebra de linha para a proxima frase
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}