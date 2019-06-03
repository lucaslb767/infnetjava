public class Calculadora {
    private double n1 = 0;
    private double n2 = 0;

    public Calculadora() {
    }

    public Calculadora(double n1, double n2){
        setN1(n1);
        setN2(n2);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }


    public static double soma(double n1, double n2){
        return n1 + n2;
    }

    public  double soma(){
        return this.getN1() + this.getN2();
    }

    public static double subtrai(double n1, double n2) {
        return n1 - n2;
    }

    public double subtrai () {
        return this.getN1() - this.getN2();
    }

    public static double multiplica(double n1, double n2) {
        return n1*n2;
    }

    public double multiplica() {
        return this.getN1()*this.getN2();
    }

    public static double divide(double n1, double n2) {
        return n1/n2;
    }

    public double divide () {
        return this.getN1()/this.getN2();
    }

    @Override
    public String toString() {
        return "Calculadora";
    }
}
