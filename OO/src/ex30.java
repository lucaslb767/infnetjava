public class ex30 {
    public static void main(String[] args) {

        Curso c = new Curso("informatica", 50);
        Aluno a = new Aluno(1, "Lucas");
        c.matricular(a);
        c.imprimir();
    }
}

class Aluno {
    private int matricula;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno (int matricula, String nome){
        setMatricula(matricula);
        setNome(nome);
    }
}

class Curso {

    private Aluno[] matriculados;
    private String nome;
    private static int qtdAlunos = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Curso(String nome, int nVagas){

        setNome(nome);
        this.matriculados= new Aluno[nVagas];
    }

    public boolean matricular(Aluno a){
        for (int i = 0; i < qtdAlunos; i++){
            if(a.getMatricula() == matriculados[i].getMatricula()){
                return false;
            }
        }
        matriculados[qtdAlunos] = new Aluno(a.getMatricula(),a.getNome());
        qtdAlunos++;

        return true;
    }

    public boolean cancelarMatricula(int matricula) {
        for (int i = 0; i < qtdAlunos; i++){
            if(matriculados[i].getMatricula() == matricula){
                if (i != qtdAlunos){
                    matriculados[i].setMatricula(matriculados[qtdAlunos].getMatricula());
                    matriculados[i].setNome(matriculados[qtdAlunos].getNome());
                } else {
                    matriculados[i] = null;
                }
                qtdAlunos --;
            }
        }

        return false;

    }

    public void imprimir() {

        System.out.println("Curso: " + nome);
        System.out.println("Alunos:");

        for(int i = 0; i < qtdAlunos; i++) {
            System.out.println("Nome: " + matriculados[i].getNome() + ", matricula: "+ matriculados[i].getMatricula());

        }

    }
}