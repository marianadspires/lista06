import java.util.Scanner;
public class lista06_12 {
    public static void main(String[] args) {

        int[] vetor = new int[6];
        vetorcase(vetor);
    }

    public static void vetorcase(int[] vetor){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 6 números inteiros para o vetor:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("\nEscolha a opção desejada:");
        System.out.println("1 - Soma dos elementos");
        System.out.println("2 - Produto dos elementos");
        System.out.println("3 - Média dos elementos");
        System.out.println("4 - Mostrar o vetor");
        int opcao = scanner.nextInt();
        int soma = 0;
        int produto = 1;
        switch (opcao) {
            case 1:
                for (int i = 0; i < 6; i++) {
                    soma += vetor[i];
                }
                System.out.println("Soma dos elementos: " + soma);
                break;
            case 2:
                for (int i = 0; i < 6; i++) {
                    produto *= vetor[i];
                }
                System.out.println("Produto dos elementos: " + produto);
                break;
            case 3:
                for (int i = 0; i < 6; i++) {
                    soma += vetor[i];
                }
                double media = (double) soma / 6;
                System.out.println("Média dos elementos: " + media);
                break;
            case 4:
                System.out.println("Elementos do vetor:");
                for (int i = 0; i < 6; i++) {
                    System.out.print(vetor[i] + " ");
                }
                System.out.println();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }


}
