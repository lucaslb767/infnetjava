import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        int[] vet = {10,20,30,40,50,60,70,80};
        int num;

        num = leNumero();
        if (pesquisa(vet,num)) {
            System.out.println("achou");
        } else {
            System.out.println("Nao achou");
        }

    }

    public static boolean pesquisa (int[] vet, int num) {
        boolean achou = false;

        for (int i = 0; i< vet.length; i++){
            if (vet[i] == num) {
                achou = true;
                break;
            }
        }

        return achou;
    }

    public static int leNumero() {
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.print(" Entre com um numero: ");
        num = entrada.nextInt();
        return num;
    }
}
