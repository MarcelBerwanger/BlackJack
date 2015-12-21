package Karte;


public class KartenSpiel
{
	public KartenSpiel()
	{
		//Initialisierung aller Karten (erzeugen 6 Stapel & hinzufügen zu alle Karten)
		for(int i=0; i<6; i++)
		{
			Stapel aktStap = new Stapel();
			for(int j=0; j<aktStap.getStapelKarten().length; j++)
			{
				alleKarten[j+(52*i)]=aktStap.getStapelKarten()[j];
			}
		}
		
		//Tests -> es fehlen 6 Karten (6 Könige) [gelöst]
		//		int index=1;
		//		for (Karte karte : alleKarten) {
		//			if(karte.getBezString().equals("K")){
		//			System.out.println(index+"\t\t"+karte.getBezString() + " " + karte.getFarbe());
		//			index++;
		//			}
		//		}
	}
	
	private Karte[] alleKarten = new Karte[312];
	public Karte[] getAlleKarten()
	{
		return alleKarten;
	}
}
