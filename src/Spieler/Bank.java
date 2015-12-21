package Spieler;
import Karte.*;

public class Bank extends Spieler
{
	public Bank()
	{
		super("Bank");
		kartenPool = new KartenSpiel();
		indexStelle = (kartenPool.getAlleKarten().length+1);
	}
	
	private KartenSpiel kartenPool;
	private int indexStelle;											//Index der der Länge des Arrays Karten entsrpicht, wird herangezogen um Elemente zu verschieben
	
	public void austeilen()
	{
		int zufi=0;														//Zufallszahl die mithilfe von Math.random ermittelt wird, mithilfe dieser Zahl werden Karten aus dem Array ausgewählt
		Karte kartegew=null;											//Karte die durch Math.random() bestimmt wurde
		Karte kartevers=null;											//Karte die von hinten an die Stelle der Zufallskarte verschoben wird
		
		for (Spieler spieler : spielerges) {
			zufi = ((int)(Math.random()*indexStelle));					//Zufallszahl zwischen 0  und 312
			kartegew = kartenPool.getAlleKarten()[zufi];				//Karte aus dem Array entnehemen
			
			System.out.println("Spieler: " + spieler.getSpielerName() + " bekommt die " + kartegew.karteAusgeben());
			
			kartevers = kartenPool.getAlleKarten()[indexStelle-2];		//Karte von hinten nehmen
			spieler.addHand(kartegew);									//ausgewählte Karte der Hand hinzufügen
			kartenPool.getAlleKarten()[zufi] = kartevers;				//Karte von hinten an die Stelle der Zufallskarte setzten
			kartenPool.getAlleKarten()[(indexStelle-2)] = kartegew;		//Zufallskarte nach hinten setzten
			indexStelle--;												// Range vom index verkleinern, damit schon gewählte Zahlen nicht mehr vorkommen können
		}
	}
}
