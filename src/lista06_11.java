import java.util.Scanner;
public class lista06_11 {

    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        vetorordemcrescente(vetorA);
    }

    public static void vetorordemcrescente(int[] vetorA) {
        System.out.println("Vetor em ordem crescente:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
    }
}
