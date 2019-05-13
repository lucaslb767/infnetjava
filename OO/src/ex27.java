import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a1 = s.nextLine();
        leVogais(a1);

        String a2 = semVogais(a1);
        System.out.println(a2);
    }

    public static void leVogais(String string) {
        String[] dividida = string.split("");

        int contador = 0;


        for (String obj : dividida){

            if (obj.toLowerCase().equalsIgnoreCase("a") || obj.toLowerCase().equalsIgnoreCase("e") || obj.toLowerCase().equalsIgnoreCase("i") || obj.toLowerCase().equalsIgnoreCase("o") || obj.toLowerCase().equalsIgnoreCase("u") ) {
                System.out.println(obj);
                contador ++;

            }
        }

        System.out.println("Quantidade de vogais: " + contador);
    }

    public static String semVogais(String string) {
        String[] dividida = string.split("");
        String semVogal = "";

        for (String obj : dividida){

            if (obj.toLowerCase().equalsIgnoreCase("a") || obj.toLowerCase().equalsIgnoreCase("e") || obj.toLowerCase().equalsIgnoreCase("i") || obj.toLowerCase().equalsIgnoreCase("o") || obj.toLowerCase().equalsIgnoreCase("u") ) {

            } else {
                semVogal += obj;
            }
        }

        return semVogal;
    }

}

