public class ex33 {
    public static void main(String[] args) {

        CD c1 = new CD(1,"Cd de musica",12.2f,10.2f,"Rolling Stones");
        Livro l1 = new Livro(2,"livro bom", 100.23f,100f,"JK");
        Software s1 = new Software(3,"Software bom",500.32f,10f,"Machine Learning");

        System.out.println(s1.getCategoria());
        System.out.println(l1.getCodigo());
    }
}

class Produto{

    protected int codigo;
    protected String descricao;
    protected float preco;
    protected float peso;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    Produto(int codigo, String descricao, float preco, float peso) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
    }

}

class CD extends Produto {

    public String getNomeDaBanda() {
        return nomeDaBanda;
    }

    private String nomeDaBanda;

    CD(int codigo, String descricao, float preco, float peso, String nomeDaBanda) {
        super(codigo, descricao, preco, peso);

        this.nomeDaBanda = nomeDaBanda;
    }
}

class Livro extends Produto{
    public String getAutor() {
        return autor;
    }

    private String autor;

    Livro(int codigo, String descricao, float preco, float peso, String autor) {
        super(codigo, descricao, preco, peso);

        this.autor = autor;
    }
}

class Software extends Produto{

    public String getCategoria() {
        return categoria;
    }

    private String categoria;

    Software(int codigo, String descricao, float preco, float peso, String categoria) {
        super(codigo, descricao, preco, peso);
        this.categoria = categoria;

    }
}