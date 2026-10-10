public class Turma {
    Aluno[] alunos;
    int quantidade = 0;

    public Turma(int capacidade) {
        alunos = new Aluno[capacidade];
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidade < alunos.length) {
            alunos[quantidade++] = aluno;
        }
    }

    public void listarAprovados() {
        for (Aluno a : alunos) {
            if (a != null && a.aprovado()) {
                System.out.println(a.nome);
            }
        }
    }

    public void listarReprovados() {
        for (Aluno a : alunos) {
            if (a != null && !a.aprovado()) {
                System.out.println(a.nome);
            }
        }
    }
}