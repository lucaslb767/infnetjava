/*1.	Faça um algoritmo que troque o valor de duas variáveis. Por exemplo, o algoritmo lê n1 igual a 3 e n2 a 17, e mostra n1 igual a 17 e n2 a 3.*/

public class Questao01 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        int swap = n1;

        System.out.println("Valor de n1: " + n1);
        System.out.println("Valor de n2: " + n2);
        n1 = n2;
        n2 = swap;

        System.out.println("Valor de n1 depois da troca: "+n1);
        System.out.println("Valor de n2 depois da troca: "+n2);

    }
}
