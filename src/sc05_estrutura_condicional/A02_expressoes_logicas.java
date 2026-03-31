package sc05_estrutura_condicional;

public class A02_expressoes_logicas {
    public static void main(String[] args) {
        
        // Variáveis para teste
        boolean x = true;
        boolean y = false;
        boolean z = true;

        System.out.println("--- Operadores Lógicos ---");

        // && (E): Todas as condições devem ser VERDADEIRAS
        System.out.println("x && z é: " + (x && z)); // true
        System.out.println("x && y é: " + (x && y)); // false

        // || (OU): Pelo menos uma condição deve ser VERDADEIRA
        System.out.println("x || y é: " + (x || y)); // true
        System.out.println("y || false é: " + (y || false)); // false

        // ! (NÃO): Inverte o valor booleano
        System.out.println("!x é: " + (!x)); // vira false
        System.out.println("!y é: " + (!y)); // vira true
    }
    
}
