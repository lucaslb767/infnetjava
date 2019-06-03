
public class Log {
    final int TAM = 5;
    private int contador = 0;
    String[] log;


    public Log(){
        log = new String[TAM];
    }

    public String[] getLog() {
        return log;
    }

    public void setLog(String[] log) {
        this.log = log;
    }


    public void adicionaOperacao(int operacao, double n1, double n2, Calculadora calc, String[] log){
        final int ULTIMAPOS = 4;
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
            if (this.contador < 5) {
                log[this.contador] = contaMemorizar;
            } else {
                for (int i = 0; i < ULTIMAPOS; i++) {
                    log[i] = log[i+1];
                }
                log[ULTIMAPOS] = contaMemorizar;
            }
        }
        this.contador ++;
    }


    public String toString(String[] log) {

        return "\nLog das últimas operaões:\n"+log[0] +"\n" + log[1]+"\n" + log[2]+"\n" + log[3]+"\n" + log[4];
    }
}