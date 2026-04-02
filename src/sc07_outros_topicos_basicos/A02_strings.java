package sc07_outros_topicos_basicos;

public class A02_strings {

	public static void main(String[] args) {

		String s = "abcde FGHIJ ABC abc DEFG   ";

		// FORMATAR
		String s01 = s.toLowerCase();     // Tudo para minúsculas
		String s02 = s.toUpperCase();     // Tudo para maiúsculas
		String s03 = s.trim();            // Remove espaços nas extremidades

		// RECORTAR
		String s04 = s.substring(2);      // Do índice 2 até ao fim
		String s05 = s.substring(2, 9);   // Do índice 2 até ao 8 (o 9 não conta)

		// SUBSTITUIR
		String s06 = s.replace('a', 'x'); // Troca caracteres
		String s07 = s.replace("abc", "xy"); // Troca pedaços de texto

		// BUSCAR
		int i = s.indexOf("bc");          // Primeira ocorrência de "bc"
		int j = s.lastIndexOf("bc");     // Última ocorrência de "bc"

		System.out.println("Original: -" + s + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		// SPLIT
		String f = "batata maçã limão";
		String[] vect = f.split(" ");     // Divide a string por espaços
		System.out.println(vect[0]);      // batata
		System.out.println(vect[1]);      // maçã
		System.out.println(vect[2]);      // limão
	}
}