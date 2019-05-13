import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        int num;

        num = leNumero();
        if (verificaPrimo(num)){
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }

    public static int leNumero(){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Entre com um número: ");
        num = entrada.nextInt();

        return num;
    }

    public static boolean verificaPrimo(int num){
        boolean eprimo = true;

        for (int i = 2; i < num; i++){
            if (num%i == 0) {
                eprimo = false;
                break;
            }
        }

        return eprimo;
    }
}
