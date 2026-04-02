package sc07_outros_topicos_basicos;

import java.util.Scanner;

public class A03_funcoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// Chamada da função que retorna um valor
		int higher = max(a, b, c);

		// Chamada da função que apenas executa uma ação (void)
		showResult(higher);

		sc.close();
	}

	// FUNÇÃO QUE RETORNA UM VALOR (int)
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux; // Envia o resultado de volta para quem chamou
	}

	// FUNÇÃO QUE NÃO RETORNA NADA (void)
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}