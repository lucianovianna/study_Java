public class Programa 
{
	public static void main(String[] args) 
	{
		
		Arma a1 = new Arma(5,90,200, (float)10.0);
		
		Personagem p1 = new Personagem("Atirador");
		
		for(int itr = 0; itr <= 6; itr++) {
			p1.atirar(45, a1);
		
			System.out.println("Qtd tiros: " + a1.getQtdTiros() + "\n");
		}
		
		p1.setDinheiro((float)100.00);
		System.out.println("SALDO: " + p1.getDinheiro() + "R$\n");
		p1.comprarTiros((float)9.99, a1);
		System.out.println("SALDO: " + p1.getDinheiro() + "R$\n");
		p1.comprarTiros((float)29.99, a1);
		System.out.println("SALDO: " + p1.getDinheiro() + "R$\n");

		p1.atirar(19, a1);
		System.out.println("\nQtd tiros: " + a1.getQtdTiros());

	}
}
