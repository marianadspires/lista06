import java.util.Arrays;
import java.util.Scanner;
public class lista06_07 {
    public static void main(String[] args) {

        int[] vetorX = new int[10];
        int[] vetorY = new int[10];

        imprimevetor(vetorX);
        vetorparouimpar((vetorX), (vetorY));
        imprimevetor(vetorY);

    }

    public static void vetorparouimpar(int[] vetorX, int[] vetorY) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os 10 números do vetor X:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + i + ": ");
            vetorX[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetorY[i] = vetorX[i] * 2;
            } else {
                vetorY[i] = vetorX[i] * 3;
            }
        }
    }

    public static void imprimevetor(int[] vetorY){
        System.out.println(Arrays.toString(vetorY));
    }
}