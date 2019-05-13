import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {

        final int FIM = 0;
        int num,soma = 0;


        num = leNumero();
        while (num != FIM) {
            soma += num;
            num = leNumero();
        }

        System.out.println("soma = " + soma);
    }

    public static int leNumero(){
        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        n = entrada.nextInt();

        return n;
    }
}
