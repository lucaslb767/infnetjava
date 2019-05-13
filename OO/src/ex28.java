public class ex28 {
    public static void main(String[] args) {

        Carro c1 = new Carro("uno", 2.1f);

        System.out.println(c1.velocidadeMaxima);
    }

}

class Carro {

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String modelo;

    Carro (String modelo, float cilindrada) {
        setModelo(modelo);
        Motor motor = new Motor(cilindrada);

        velocidadeMaxima(motor.getCilindrada());
    }

    int velocidadeMaxima;
    Motor motor = new Motor(1.6f);

    public int velocidadeMaxima(float cilindradada) {
        if (cilindradada<= 1.0){
            this.velocidadeMaxima = 140;
        } else if ( cilindradada > 1.0 && cilindradada <= 1.6) {
            this.velocidadeMaxima = 180;
        } else if (cilindradada> 1.6 && cilindradada <= 2.0) {
            this.velocidadeMaxima = 200;
        } else {
            this.velocidadeMaxima = 220;
        }

        return velocidadeMaxima;
    }
}

class Motor {
    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    private float cilindrada;

    Motor(float cilindrada){
        setCilindrada(cilindrada);
    }


}
