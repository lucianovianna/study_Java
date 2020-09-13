public class Usuario 
{
	public String nome;
	public int idade;
	public String localizacao;
	public String destino;
	public float notaNoApp;

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}

	public int getIdade()
	{
		return this.idade;
	}

	public void setLocalizacao(String local) 
	{
		this.localizacao = local;
	}

	public String getLocalizacao()
	{
		return this.localizacao;
	}

	public void setDestino(String local) 
	{
		this.destino = local;
	}

	public String getDestino()
	{
		return this.destino;
	}

	public void setNotaNoApp(float nota) 
	{
		this.notaNoApp = nota;
	}

	public float getNotaNoApp()
	{
		return this.notaNoApp;
	}
}