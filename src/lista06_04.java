import java.util.Arrays;
import java.util.Scanner;
public class lista06_04 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        vetorpar(vetor);
        showvetor(vetor);
    }

    public static void vetorpar(int[] vetor) {
        int countPares = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Índice " + i + ": " + vetor[i]);
            if (vetor[i] % 2 == 0) {
                countPares++;
            }
        }
        System.out.println("Quantidade de números pares: " + countPares);
    }

    public static void showvetor(int[] vetor) {
        System.out.println(Arrays.toString(vetor));
    }
}
