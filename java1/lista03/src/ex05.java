import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        final int FIM = 0;
        int num, soma = 0, contador = 0;
        double media;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        num = leNumero();
        while (num != FIM){
            contador++;
            num = leNumero();
            soma += num;

            if (num< min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        if (contador>0){
            media = (double) soma/contador;
            System.out.println("Soma = "+ soma);
            System.out.println("Média = " + media);
            System.out.println("Menor = " + min);
            System.out.println("Maior = " + max);
        } else {
            System.out.println("Não há números a serem processados");
        }
    }

    public static int leNumero() {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Entre com um número: ");
        num = entrada.nextInt();

        return num;
    }
}
