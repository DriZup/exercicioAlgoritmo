import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha o tamanho do array:");
        int tam = scanner.nextInt();
        int[] v = new int[tam];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
            System.out.print(v[i] + " ");
        }
        System.out.println();
        bubbleSort(v);
        System.out.println("Vetor ordenado");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public static void bubbleSort(int[] v) {
        int n = v.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    // Troca os elementos fora de ordem
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
    }
}