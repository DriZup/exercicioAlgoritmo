import java.util.Scanner;

public class BubbleSort {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha o tamanho do array:");
        int tam = scanner.nextInt();

        int[] v = new int[tam];

        System.out.println("agora digite os elementos do array:");
        for (int i = 0; i < tam; i++) {
            v[i] = scanner.nextInt();
        }

        bubbleSort(v);
        System.out.println("array ordenado:");
        for (int num : v) {
            System.out.print(num + " ");
        }
    }
}
