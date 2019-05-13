import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int mes;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Entre com um mês: ");
            mes = entrada.nextInt();
            if((mes<1) || (mes>12)){
                System.out.println("Erro: mês invalido");
            }
        } while ((mes<1) || (mes>12));
    }
}
