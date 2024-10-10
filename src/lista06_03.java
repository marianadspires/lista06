import java.util.Arrays;
public class lista06_03 {

    public static void main(String[] args) {
        int tamanho_vetor = 10;
        int[] vetorB = new int[tamanho_vetor];

        vetorparouimpar(vetorB, tamanho_vetor);
        imprimevetor(vetorB);
    }

    public static void vetorparouimpar(int[] vetorB, int tamanho_vetor) {
        for (int i = 0; i < tamanho_vetor; i++) {
            if (i % 2 == 0) {
                vetorB[i] = 20;
            } else {
                vetorB[i] = 10;
            }
        }
    }

    public static void imprimevetor(int[] vetorB) {
        System.out.println(Arrays.toString(vetorB));
    }
}

