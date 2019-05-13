import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        int num, numNumeros;

        numNumeros = leNumero("Entre com o número de numeros: ");

        int soma = 0;
        double media;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i = 1; i<= numNumeros; i++) {
            num = leNumero("entre com o número");
            soma += num;

            if (num< min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        media = (double) soma/numNumeros;

        System.out.println("Soma = "+ soma);
        System.out.println("Média = " + media);
        System.out.println("Menor = " + min);
        System.out.println("Maior = " + max);

    }

    public static int leNumero(String string) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print(string);
        num = entrada.nextInt();

        return num;
    }
}
