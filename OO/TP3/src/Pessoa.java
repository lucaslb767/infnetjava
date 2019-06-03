public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double peso;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa (String nome, int idade, double peso){
        this.nome = nome;
        setIdade(idade);
        setPeso(peso);
    }

    public Pessoa(String nome, String sobrenome, String logradouro, String numero, String complemento, String bairro, String municipio, String estado, String pais){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = new Endereco(logradouro,numero,complemento,bairro,municipio,estado,pais);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String nomeCompleto() {
        return this.nome +" "+this.sobrenome;
    }

    public String iniciais() {
        return this.nome.charAt(0)+""+this.sobrenome.charAt(0);
    }

    public boolean doadorDeSangue() {
        boolean resposta;
        if ((this.idade>= 18 && this.idade<=69) && this.peso >= 50)
            resposta = true;
        else
            resposta = false;

        return resposta;
    }

    public String destinatario() {
        return nomeCompleto()+". "+ endereco.imprimir();
    }

}

