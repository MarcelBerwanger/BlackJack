package Karte;
import Spieler.Spieler;

public class Zaehlen 
{
	public void findeNeun(Spieler sp)
	{
		for(Karte k :sp.getHand())
		{
			if(k.getBezInt()==1)sp.anzNeun = sp.anzNeun+1;
		}
	}
	
	public void zaehleHand(Spieler sp)
	{
		//Entscheiden wie Karte gezählt wird, als Nummer 10 oder speziell als Ass
		// Ass counter wird noch benötigt
		for (Karte kart : sp.getHand())
		{
			sp.summeHand = sp.summeHand+kart.getBezInt();
		}
		if(sp.summeHand < 21 && sp.anzNeun < 0)
		{
			do{
				sp.summeHand = sp.summeHand-8;
				sp.anzNeun--;
			}while(sp.summeHand < 21 && sp.anzNeun < 0);
		}
	}
}
