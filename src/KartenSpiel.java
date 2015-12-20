

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
				alleKarten[j+(51*i)]=aktStap.getStapelKarten()[j];
			}
		}
	}
	
	private Karte[] alleKarten = new Karte[312];
	public Karte[] getAlleKarten()
	{
		return alleKarten;
	}
}
