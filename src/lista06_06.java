import java.util.Arrays;
public class lista06_06 {

    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        System.out.println("Imprime os números e suas respectivas posições:");
        imprimeVetorComPosicoes(vetorA);
    }

    public static void imprimeVetorComPosicoes(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                System.out.println("Índice " + i + ": " + vetor[i]);
            }
        }
    }
}


