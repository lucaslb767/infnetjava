import javax.swing.*;

public class Log {

    public Log(){

    }

    public Log (int operacao, double n1, double n2,int contador, String[] log) {
        adicionaOperacao(operacao, n1, n2, contador, log);
    }

    public static void adicionaOperacao(int operacao, double n1, double n2,int contador, String[] log){
        final int ULTIMAPOS = 4;
        Calculadora calc = new Calculadora();
        String contaMemorizar = "";


        switch (operacao) {
            case 1:
                contaMemorizar = n1 + " + " + n2 + " = " + calc.soma(n1,n2);
                break;
            case 2:
                contaMemorizar = n1 + " - " + n2 + " = " + calc.subtrai(n1,n2);
                break;
            case 3:
                contaMemorizar = n1 + " * " + n2 + " = " + calc.multiplica(n1,n2);
                break;
            case 4:
                contaMemorizar = n1 + " / " + n2 + " = " + calc.divide(n1,n2);
                break;
            default:
                break;
        }

        if (!contaMemorizar.isEmpty()) {
            if (contador < 5) {
                log[contador] = contaMemorizar;
            } else {
                for (int i = 0; i < ULTIMAPOS; i++) {
                    log[i] = log[i+1];
                }
                log[ULTIMAPOS] = contaMemorizar;
            }
        }
    }

    public void contaOperacao(int operacao,int contSoma, int contSub, int contMult, int contDiv, int[] contOperacoes) {

    }

    public String toString(String[] log) {

        return log[0] +"\n" + log[1]+"\n" + log[2]+"\n" + log[3]+"\n" + log[4];
    }
}
