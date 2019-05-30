import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int FIM = 0;
        ArrayList<Aluno> turma = new ArrayList<>();
        int opcao;

        opcao = menu();
        while (opcao != FIM) {
            switch (opcao) {
                case 1:
                    incluir(turma);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    listar(turma);
                    break;
            }

            opcao = menu();
        }
//
    }

    public static void incluir(ArrayList<Aluno> turma) {

        String nome;
        int n1,n2;

        nome = leNome();
        n1 = leNumero("Entre com a nota: ");
        n2 = leNumero("Entre com a nota: ");
        turma.add(new Aluno(nome, n1, n2));
    }

    public static void listar(ArrayList<Aluno> turma) {
        if (turma.isEmpty()) {
            System.out.println("Turma vazia");
            return;
        }

        for (Aluno aluno:turma) {
            System.out.println(aluno);
        }
    }

    public static String leNome() {
        String nome;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o nome: ");
        nome = entrada.nextLine();
        return nome;
    }

    public static int menu() {
        int opcao;
        Scanner entrada= new Scanner(System.in);

        do {
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Listar");
            System.out.println("0 - Sair");
            opcao = leNumero("Entre com uma opção: ");

            if ((opcao < 0) || (opcao >4)) {
                System.out.println("Erro: opção inválida");
            }
        } while ((opcao < 0) || (opcao >4));
        return opcao;

    }

    public static int leNumero(String string) {
        Scanner entrada= new Scanner(System.in);
        int num = 0;
        boolean ok = false;

        do {
            try {
                System.out.print(string);
                num = entrada.nextInt();
                ok = true;
            }
            catch (Exception e) {
                System.out.println(e);
                entrada.nextLine();
            }
        } while (!ok);
        return num;
    }
}

 //   final int TAM = 100;
//        Aluno[] turma = new Aluno[TAM];
//        int cont = 0;
//        Aluno aluno1 = new Aluno("Lucas", 9,10);
//
//        turma[cont] = aluno1;
//        cont++;
//
//        Aluno aluno2 = new Aluno("Tristan", 10,7);
//
//        turma[cont] = aluno2;
//        cont++;
//
//        for (int i = 0; i < cont; i++){
//            System.out.println(turma[i]);
//        }


//        ArrayList<Aluno> turma = new ArrayList<>();
//        Aluno a1 = new Aluno("A",2,3);
//        Aluno a2 = new Aluno("b",2,3);
//
//        turma.add(a1);
//        turma.add(a2);
//
//        for (int i= 0; i < turma.size(); i++){
//            System.out.println(turma.get(i));
//        }
//
//        for (Aluno aluno:turma) {
//            System.out.println(aluno);
//        }