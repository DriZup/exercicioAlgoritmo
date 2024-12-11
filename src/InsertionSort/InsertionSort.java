package InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numeros = {8, 3, 5, 1, 9};

        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 1; i < numeros.length; i++) {
            int atual = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] > atual) {
                numeros[j + 1] = numeros[j];
                j--;
            }

            numeros[j + 1] = atual;
        }

        System.out.println("Array ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
