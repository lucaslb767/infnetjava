import javax.swing.*;

public class ex04 {
    public static void main(String[] args) {
        final int TAM = 20;
        final int FLAG = 0;
        int[] notas = new int[TAM];
        int cont;
        double media;

        cont = leNotas(notas);
        media = calculaMedia(notas, cont);
        System.out.println("Media = " + media);
        mostraNotas(notas, cont, media);

    }

    public static void mostraNotas(int[] notas, int cont, double media) {
        for (int i= 0; i < cont; i ++){
            if (notas[i] >= media) {
                System.out.println(notas[i]);
            }
        }
    }

    public static double calculaMedia(int[] notas, int cont){
        double media;
        int soma = 0;

        for (int i = 0; i < cont; i++) {
            soma = soma+notas[i];
        }

        media = (double) soma / cont;

        return media;
    }

    public static int leNotas (int[] notas) {
        final int FLAG = 0;
        int num, cont = 0;

        num = leNumero();
        while (num != FLAG) {
            notas[cont] = num;
            cont ++;
            num = leNumero();
        }
        return cont;
    }

    public static int leNumero(){
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um um numero: "));

        return num;
    }
}
