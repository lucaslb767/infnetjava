import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        final int LIMITE = 5;
        int num, soma = 0;
        double media;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i = 1; i<= LIMITE; i++) {
            num = leNumero();
            soma += num;

            if (num< min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        media = (double) soma/LIMITE;

        System.out.println("Soma = "+ soma);
        System.out.println("Média = " + media);
        System.out.println("Menor = " + min);
        System.out.println("Maior = " + max);
    }

    public static int leNumero() {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Entre com um número: ");
        num = entrada.nextInt();

        return num;
    }
}
