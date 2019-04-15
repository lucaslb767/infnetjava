//5.	Faça um algoritmo que calcule o novo valor de um salário a partir de um valor percentual de reajuste. O valor atual do salário e o valor percentual do reajuste devem ser informados pelo usuário como, por exemplo, 7,3%.

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        System.out.print("Informe o valor do salário base: ");
        double salarioBase = dado.nextDouble();

        System.out.print("Informe o valor do reajuste: ");
        double reajuste = dado.nextDouble()/100;

        double salarioFinal = salarioBase*(1 + reajuste);

        System.out.println("O salario base de R$"+salarioBase+ " acrescido do reajuste de "+reajuste*100+"%, resulta no salario final de R$"+salarioFinal);
    }
}
