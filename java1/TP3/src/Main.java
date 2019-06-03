import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final int FIM = 0;
        final int OPERACOES = 4;

        int opcao;
        double n1,n2;

        Calculadora calc;
        int[] contOperacoes = new int[OPERACOES];
        Log logMemoria = new Log();
        opcao = menu();

        while (opcao != FIM) {

            calc = new Calculadora();
            contaOperacao(opcao, contOperacoes);

            switch (opcao){
                case 1:
                    n1 = leNumero("Digite qual o valor de n1: ");
                    n2 = leNumero("Digite qual o valor de n2: ");
                    JOptionPane.showMessageDialog(null, calc.toString() +"\nA soma de "+n1+" e "+n2+" = "+ calc.soma(n1,n2));
                    logMemoria.adicionaOperacao(opcao,n1,n2,logMemoria.getLog());
                    break;
                case 2:
                    n1 = leNumero("Digite qual o valor de n1: ");
                    n2 = leNumero("Digite qual o valor de n2: ");
                    JOptionPane.showMessageDialog(null, calc.toString() +"\nA subtração de "+n1+" e "+n2+" = "+ calc.subtrai(n1,n2));
                    logMemoria.adicionaOperacao(opcao,n1,n2,logMemoria.getLog());
                    break;
                case 3:
                    n1 = leNumero("Digite qual o valor de n1: ");
                    n2 = leNumero("Digite qual o valor de n2: ");
                    JOptionPane.showMessageDialog(null, calc.toString() +"\nA multiplicação de "+n1+" e "+n2+" = "+ calc.multiplica(n1,n2) );
                    logMemoria.adicionaOperacao(opcao,n1,n2,logMemoria.getLog());
                    break;
                case 4:
                    n1 = leNumero("Digite qual o valor de n1: ");
                    n2 = leNumero("Digite qual o valor de n2: ");
                    if (n2 == 0){
                        JOptionPane.showMessageDialog(null, calc.toString() +"\nO valor de n2 é "+n2+". Não pode dividir por 0");
                        logMemoria.adicionaOperacao(opcao,n1,n2,logMemoria.getLog());
                        break;
                    }
                    JOptionPane.showMessageDialog(null, calc.toString() +"\nA divisão de "+n1+" e "+n2+" = "+ calc.divide(n1,n2));
                    logMemoria.adicionaOperacao(opcao,n1,n2,logMemoria.getLog());
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, formataContOperacoes(contOperacoes)+logMemoria.toString(logMemoria.getLog()));
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
                        break;
            }
            opcao = menu();
        }
    }

    public static String formataContOperacoes(int[] contOperacoes) {
        return "Número de vezes que cada operação foi usada: \n"+"Soma: "+contOperacoes[0]+"\n"+"Subtração: "+contOperacoes[1]+"\n"+"Multiplicação: "+contOperacoes[2]+"\n"+"Divisão: "+contOperacoes[3]+"\n";
    }

    public static void contaOperacao(int operacao, int[] contOperacoes) {
        switch (operacao){
            case 1:
                contOperacoes[0]++;
                break;
            case 2:
                contOperacoes[1]++;
                break;
            case 3:
                contOperacoes[2]++;
                break;
            case 4:
                contOperacoes[3]++;
                break;

            default:
                break;
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
