import java.util.Arrays;
import java.util.Scanner;
public class lista06_08 {

    public static void main(String[] args) {
        int[] vetorM = new int[10];
        preenchevet(vetorM);
    }

    public static void preenchevet(int[] vetorM) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 10 elementos do vetor M:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorM[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int temp = vetorM[i];
            vetorM[i] = vetorM[9 - i];
            vetorM[9 - i] = temp;
        }
        System.out.println(Arrays.toString(vetorM));
    }
}









