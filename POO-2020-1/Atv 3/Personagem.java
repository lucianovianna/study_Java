public class Personagem 
{
	public String name;
	public int tamanho;
	public String cor;
	public float dinheiro;

	public Personagem(String name) {
		this.name = name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setTamanho(int tamanho)
	{
		this.tamanho = tamanho;
	}

	public int getTamanho()
	{
		return this.tamanho;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public String getCor()
	{
		return this.cor;
	}

	public void setDinheiro(float dinheiro)
	{
		this.dinheiro = dinheiro;
	}

	public float getDinheiro()
	{
		return this.dinheiro;
	}


	public void correr(String direcao)
	{
		System.out.println(this.name + " está correndo para " + direcao);
	}

	public void atirar(float angulo, Arma a)
	{
		a.Disparar(angulo);
	}

	public void comprarTiros(float dinheiro, Arma a)
	{
		float custoPorTiro = a.getCustoPorTiro();
		float balasCompradas = dinheiro / custoPorTiro;


		if((int)balasCompradas >= 1) {
			this.dinheiro -= (dinheiro - (dinheiro % custoPorTiro));
			a.Recarregar((int)balasCompradas);
		}
		else {
			System.out.println("Dinheiro insuficiente para a compra, necessita de R$ " + custoPorTiro);
		}
	}
}