import java.util.Arrays;
public class lista06_01 {

    public static void main(String[] args) {
        int tamanho_vetor = 10;
        int[] vetor1 = new int[tamanho_vetor];

        preenchevetor(vetor1, tamanho_vetor);
    }

    public static void preenchevetor(int[] vetor1, int tamanho_vetor) {
        for (int i = 0; i < tamanho_vetor; i++) {
            vetor1[i] = 30;
            System.out.println(vetor1[i]);
        }


    }
}



