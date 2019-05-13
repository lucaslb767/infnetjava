import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        int n1,n2,n3;

        n1 = leNumero();
        n2 = leNumero();
        n3 = leNumero();

        if ((n1>n2) && (n1>n3) && (n2>n3)) {
            System.out.println(n1 + " " + n2 +" " + n3);
        }

        else if ((n1>n2) && (n1>n3) && (n3>n2)) {
            System.out.println(n1 + " " + n3 +" " + n2);
        }

        else if ((n2>n1) && (n2>n3) && (n1>n3)) {
            System.out.println(n2 + " " + n1 +" " + n3);
        }

        else if ((n2>n1) && (n2>n3) && (n3>n1)) {
            System.out.println(n2 + " " + n3 +" " + n1);
        }

        else if ((n3>n1) && (n3>n2) && (n1>n2)) {
            System.out.println(n3 + " " + n1 +" " + n2);
        }

        else if ((n3>n1) && (n3>n2) && (n2>n1)) {
            System.out.println(n3 + " " + n2 +" " + n1);
        }


    }

    public static int leNumero() {
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre um número: ");
        num = entrada.nextInt();

        return num;

    }
}
