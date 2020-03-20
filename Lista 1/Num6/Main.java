import java.util.Scanner;

class Main {
  void sort(double v[], String token) {
    int n = v.length;
    for (int i = 1; i < n; ++i) {
      double key = v[i];
      double x = 1;

      int j = i - 1;

      if(token == "descending") x = -1;

      while (j >= 0 && v[j] > x * key) {
        v[j + 1] = v[j];
        j = j - 1;
      }
      v[j + 1] = key;
    }
  }

  void printArray(double v[]) {
    int n = v.length;

    for (int i = 0; i < n; i++) {
      System.out.print(v[i]);
      if (i < n - 1) {
        System.out.print(", ");
      }
    }

    System.out.println();
  }

  void search(double v[], double target) {
    int n = v.length;

    for (int i = 0; i < n; i++) {
      if (v[i] == target) {
        System.out.println(target + " foi encontrado no array!");
      } else if (i == n-1) {
        System.out.println(target + " não foi encontrado no array!");
      }
    }
  }

  public static void main(String[] args) {
    Main Num6 = new Main();

    Scanner in = new Scanner(System.in);

    System.out.println("Digite o tamanho do array:");
    int n = in.nextInt();

    double v[] = new double[n];
    double vAsc[] = new double[n];
    double vDesc[] = new double[n];

    System.out.println("Digite os valores do array:");
    for (int i = 0; i < n; i++) {
      v[i] = in.nextDouble();
    }

    vAsc = v;
    vDesc = v;

    System.out.println("\nEm ordem crescente:");
    Num6.sort(vAsc, "ascending");
    Num6.printArray(vAsc);

    System.out.println("\nEm ordem decrescente:");
    Num6.sort(vDesc, "descending");
    Num6.printArray(vDesc);

    System.out.println("\nDigite o numero que deseja procurar no array:");
    double x = in.nextDouble();

    Num6.search(v, x);

  }
}