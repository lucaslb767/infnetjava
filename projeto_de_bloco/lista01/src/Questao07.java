//7.	Faça um algoritmo que calcule a área de um retângulo, sendo que os comprimentos da altura e da base são informados pelo usuário. A área do retângulo é calculada multiplicando-se a altura pela base.

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.print("Qual é a base: ");
        double base = dado.nextDouble();

        System.out.print("Qual é a altura: ");
        double altura = dado.nextDouble();

        double area = base*altura;

        System.out.println("A area do retangulo é de "+area);
    }
}
