public class Log {
    private int contador = 0;
    String[] log;

    public Log( int TAM){
        log = new String[TAM];
    }

    public String[] getLog() {
        return log;
    }

    public void setLog(String[] log) {
        this.log = log;
    }

    public void adicionaOperacao(int operacao, double n1, double n2, double resultado){
        final int ULTIMAPOS = log.length - 1;
        String contaMemorizar = "";

        switch (operacao) {
            case 1:
                contaMemorizar = n1 + " + " + n2 + " = " + resultado ;
                break;
            case 2:
                contaMemorizar = n1 + " - " + n2 + " = " + resultado;
                break;
            case 3:
                contaMemorizar = n1 + " * " + n2 + " = " + resultado ;
                break;
            case 4:
                contaMemorizar = n1 + " / " + n2 + " = " + resultado;
                break;
            default:
                break;
        }

        if (!contaMemorizar.isEmpty()) {
            if (this.contador < log.length) {
                log[this.contador] = contaMemorizar;
            } else {
                for (int i = 0; i < ULTIMAPOS; i++) {
                    log[i] = log[i+1];
                }
                log[ULTIMAPOS] = contaMemorizar;
            }
            this.contador ++;
        }
    }

    @Override
    public String toString() {

        String resultado = "\nLog das últimas operações:\n";
        for (int i =0; i < this.log.length; i++) {

            if (this.log[i] == null){
                resultado+= "";
            } else {
                resultado += this.log[i] + "\n";
            }
        }
        return resultado;
    }
}