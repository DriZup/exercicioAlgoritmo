# Bubble Sort

## O que é o Bubble Sort?
O *Bubble Sort* é um algoritmo de ordenação simples que compara pares de elementos adjacentes em uma lista e os troca de posição se estiverem fora de ordem. O processo é repetido várias vezes até que a lista esteja completamente ordenada.

### Características:
- *Complexidade*:
    - Melhor caso: \(O(n)\) (lista já ordenada).
    - Pior caso: \(O(n^2)\) (lista em ordem inversa).
- *Simples de implementar*.
- Não é eficiente para listas grandes.

---

## Como funciona o Bubble Sort?
1. *Passo básico*:
    - Compare dois elementos consecutivos.
    - Se o elemento atual for maior que o próximo, troque-os.

2. *Repetição*:
    - Após cada passagem pelo array, o maior elemento "sobe" para a última posição.
    - A cada iteração, o tamanho efetivo do array analisado diminui.

3. *Parada*:
    - O algoritmo termina quando não são mais necessárias trocas.

---

## Fluxo do Bubble Sort

Vamos demonstrar o Bubble Sort ordenando o array inicial:

[7, 5, 10, 6, 8].

### Primeira Passagem (i = 0):
- Comparar 7 > 5 → Trocar → [5, 7, 10, 6, 8].
- Comparar 7 > 10 → Não trocar → [5, 7, 10, 6, 8].
- Comparar 10 > 6 → Trocar → [5, 7, 6, 10, 8].
- Comparar 10 > 8 → Trocar → [5, 7, 6, 8, 10].

Resultado após a primeira passagem: [5, 7, 6, 8, 10].

### Segunda Passagem (i = 1):
- Comparar 5 > 7 → Não trocar → [5, 7, 6, 8, 10].
- Comparar 7 > 6 → Trocar → [5, 6, 7, 8, 10].
- Comparar 7 > 8 → Não trocar → [5, 6, 7, 8, 10].

Resultado após a segunda passagem: [5, 6, 7, 8, 10].

### Terceira Passagem (i = 2):
- Comparar 5 > 6 → Não trocar → [5, 6, 7, 8, 10].
- Comparar 6 > 7 → Não trocar → [5, 6, 7, 8, 10].

Resultado após a terceira passagem: [5, 6, 7, 8, 10].

### Quarta Passagem (i = 3):
- Comparar 5 > 6 → Não trocar → [5, 6, 7, 8, 10].

Resultado final: [5, 6, 7, 8, 10].

---

## Implementação em Java

Aqui está o código completo do Bubble Sort em Java:

```java
public class Main {
    public static void main(String[] args) {
        int[] v = {7, 5, 10, 6, 8};

        // Bubble sort
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }

        // Imprimir o array ordenado
        for (int num : v) {
            System.out.print(num + " ");
        }
    }
}