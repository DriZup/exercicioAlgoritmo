package InsertionSort;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        insertionSort(array);

        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
