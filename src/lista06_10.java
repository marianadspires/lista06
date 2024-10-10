import java.util.Scanner;
import java.util.Arrays;
public class lista06_10 {
    public static void main(String[] args) {

        int[] pares = new int[10];
        int[] impares = new int[10];
        vetorespareimpar(pares, impares);

    }

    public static void vetorespareimpar(int[] pares, int[] impares) {
        Scanner scanner = new Scanner(System.in);
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = 0; i < 20; i++) {
            if (contadorPares == 10 || contadorImpares == 10) {
                break;
            }
            System.out.print("Insira um número inteiro: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                if (contadorPares < 10) {
                    pares[contadorPares] = numero;
                    contadorPares++;
                }
            } else {
                if (contadorImpares < 10) {
                    impares[contadorImpares] = numero;
                    contadorImpares++;
                }
            }
        }
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}


