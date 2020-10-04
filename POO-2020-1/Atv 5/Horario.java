public class Horario
{
	private int hora;
	private int minuto;
	private int segundo;

	Horario(int hora)
	{
		this.hora = hora;
		this.minuto = this.segundo = 0;
	}

	Horario(int hora, int minuto, int segundo)
	{
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return this.hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return this.minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return this.segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public static boolean validarHora(int hora)
	{
		if(hora < 0 || hora > 24) {
			return false;
		}
		else {
			return true;
		}
	}

	public static boolean validarMinuto(int minuto)
	{
		if(minuto < 0 || minuto > 59) {
			return false;
		}
		else {
			return true;
		}
	}

	public static boolean validarSegundo(int segundo)
	{
		if(segundo < 0 || segundo > 59) {
			return false;
		}
		else {
			return true;
		}
	}

	public static int diferencaEmMinutos(Horario a, Horario b)
	{
		int diferenca = 0;

		diferenca += (Math.abs(a.getHora() - b.getHora())) * 60;
		diferenca += Math.abs(a.getMinuto() - b.getMinuto());

		return diferenca;
	}

	public String toString() {
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
}