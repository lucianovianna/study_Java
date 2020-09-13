public class Aluno {
  double nota1, nota2, nota3;

  Aluno(double nota1, double nota2, double nota3) {
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public double media() {
    return (nota1 + nota2 + nota3) / 3.0;
  }

  public static void main(String[] args) {
    Aluno[] aluno = new Aluno[4];
    double mediaGlobal = 0.0;

    aluno[0] = new Aluno(9.4, 5.5, 6.5);
    aluno[1] = new Aluno(4.9, 8.5, 5.6);
    aluno[2] = new Aluno(2.4, 7.5, 8.5);
    aluno[3] = new Aluno(8.4, 6.5, 9.9);

    for (int i = 0; i < 4; i++) {
      System.out.printf("Aluno %d\nNota 1: %.2f\nNota 2: %.2f\nNota 3: %.2f\nMédia: %.2f\n", i + 1, aluno[i].nota1,
          aluno[1].nota2, aluno[i].nota3, aluno[i].media());
      mediaGlobal += aluno[i].media();
    }

    System.out.printf("Média Global: %.2f\n", mediaGlobal / 4.0);
  }
}