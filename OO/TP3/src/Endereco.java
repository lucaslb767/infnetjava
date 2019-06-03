public class Endereco {

    String logradouro, numero, complemento, bairro, municipio, estado, pais;

    public Endereco(String logradouro, String numero, String complemento, String bairro, String municipio, String estado, String pais) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.pais = pais;
    }

    public Endereco(){

    }

    public String imprimir(){
        return logradouro +", "+numero+ " - "+complemento+", "+bairro+", "+municipio+" - "+estado+" - "+pais;
    }
}
