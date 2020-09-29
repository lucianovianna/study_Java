import java.util.Scanner;
import java.util.ArrayList;

public class Principal
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Filme> filmes = new ArrayList<Filme>();

		for(int i = 0; true; i++)
		{
			System.out.printf("Codigo do filme: ");
			int codigo = input.nextInt();
			
			if(codigo == 0) break;

			System.out.printf("Nome: ");
			input.nextLine();
			String nome = input.nextLine();

			filmes.add(new Filme(codigo, nome));

			System.out.printf("Genero: ");
			filmes.get(i).setGenero(input.nextLine());

			System.out.printf("Ano de lançamento: ");
			filmes.get(i).setAno(input.nextInt());

			System.out.printf("Autor principal: ");
			input.nextLine();
			filmes.get(i).setAutorPrincipal(input.nextLine());

			System.out.println();
		}

		System.out.println("\nTotal de filmes: " + Filme.getTotalFilmes() + '\n');

		for (int i = 0; i < filmes.size(); ++i) 
		{
			System.out.println(filmes.get(i) + "\n");	
		}
	}
}