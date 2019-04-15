//9.	Faça um algoritmo que calcule a área de uma esfera, sendo que o comprimento do raio é informado pelo usuário. A área da esfera é calculada multiplicando-se 4 vezes Pi ao raio ao quadrado.

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.print("Tamanho do raio: ");
        double raio = dado.nextDouble();

        double area = (raio*raio)*3.14*4;

        System.out.println("A area da esfera é "+area);
    }
}
