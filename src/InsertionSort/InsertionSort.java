package InsertionSort;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha o tamanho do array:");
        int tam = scanner.nextInt();
        System.out.println("Vetor aleatorio:");
        int[] v = new int[tam];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
            System.out.print(v[i] + " ");
        }
        System.out.println();
        insertionSort(v);
        System.out.println("Vetor ordenado");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public static void insertionSort(int[] v) {
        int n = v.length;

        for (int i = 1; i < n; i++) {
            int chave = v[i];
            int j = i - 1;

            // Move os elementos maiores que a chave para a direita
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }
}