public class Condicionais {
    public Condicionais() {
    }

    public String paridade(int numero) {
        String resposta;

        if (numero%2 == 0) {
            resposta = "Par";
        } else {
            resposta = "Ímpar";
        }

        return resposta;
    }

    public String maior(int x, int y) {
        String resposta;

        if (x > y)
            resposta = "O maior número é "+x;
        else if (x == y)
            resposta = "Os números tem o mesmo valor";
        else
            resposta = "O maior número é " + y;

        return resposta;
    }

    public String maiorMenor (int x, int y, int z){

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        if (x < menor)
            menor = x;
        if (y < menor)
            menor = y;
        if (z < menor)
            menor = z;

        if (x > maior)
            maior = x;
        if (y > maior)
            maior = y;
        if (z > maior)
            maior = z;

        return "O maior número é " +maior+" e o menor número é "+menor+".";

    }
}