import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String a, b;
    

    System.out.println("Digite os dois nomes: (a e b)");
    a = input.nextLine();
    b = input.nextLine();

    int n_a = a.length(), n_b = b.length();

    System.out.printf("%s possui %d caracteres\n%s possui %d caracteres\n", a, n_a, b, n_b);

    if(a == b) {
      System.out.println("Os dois nomes são identicos");
    }
    else {
      System.out.println("Os dois nomes são diferentes");
    }

    if(a == a.toUpperCase()) {
      System.out.printf("%s está em escrito em maiusculo\n", a);
    }
    if(b == b.toUpperCase()) {
      System.out.printf("%s está em escrito em letras maiúsculas\n", b);
    }
  }
}