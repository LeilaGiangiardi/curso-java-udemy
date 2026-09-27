package sc15_arquivos.ex04_manipulando_pastas.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho da pasta: ");
        String diretorio = sc.nextLine();

        File pasta = new File(diretorio);

        //pastas dentro da pasta digitada
        File[] pastas = pasta.listFiles(File::isDirectory);
        System.out.println("---PASTAS---");
        for (File past: pastas){
            System.out.println(past);
        }
        File[] arquivos = pasta.listFiles(File::isFile);
        System.out.println("---ARQUIVOS---");
        for (File arq : arquivos){
            System.out.println(arq);
        }

        //criar uma subpasta
        boolean sucesso = new File(diretorio + "\\pastacriada").mkdir();
        System.out.print("pasta criada com sucesso -> "+sucesso);
        sc.close();
    }
}
