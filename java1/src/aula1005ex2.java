import java.util.Random;

public class aula1005ex2 {
    public static void main(String[] args) {
        final int TAM = 100;
        int soma = 0;
        double media;
        int[] vet = new int[TAM];
        for (int i=0; i < vet.length; i++){
            vet[i] = geraAleatorio();
        }

        for (int i= 0; i<vet.length; i++) {
            soma += vet[i];
        }

        media = (double) soma/vet.length;

        System.out.println("media = " + media);

        for (int i = 0; i< vet.length; i++) {
            if (vet[i]> media)
                System.out.println(vet[i]);
        }
    }

    public static int geraAleatorio(){
        int num;
        Random aleatorio = new Random();

        num = aleatorio.nextInt(100);
        return num;
    }
}
