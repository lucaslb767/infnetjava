//8.	Faça um algoritmo que calcule a área de um círculo, sendo que o comprimento do raio é informado pelo usuário. A área do círculo é calculada multiplicando-se Pi ao raio ao quadrado.

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.print("Tamanho do raio: ");
        double raio = dado.nextDouble();

        double area = (raio*raio)*3.14;
        System.out.println("A area do circulo é "+area);
    }
}
