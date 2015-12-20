
public class Main {

	public static void main(String[] args)
	{
		Spieler sp1 = new Spieler("Markus");
		Spieler sp2 = new Spieler("Max");
		Spieler sp3 = new Spieler("Manuel");
		Spieler sp4 = new Spieler("Martin");
		Spieler sp5 = new Spieler("Marta");
		Spieler sp6 = new Spieler("Merlin");
		Spieler sp7 = new Spieler("Mara");
		
		Bank bank = new Bank();
		
		bank.austeilen();
		bank.austeilen();
		
		System.out.println("\n\nAusgabe der Hände");
		System.out.println("=============================================");
		for(Spieler sp : Spieler.spielerges)
		{
			System.out.println("Spieler: " + sp.getSpielerName());
			sp.sieheHand();
			System.out.println();
		}
	}

}
