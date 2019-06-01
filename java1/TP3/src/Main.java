import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final int FIM = 0;
        final int OPERACOES = 4;
        final int TAM = 5;
        int opcao,contador = 0, contSoma = 0, contSub = 0, contMult = 0, contDiv = 0;
        double n1,n2;

        Calculadora calc;
        String[] log = new String[TAM];
        Log logMemoria;
        opcao = menu();

        while (opcao != FIM) {

            calc = new Calculadora();
            logMemoria = new Log();


            switch (opcao){
                case 1:
                    n1 = leNumero("Digite qual o valor de n1: ");
                    n2 = leNumero("Digite qual o valor de n2: ");
                    JOptionPane.showMessageDialog(null, calc.toString() +"\nA soma de "+n1+" e "+n2+" = "+ calc.soma(n1,n2));
                    logMemoria.adicionaOperacao(opcao,n1,n2,contador,log);
                    break;
                case 2:
                    n1 = leNumero("Digite qual o valor de n1: ");
                    n2 = leNumero("Digite qual o valor de n2: ");
                    JOptionPane.showMessageDialog(null, calc.toString() +"\nA subtração de "+n1+" e "+n2+" = "+ calc.subtrai(n1,n2));
                    logMemoria.adicionaOperacao(opcao,n1,n2,contador,log);
                    break;
                case 3:
                    n1 = leNumero("Digite qual o valor de n1: ");
                    n2 = leNumero("Digite qual o valor de n2: ");
                    JOptionPane.showMessageDialog(null, calc.toString() +"\nA multiplicação de "+n1+" e "+n2+" = "+ calc.multiplica(n1,n2) );
                    logMemoria.adicionaOperacao(opcao,n1,n2,contador,log);
                    break;
                case 4:
                    n1 = leNumero("Digite qual o valor de n1: ");
                    n2 = leNumero("Digite qual o valor de n2: ");
                    if (n2 == 0){
                        JOptionPane.showMessageDialog(null, calc.toString() +"\nO valor de n2 é "+n2+". Não pode dividir por 0");
                        logMemoria.adicionaOperacao(opcao,n1,n2,contador,log);
                        break;
                    }
                    JOptionPane.showMessageDialog(null, calc.toString() +"\nA divisão de "+n1+" e "+n2+" = "+ calc.divide(n1,n2));
                    logMemoria.adicionaOperacao(opcao,n1,n2,contador,log);
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, logMemoria.toString(log));
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
                        break;
            }
            contador++;
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
        input = JOptionPane.showInputDialog(null, "Digite:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Log\n0 - Sair");
        opcao = Integer.parseInt(input);

        return opcao;
    }
}
