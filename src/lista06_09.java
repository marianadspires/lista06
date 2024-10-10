import java.util.Arrays;
public class lista06_09 {


    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorB = {11, 22, 33, 4, 5, 66, 77, 88, 9, 100};
        int[] vetorC = new int[20];
        vetoruniao(vetorA, vetorB, vetorC);
    }

    public static void vetoruniao(int[] vetorA, int[] vetorB, int[] vetorC) {
        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + 10] = vetorB[i];
        }
        System.out.println("A união de A e B):");
        for (int i = 0; i < 20; i++) {
            System.out.println("C[" + i + "] = " + vetorC[i]);
        }
    }
}



