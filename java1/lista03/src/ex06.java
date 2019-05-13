import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int limInf, limSup;

        limInf = leNumero("Entre com os limites inferior");
        limSup = leNumero("Entre com o limite superior");

        for (int i = limInf; i <=limSup; i++){
            if (verificaPrimo(i)){
                System.out.println(i + "É primo");
            }
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
            }
        }

        return eprimo;
    }

}
