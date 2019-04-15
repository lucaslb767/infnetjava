//2.	Faça um algoritmo para calcular a média de duas notas digitadas pelo usuário.

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int n1 = dado.nextInt();

        System.out.print("Digite o segundo valor: ");
        int n2 = dado.nextInt();

        double resultado = (double) (n1+n2)/2 ;

        System.out.print("A média é: " + resultado);
    }
}
