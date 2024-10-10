import java.util.Arrays;
public class lista06_02 {


    public static void main(String[] args) {
        int tamanho_vetor = 10;
        int[] vetor1 = new int[tamanho_vetor];

        vetorpreenchemais10(vetor1, tamanho_vetor);
    }

    public static void vetorpreenchemais10(int[] vetor1, int tamanho_vetor) {
        for (int i = 0; i < tamanho_vetor; i++) {
            vetor1[i] = (i + 1) * 10;
            System.out.println(vetor1[i]);
        }
    }
}

