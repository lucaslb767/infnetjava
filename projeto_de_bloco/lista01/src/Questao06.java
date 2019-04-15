//6.	Faça um algoritmo que calcule a área de um quadrado, sendo que o comprimento do lado é informado pelo usuário. A área do quadrado é calculada elevando-se o lado ao quadrado.

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.print("Lado do quadrado: ");
        double lado = dado.nextDouble();

        double area = lado*lado;

        System.out.println("O quadrado de lado "+ lado+ ", possui area de "+ area);
    }
}
