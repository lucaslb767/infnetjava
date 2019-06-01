import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int FIM = 0;
        String input;
        int opcao;
        Calculadora calc;

        input = JOptionPane.showInputDialog(null, "Digite:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n0 - Sair");
        System.out.println(input);
        opcao = Integer.parseInt(input);
        System.out.println(opcao);


        while (opcao != FIM) {
            case 1:


        }



    }

    public static double leNumero(String string){
        String input = JOptionPane.showInputDialog(null, string);

    }
}
