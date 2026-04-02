# ☕ Seção 7: Outros tópicos básicos sobre Java

Esta seção funciona como um guia de ferramentas essenciais e conceitos auxiliares que complementam a base da linguagem Java, preparando o terreno para tópicos mais avançados, como a Programação Orientada a Objetos.

---

## 🧠 Conceitos Aprendidos

* **Operadores Bitwise:** Manipulação de dados ao nível de bits utilizando os operadores `&` (AND), `|` (OR) e `^` (XOR). Introdução ao conceito de *Bit Masking* para verificação de estados.
* **Manipulação de Strings:** Domínio das funções nativas da classe String para formatação, recorte, substituição e busca de caracteres.
* **Divisão de Texto (`split`):** Uso do método `split` para converter cadeias de caracteres em vetores (arrays) com base em delimitadores.
* **Sintaxe de Funções (Métodos):** Criação de blocos de código reutilizáveis, compreensão de parâmetros, tipos de retorno (`int`, `double`, etc.) e métodos sem retorno (`void`).
* **Delegação de Lógica:** Organização do código movendo processamentos complexos do método `main` para funções especialistas.

---

## 📂 Organização dos Ficheiros

Abaixo estão as notas de aula e exemplos práticos implementados nesta seção:

| Ficheiro | Descrição da Aula / Conceito |
| :--- | :--- |
| **`A01_bitwise.java`** | Operações binárias e exemplo prático de teste de bit com máscara. |
| **`A02_strings.java`** | Demonstração de `toLowerCase`, `toUpperCase`, `trim`, `substring`, `replace` e `split`. |
| **`A03_funcoes.java`** | Implementação de funções personalizadas para cálculo de maior valor e exibição de resultados. |

---

## 🛠️ Notas Técnicas

### Sintaxe de Funções
Uma função bem definida ajuda na manutenção e legibilidade do código. A estrutura base utilizada foi:
```java
public static tipoDeRetorno nomeDaFuncao(parametros) {
    // lógica
    return valor;
}