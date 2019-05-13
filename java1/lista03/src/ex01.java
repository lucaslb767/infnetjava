import java.security.spec.ECFieldF2m;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        final char FIM = '.';
        char car;
        car = leCaracter();
        int contaVogal = 0;

        while (car != FIM){

            switch (car){
                case 'a': case 'e' : case 'i' : case 'o': case 'u':
                    contaVogal++;
            }
            car = leCaracter();
        }

        System.out.println("Total de vogal = "+contaVogal);
    }
    public static char leCaracter() {
        Scanner entrada = new Scanner(System.in);
        char car;
        String linha;

        System.out.print("Entre com um caracter: ");
        linha = entrada.nextLine().toLowerCase();
        car = linha.charAt(0);
        return car;

    }
}
