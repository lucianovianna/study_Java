import java.util.Scanner;

class Main {
  boolean checker(String s, String token) {
    if(s.length() == 0) return false;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      boolean x;

      if (token == "Name") { // se for 'name' deve-se verificar se há números em meio aos chars
        x = Character.isDigit(c);
      } else { // se for 'phone' deve-se verificar se há chars em meio aos números
        x = !Character.isDigit(c);
      }

      if (x) {
        // System.out.printf("-DEBUG - %c \n", c);
        return false;
      } 
    }

    return true;
  }

  public static void main(String[] args) {
    Main Num7 = new Main();

    Scanner in = new Scanner(System.in);

    String name, phone;

    do {
      System.out.println("Digite o nome (não deve conter números): ");
      name = in.nextLine();
    } while (!Num7.checker(name, "Name"));

    do {
      System.out.println("Digite o número de telefone (não deve conter letras): ");
      phone = in.nextLine();
    } while (!Num7.checker(phone, "Phone"));

    System.out.printf("Nome: %s\nTelefone: %s\n", name, phone);
  }
}