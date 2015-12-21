package Karte;

public class Karte
{
	/**
	 * Konstruktor der Klassse
	 */
	public Karte(int nummer)
	{
		bezInt = nummer;
		karteErkennen(nummer);
	}
	
	private String bezString;
	public String getBezString()
	{
		return bezString;
	}
	
	private int bezInt;
	public int getBezInt() 
	{
		return bezInt;
	}
	
	private String farbe;
	public String getFarbe() 
	{
		return farbe;
	}
	
	public void karteErkennen(int ukarte)
	{
		double zwisch = ((double)ukarte)/13;
		switch(ukarte%13)
		{
			case 0:
				bezString="K";
			break;
			case 12:
				bezString="D";
			break;
			case 11:
				bezString="J";
			break;
			case 1:
				bezString="A";
			break;
			default:
				bezString=String.valueOf(ukarte%13);
			break;
		}
		
		if(zwisch<=1)									//Kartenfarbe durch Division mit 13
		{
			farbe="Pik";
		}
		else if((zwisch>1) && (zwisch<=2))
		{
			farbe="Kreuz";
		}
		else if((zwisch>2) && (zwisch<=3))
		{
			farbe="Herz";
		}
		else if(zwisch>3)
		{
			farbe="Karo";
		}
	}
	
	public String karteAusgeben()
	{
		return "Karte: " + bezString + "; " + farbe;
	}
}
