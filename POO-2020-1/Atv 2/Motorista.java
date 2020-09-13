public class Motorista 
{
	public String nome;
	public int idade;
	public String modeloVeiculo;
	public float notaNoApp;
	public boolean disponibilidade;
	public String localizacao;

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

	public void setDisponibilidade(boolean disp)
	{
		this.disponibilidade = disp;
	}

	public boolean getDisponibilidade()
	{
		return this.disponibilidade;
	}

	public void setNotaNoApp(float nota) 
	{
		this.notaNoApp = nota;
	}

	public float getNotaNoApp()
	{
		return this.notaNoApp;
	}

	public void setModeloVeiculo(String modelo) 
	{
		this.modeloVeiculo = modelo;
	}

	public String getModeloVeiculo()
	{
		return this.modeloVeiculo;
	}
}