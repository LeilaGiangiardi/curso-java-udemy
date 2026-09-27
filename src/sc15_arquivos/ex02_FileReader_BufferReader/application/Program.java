package sc15_arquivos.ex02_FileReader_BufferReader.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        
        String diretorio = "C:\\Users\\leila\\Desktop\\curso-java-udemy\\src\\sc15_arquivos\\ex02_FileReader_BufferReader\\texto_exemplo2.txt";
        
        FileReader fr1 = null;
        BufferedReader br1 = null;

        try {
            // instancia os leitores apontando para o diretorio
            fr1 = new FileReader(diretorio);
            br1 = new BufferedReader(fr1);
            
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
        finally {
            // bloco padrao e manual para fechar os recursos (sera otimizado na prox aula)
            try {
                if (br1 != null) {
                    br1.close();
                }
                if (fr1 != null) {
                    fr1.close();
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}