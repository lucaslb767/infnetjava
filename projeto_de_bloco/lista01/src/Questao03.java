//3.	Faça um algoritmo para calcular a média de duas notas digitadas pelo usuário, sendo que a segunda nota tem peso dois.

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int n1 = dado.nextInt();

        System.out.print("Digite o segundo valor: ");
        int n2 = dado.nextInt();

        double resultado = (double) (n1*1+n2*2)/(1+2) ;

        System.out.print("A média é: " + resultado);
    }
}
