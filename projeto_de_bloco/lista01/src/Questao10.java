//10.	Faça um algoritmo que calcule o volume de uma caixa de água cilíndrica, sendo que os comprimentos do raio e a altura são informados pelo usuário. O volume é calculado multiplicando-se Pi, ao raio ao quadrado, a altura.

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.print("Tamanho do raio: ");
        double raio = dado.nextDouble();

        System.out.println("Altura: ");
        double altura = dado.nextDouble();

        double area = (raio*raio)*3.14*altura;

        System.out.println("A area da esfera é "+area);
    }
}
