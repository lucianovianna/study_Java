import java.util.Scanner;

public class Programa 
{
	public static void validarHorario(Horario a)
	{
		boolean hora = Horario.validarHora(a.getHora());
		boolean minuto = Horario.validarMinuto(a.getMinuto());
		boolean segundo = Horario.validarSegundo(a.getSegundo());

		if(hora && minuto && segundo) {
			System.out.println(a + " está valido.");
		}
		else {
			System.out.println(a + " está invalido.");
		}
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Entre com o horario 1:");
		Horario hr1 = new Horario(in.nextInt(), in.nextInt(), in.nextInt());
		System.out.println("Entre com o horario 2:");
		Horario hr2 = new Horario(in.nextInt(), in.nextInt(), in.nextInt());

		Programa.validarHorario(hr1);
		Programa.validarHorario(hr2);

		System.out.println("Horario 1: " + hr1);
		System.out.println("Horario 2: " + hr2);
		System.out.println("Diferença em minutos: " + Horario.diferencaEmMinutos(hr1, hr2));
	}
}