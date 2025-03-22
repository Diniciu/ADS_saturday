package exercicio_java;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Marta");
        aluno1.setNota(10);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota: " + aluno1.getNota());
    }
}
