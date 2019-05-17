import javax.swing.*;

public class ex03 {
    public static void main(String[] args) {
        final int FIM = 0;
        final int TAM = 5;
        int[] vet = new int[TAM];
        int num, cont = 0;

        num = leNumero();

        while( num != FIM ) {
            vet[cont] = num;
            cont++;
            if ( cont == TAM ){

                JOptionPane.showMessageDialog(null, "numero de input igual ao tamanho do vetor");
                break;
            }

            num = leNumero();
        }

        System.out.println("");

        mostraVetor(vet, cont);

        for (int i = cont -1; i >= 0; i--){
            System.out.printf("%d ", vet[i]);
        }
        System.out.println("");
    }

    public static void mostraVetor(int[] vetor, int cont){



        for (int i = 0; i < cont; i++) {
            System.out.printf("%d ", vetor[i]);
        }
    }

    public static int leNumero(){
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um um numero: "));

        return num;
    }
}
