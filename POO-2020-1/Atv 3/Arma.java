public class Arma 
{
	private int qtdTiros;
	private int potencia;
	private int velocidade;
	private float custoPorTiro;

	public Arma(int qtdTiros, int potencia, int velocidade, float custoPorTiro) {
		this.setQtdTiros(qtdTiros);
		this.setPotencia(potencia);
		this.setVelocidade(velocidade);
		this.setCustoPorTiro(custoPorTiro);
	}

	public Arma(int qtdTiros, int potencia, int velocidade) {
		this.setQtdTiros(qtdTiros);
		this.setPotencia(potencia);
		this.setVelocidade(velocidade);
	}
	
	public Arma(int qtdTiros, int potencia) {
		this.setQtdTiros(qtdTiros);
		this.setPotencia(potencia);
	}
	
	public Arma(int qtdTiros) {
		this.setQtdTiros(qtdTiros);
	}


	public void setQtdTiros(int qtdTiros)
	{
		this.qtdTiros = qtdTiros;
	}

	public int getQtdTiros()
	{
		return this.qtdTiros;
	}

	public void setPotencia(int potencia)
	{
		this.potencia = potencia;
	}

	public int getPotencia()
	{
		return this.potencia;
	}

	public void setVelocidade(int velocidade)
	{
		this.velocidade = velocidade;
	}

	public int getVelocidade()
	{
		return this.velocidade;
	}

	public void setCustoPorTiro(float custoPorTiro)
	{
		this.custoPorTiro = custoPorTiro;
	}

	public float getCustoPorTiro()
	{
		return this.custoPorTiro;
	}

	public void Recarregar(int tiros)
	{
		if(tiros <= 0) {
			System.out.println("Impossivel recarregar sem balas");
		}
		else { 
			this.qtdTiros += tiros;
		}
	}

	public void Disparar(float angulo)
	{
		if(this.qtdTiros == 0) {
			System.out.println("Você está sem munição");
			return;
		}

		System.out.println("Disparando com angulação " + angulo + " e potencia " + this.potencia);

		this.qtdTiros--;
	}
}