# ☕ Seção 6: Estruturas Repetitivas

Este módulo foca no domínio das estruturas de controle que permitem a execução repetida de blocos de código. Foram abordadas situações onde o número de repetições é desconhecido (`while`), pré-determinado (`for`) ou onde a execução deve ocorrer ao menos uma vez (`do-while`).

---

## 🧠 Conceitos Aprendidos

* **Debug no VS Code:** Uso de *breakpoints* e inspeção de variáveis para rastrear a execução linha a linha e entender o fluxo lógico.
* **Estrutura While:** Ideal para repetições baseadas em condições lógicas quando não se sabe o limite exato de iterações.
* **Estrutura For:** Otimização para laços de repetição com contagem determinada, integrando inicialização, condição e incremento.
* **Estrutura Do-While:** Garantia de execução do bloco de comandos ao menos uma vez antes da verificação da condição (ideal para menus).
* **Operadores de Incremento (`++`):** Utilização da sintaxe simplificada para manipulação de contadores e acumuladores.
* **Casting e Precisão:** Conversão explícita de tipos (ex: `(double)`) para garantir resultados decimais em divisões de inteiros.
* **Gestão de Recursos:** Implementação do fechamento de instâncias do `Scanner` (`sc.close()`) para evitar vazamentos de memória (*resource leaks*).

---

## 📂 Organização dos Arquivos

### Aulas Teóricas e Notas de Aula
* **`A01_debug.java`**: Prática de depuração e controle de fluxo manual.
* **`A02_while.java`**: Sintaxe e funcionamento básico do laço "enquanto".
* **`A06_for.java`**: Implementação da estrutura "para" com controle de iterações.
* **`A13_do_while.java`**: Exemplo de conversão de temperatura Celsius para Fahrenheit com verificação posterior.

---

## 📝 Exercícios de Fixação

Abaixo estão os desafios resolvidos, mapeados conforme a estrutura de arquivos final do projeto:

| Arquivo | Descrição da Lógica |
| :--- | :--- |
| **`A03_exercicio1`** | Validação de senha de acesso com loop `while`. |
| **`A04_exercicio2`** | Identificação de quadrantes no plano cartesiano através de coordenadas. |
| **`A05_exercicio3`** | Pesquisa de preferência de combustíveis com contagem por tipo. |
| **`A07_exercicio4`** | Filtragem e exibição de números ímpares no intervalo de 1 até X. |
| **`A08_exercicio5`** | Contagem de valores dentro e fora do intervalo $[10, 20]$ usando `for`. |
| **`A09_exercicio6`** | Cálculo de médias ponderadas: $\text{Média} = \frac{(v_1 \cdot 2) + (v_2 \cdot 3) + (v_3 \cdot 5)}{10}$. |
| **`A10_exercicio7`** | Divisão de pares com tratamento de erro para denominador zero e uso de *casting*. |
| **`A11_exercicio8`** | Cálculo do fatorial de um número inteiro $N$ ($N!$). |
| **`A12_exercicio9`** | Geração de tabela contendo o valor da linha, seu quadrado e seu cubo. |

---