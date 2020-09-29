public class Filme 
{
	private int codigo;
	private String nome;
	private String genero;
	private int ano;
	private String autorPrincipal;
	private static int totalFilmes;

	Filme(int codigo, String nome)
	{
		this.codigo = codigo;
		this.nome = nome;

		Filme.totalFilmes++;
	}

	public static int getTotalFilmes() 
	{
		return Filme.totalFilmes;
	}

	public int getCodigo()
	{
		return this.codigo;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getGenero()
	{
		return this.genero;
	}

	public void setGenero(String genero)
	{
		this.genero = genero;
	}

	public int getAno()
	{
		return this.ano;
	}

	public void setAno(int ano)
	{
		this.ano = ano;
	}

	public String getAutorPrincipal()
	{
		return this.autorPrincipal;
	}

	public void setAutorPrincipal(String autorPrincipal)
	{
		this.autorPrincipal = autorPrincipal;
	}

	public String toString() 
	{
		return 
		"Nome: " + this.nome + 
		"\nCodigo: " + this.codigo + 
		"\nGenero: " + this.genero + 
		"\nAno de lançamento: " + this.ano + 
		"\nAutor Principal: " + this.autorPrincipal;
	} 
}