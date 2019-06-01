import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int FIM = 0;
        int opcao;
        double n1,n2;
        Calculadora calc;


        opcao = menu();


        while (opcao != FIM) {

            n1 = leNumero("Digite qual o valor de n1: ");
            n2 = leNumero("Digite qual o valor de n2: ");
            calc = new Calculadora(n1 , n2);

            switch (opcao){
                case 1:
                    JOptionPane.showMessageDialog(null, "A soma de "+n1+" e "+n2+" = "+ calc.soma(n1,n2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "A subtração de "+n1+" e "+n2+" = "+ calc.subtrai(n1,n2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "A multiplicação de "+n1+" e "+n2+" = "+ calc.multiplica(n1,n2) );
                    break;
                case 4:
                    if (n2 == 0){
                        JOptionPane.showMessageDialog(null, "O valor de n2 é 0. Não pode dividir por 0");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "A divisão de "+n1+" e "+n2+" = "+ calc.divide(n1,n2));
                    break;

                    default:
                        JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
                        break;
            }

            opcao = menu();
        }



    }


    public static double leNumero(String string){
        double opcao;
        String input = JOptionPane.showInputDialog(null, string);
        if (input == null || input.isEmpty()){
            input = "0";
        }

        opcao = Double.parseDouble(input);

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
