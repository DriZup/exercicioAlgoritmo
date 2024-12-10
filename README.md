
# Ordenação com Bubble Sort em Java

Este documento detalha todos os passos e o funcionamento do código em Java que utiliza o algoritmo *Bubble Sort*. O programa permite ao usuário definir o tamanho de um array, preenche o array com números aleatórios, ordena-os e exibe o resultado.

---


#### *Implementação do Bubble Sort*
java
public static void bubbleSort(int[] v) {
int n = v.length;

    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++) {
            if (v[j] > v[j + 1]) {
                int temp = v[j];
                v[j] = v[j + 1];
                v[j + 1] = temp;
            }
        }


*Como funciona o Bubble Sort?*
1. Percorre o array várias vezes.
2. Compara pares de elementos adjacentes:
    - Se o elemento atual (v[j]) for maior que o próximo (v[j + 1]), troca suas posições.
3. Após cada passada, o maior elemento é movido para sua posição final.
4. O número de iterações diminui a cada passada, pois os elementos finais já estão ordenados.

---

### *6. Exibição do Array Ordenado*

System.out.println("Vetor ordenado");
for (int i = 0; i < v.length; i++) {
System.out.print(v[i] + " ");
}

- Após a ordenação, o array ordenado é exibido no console.

---

## *Exemplo de Execução*

### Entrada:

Escolha o tamanho do array:\
5

Vetor aleatorio desordenado:
4 2 3 1 0

### Saída:

Vetor ordenado:
0 1 2 3 4

---

## *Complexidade do Algoritmo*

1. *Complexidade Temporal*:
    - Pior caso: \(O(n^2)\), quando o array está em ordem inversa.
    - Melhor caso: \(O(n)\), quando o array já está ordenado.
2. *Complexidade Espacial*:
    - \(O(1)\), pois o algoritmo não utiliza memória adicional.

---

## *Conclusão*
Este código demonstra como implementar o algoritmo *Bubble Sort* em Java, sendo uma ótima introdução à lógica de ordenação e manipulação de arrays.