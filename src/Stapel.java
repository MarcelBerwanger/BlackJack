
public class Stapel 
{
	public Stapel()
	{
		for(int i =0; i<stapelKarten.length; i++)
		{
			stapelKarten[i]= new Karte(i+1);
		}
	}
	
	private Karte[] stapelKarten = new Karte[52];
	public Karte[] getStapelKarten()
	{
		return stapelKarten;
	}
}
