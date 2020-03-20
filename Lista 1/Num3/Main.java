import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double a, b;

    System.out.println("Digite dois numeros: ");
    a = in.nextDouble();
    b = in.nextDouble();

    if (a > b) {
      System.out.printf("%.2f é maior que %.2f\n", a, b);
    } else if (a == b) {
      System.out.printf("Os dois numeros são iguais\n");
    } else
      System.out.printf("%.2f é maior que %.2f\n", b, a);
  }
}