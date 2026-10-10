public class Aluno {
    String nome;
    int matricula;
    double[] notas = new double[4];
    int quantidade = 0;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void cadastrarNota(double nota) {
        if (quantidade < 4) {
            notas[quantidade] = nota;
            quantidade++;
        } else {
            System.out.println("Limite de notas atingido.");
        }
    }

    public double calcularMedia() {
        if (quantidade == 0) return 0;

        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += notas[i];
        }
        return soma / quantidade;
    }

    public boolean aprovado() {
        return calcularMedia() >= 7.0;
    }
}