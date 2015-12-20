import java.util.ArrayList;


public class Spieler
{
	public Spieler(String uname)
	{
		spielerName = uname;
		spielerges.add(this);
	}
	public static ArrayList<Spieler> spielerges = new ArrayList<Spieler>();
	
	protected String spielerName;
	public String getSpielerName()
	{
		return spielerName;
	}
	
	protected ArrayList<Karte> hand = new ArrayList<Karte>();
	public ArrayList<Karte> getHand()
	{
		return hand;
	}
	
	public void addHand(Karte ukarte)
	{
		hand.add(ukarte);
	}
	
	public void sieheHand()
	{
		for (Karte ikarte : hand)
		{
			System.out.print("Karte: " + ikarte.getBezString());
			System.out.print(" Farbe: " + ikarte.getFarbe()+"; ");
		}
		System.out.println();
	}
}
