import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite 10 números inteiros: ");

    int v[] = new int[11];
    int vInv[] = new int[11];
    long vQuad[] = new long[11];

    int soma = 0;
    double media = 0.0;

    for (int i = 0; i < 10; i++) {
      v[i] = in.nextInt();
      soma += v[i];

      vQuad[i] = v[i] * v[i];
    }

    media = soma / 10.0;

    System.out.printf("Soma: %d\nMédia: %.2f\n", soma, media);

    System.out.printf("Vetor invertido: \n");
    for (int i = 9, j = 0; i >= 0; i--, j++) {
      vInv[j] = v[i];

      System.out.print(vInv[j]);
      if (j < 9)
        System.out.print(", ");
    }

    System.out.printf("\nVetor com valores ao quadrado:\n");
    for (int i = 0; i < 10; i++) {
      System.out.print(vQuad[i]);
      if (i < 9)
        System.out.print(", ");
    }
    System.out.printf("\n");
  }
}