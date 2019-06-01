import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int FIM = 0;
        int opcao;
        Calculadora calc;


        opcao = menu();


        while (opcao != FIM) {

            switch (opcao){
                case 1:
                    //todo: continuar a estrutura do codigo para depois da vacina
            }

            opcao = menu();
        }



    }

    public static double leNumero(String string){
        int opcao;
        String input = JOptionPane.showInputDialog(null, string);
        opcao = Integer.parseInt(input);

        return opcao;
    }

    public static int menu(){
        String input;
        int opcao;
        input = JOptionPane.showInputDialog(null, "Digite:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n0 - Sair");
        opcao = Integer.parseInt(input);

        return opcao;

    }
}
