package Spieler;
import java.util.ArrayList;
import Karte.*;

public class Spieler
{
	public Spieler(String uname)
	{
		spielerName = uname;
		spielerges.add(this);
	}
	
	public static ArrayList<Spieler> spielerges = new ArrayList<Spieler>();
	
	private static Bank aktBank;
	public static void setAktBank(Bank b)
	{
		aktBank = b;
	}
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
	public void zieheNoch()
	{
		Spieler sp = this;
		aktBank.austeilenEinzeil(sp);
	}
}
