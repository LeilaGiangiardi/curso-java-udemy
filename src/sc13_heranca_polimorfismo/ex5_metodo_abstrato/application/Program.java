package sc13_heranca_polimorfismo.ex5_metodo_abstrato.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sc13_heranca_polimorfismo.ex5_metodo_abstrato.entities.Circulo;
import sc13_heranca_polimorfismo.ex5_metodo_abstrato.entities.Forma;
import sc13_heranca_polimorfismo.ex5_metodo_abstrato.entities.enums.Cor;
import sc13_heranca_polimorfismo.ex5_metodo_abstrato.entities.Retangulo;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> list = new ArrayList<>();
        System.out.print("Digite quantas formas seram digitadas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Forma #" + i + ":");
            System.out.print("Retangulo ou circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Digite a cor (PRETO/AZUL/VERMELHO) ");
            Cor cor = Cor.valueOf(sc.next());
            if (ch == 'r' || ch == 'R') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                list.add(new Retangulo(cor, largura, altura));
            } else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                list.add(new Circulo(cor, raio));
            }
        }

        System.out.println();
        System.out.print("Areas das formas: ");
        for (Forma forma : list) {
            System.out.println(String.format("%.2f", forma.area()));
        }

        sc.close();
    }
}
