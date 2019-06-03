public class Main {
    public static void main(String[] args) {
        //1
        Pessoa p1 = new Pessoa("Lucas", 29,110);
        p1.setSobrenome("Barrozo");
        //2
        System.out.println(p1.nomeCompleto());
        //3
        p1.setPeso(112);
        System.out.println("Peso p1: "+p1.getPeso());
        //4
        Pessoa p2 = p1;
        //5
        System.out.println("Idade p2: "+p2.getIdade());
        //6
        p1.setIdade(30);
        //7
        System.out.println("Idade p2: "+p2.getIdade());
    }
}
