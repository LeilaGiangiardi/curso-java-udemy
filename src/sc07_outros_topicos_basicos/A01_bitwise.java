package sc07_outros_topicos_basicos;

import java.util.Scanner;

public class A01_bitwise {

	public static void main(String[] args) {

		/*
		 * OPERADORES BITWISE
		 * & (E bit a bit): Resulta em 1 apenas se ambos os bits forem 1.
		 * | (OU bit a bit): Resulta em 1 se pelo menos um dos bits for 1.
		 * ^ (OU exclusivo bit a bit): Resulta em 1 se os bits forem diferentes.
		 */

		int n1 = 89;  // Em binário: 0101 1001
		int n2 = 60;  // Em binário: 0011 1100

		System.out.println(n1 & n2); // Saída: 24 (0001 1000)
		System.out.println(n1 | n2); // Saída: 125 (0111 1101)
		System.out.println(n1 ^ n2); // Saída: 101 (0110 0101)

		// EXEMPLO PRÁTICO: Uso de Máscara (Bit Masking)
		// Verificar se o 6º bit de um número é 1 (verdadeiro) ou 0 (falso)
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 32; // Em binário: 0010 0000 (apenas o 6º bit é 1)
		System.out.print("Digite um número para testar o 6º bit: ");
		int n = sc.nextInt();

		if ((n & mask) != 0) {
			System.out.println("O 6º bit é verdadeiro!");
		} else {
			System.out.println("O 6º bit é falso!");
		}

		sc.close();
	}
}