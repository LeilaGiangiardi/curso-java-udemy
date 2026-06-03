package sc10_arrays_listas.ex14_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        // --- 1. INSTANCIAÇÃO DA LISTA ---
        // List: É a Interface (o contrato).
        // ArrayList: É a Classe que implementa a interface.
        List<String> nomeLista = new ArrayList<>();
        
        // --- 2. INSERINDO ELEMENTOS ---
        nomeLista.add("Maria");
        nomeLista.add("Alex");
        nomeLista.add("Bob");
        nomeLista.add("Anna");
        nomeLista.add("Julia");
        nomeLista.add("Julio");
        nomeLista.add("Leila");
        nomeLista.add("Luiza");
        
        System.out.println("Tamanho original da lista: " + nomeLista.size());
        for(String item : nomeLista) {
            System.out.println(item);
        } 
        System.out.println("--------------------------------------");

        // Inserindo elemento em uma posição específica (Index 2)
        nomeLista.add(2, "Marcos");
        
        System.out.println("Lista após adicionar Marcos no index 2:");
        for(String item : nomeLista) {
            System.out.println(item);
        } 
        System.out.println("--------------------------------------");

        // --- 3. REMOVENDO ELEMENTOS ---
        // Remover um item pelo conteúdo exato
        nomeLista.remove("Anna");

        // Remover um item pelo index (posição 1)
        nomeLista.remove(1);

        // Remover por uma condição (Predicado / Expressão Lambda)
        // Lê-se: "Remova o item 'x' SE a primeira letra de 'x' for igual a 'M'"
        nomeLista.removeIf(x -> x.charAt(0) == 'M'); 

        System.out.println("Lista após todas as remoções:");
        for(String item : nomeLista) {
            System.out.println(item);
        }
        System.out.println("--------------------------------------");

        // --- 4. BUSCANDO ELEMENTOS (INDEXOF) ---
        System.out.println("Index de Bob: " + nomeLista.indexOf("Bob"));
        
        // Quando a lista não encontra o elemento, ela sempre retorna -1
        System.out.println("Index de um elemento inexistente: " + nomeLista.indexOf("Marco"));
        System.out.println("--------------------------------------");
        
        // --- 5. FILTRANDO LISTAS COM STREAMS ---
        // Passos: 1. Converte para stream | 2. Aplica o filtro lambda | 3. Volta para List com Collectors
        List<String> listaFiltrada = nomeLista.stream()
            .filter(x -> x.charAt(0) == 'L')
            .collect(Collectors.toList());

        System.out.println("Nomes filtrados que começam com 'L':");
        for (String resultadoFiltro : listaFiltrada) {
            System.out.println(resultadoFiltro);
        }
        System.out.println("--------------------------------------");
        
        // --- 6. ENCONTRANDO O PRIMEIRO ELEMENTO ---
        // Encontra o primeiro nome que começa com "J". Se não achar nenhum, retorna nulo (orElse).
        String name = nomeLista.stream()
            .filter(x -> x.charAt(0) == 'J')
            .findFirst()
            .orElse(null);
            
        System.out.println("Primeiro nome encontrado com a letra 'J': " + name);
    }
}