import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        int n1,n2, soma;

        try {
            n1 = leNumero();
            n2 = leNumero();

            soma = n1 + n2;

            System.out.println("a Soma dos numeros são: "+ soma);
        } catch (Exception e) {
            System.out.println("Erro de entrada inválida");
        }

    }

    public static int leNumero() {
        Scanner entrada = new Scanner(System.in);
        int n;
            System.out.print("digite o numero: ");
            n = entrada.nextInt();

            if (n<= 0){
                System.out.println("Número menor ou igual a 0");
                System.exit(1);
            }

            return n;
    }
}
