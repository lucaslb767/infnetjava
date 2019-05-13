import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        int dia,mes,ano;

        dia = leData("Entre com o dia: ");
        mes = leData("Entre com o mes: ");
        ano = leData("Entre com o ano: ");

        if(ano<1900) {
            System.out.println("ano invalido");
        } else {
            switch (mes) {
                case 4: case 6: case 9: case 11:
                    if ((dia <1) || (dia> 30)) {
                        System.out.println("Dia invalido");
                    }
                    break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if ((dia < 1)||(dia > 31)) {
                        System.out.println("dia invalido");
                    }
                    break;

                case 2:
                    if ((ano % 4 ==0)){
                        if ((dia <1 ) || (dia > 29)) {
                            System.out.println("dia invalido");
                        }
                    } else {
                        if ((dia < 1) || (dia > 28)) {
                            System.out.println("dia invalido");
                        }
                    }
                    break;

                default:
                    System.out.println("Mês invalido");
            }
        }
    }

    public static int leData(String msg) {
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.print(msg);
        num = entrada.nextInt();

        return num;

    }
}
