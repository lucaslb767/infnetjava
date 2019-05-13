import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        final int FIM = 0;
        int num;

        num = leNumero("Digite o numero");
        while (num != FIM){
           if (verificaPrimo(num)){
               System.out.println("Número é primo");
            } else {
               System.out.println("Número  não é primo");
           }
           num = leNumero("digite o numero");
        }
    }
    public static int leNumero(String string){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print(string);
        num = entrada.nextInt();

        return num;
    }

    public static boolean verificaPrimo(int num){
        boolean eprimo = true;

        for (int i = 2; i < num; i++){
            if (num%i == 0) {
                eprimo = false;

                break;
            } else {

            }
        }

        return eprimo;
    }
}
