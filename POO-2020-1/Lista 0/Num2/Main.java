import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite um numero decimal: ");
    double a;
    a = in.nextDouble();

    System.out.printf("ceil(%f) = %.2f\n", a, Math.ceil(a));
    System.out.printf("round(%f) = %d\n", a, Math.round(a));
    System.out.printf("floor(%f) = %.2f\n",a, Math.floor(a));
  }
}