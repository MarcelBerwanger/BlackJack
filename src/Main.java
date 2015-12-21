import Spieler.*;

public class Main {

	public static void main(String[] args)
	{
		new Spieler("Markus");
		new Spieler("Max");
		new Spieler("Manuel");
		new Spieler("Martin");
		new Spieler("Marta");
		new Spieler("Merlin");
		new Spieler("Mara");
		
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
