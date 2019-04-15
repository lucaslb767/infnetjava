//4.	Faça um algoritmo que calcule a gorjeta a ser paga de uma conta de restaurante. A gorjeta é calculada como sendo 10% do valor da conta, que deve ser informado pelo usuário.

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        System.out.print("Quanto deu a conta total? ");
        double conta = dado.nextDouble();

        double gorjeta = conta*0.1;

        System.out.println("A gorjeta ficou no valor de: R$"+gorjeta+ "O valor final da conta é: R$"+(conta+gorjeta));

    }
}
