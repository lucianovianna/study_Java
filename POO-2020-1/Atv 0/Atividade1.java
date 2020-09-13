import java.util.Scanner;
/* Aluno: Luciano Vianna
201912450*/
public class Atividade1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite os dois numeros: (a e b)");

        a = input.nextInt(); 
        b = input.nextInt(); 
        c = Math.abs(a - b) - 1;

        System.out.println("Existe(m) "+ c +" numero(s) no intervalo entre os 'a' e 'b'");

        int impares = 0, pares = 0, soma = 0;
        float media = 0;

        if(a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        } // gambiarra?

        if(c > 0) {
            for (int i = a+1; i < b; i++) {
                soma += i;
                if(i % 2 == 0) pares++;
                else impares++;
            }
            media = (float)soma/c;
        }

        System.out.println("A soma entre eles é: " + soma);
        System.out.println("A media aritmética é: " + media);
        System.out.println("E existe(m) " + impares + " numero(s) impar(es) e " + pares + " numero(s) par(es)");
    }
}

