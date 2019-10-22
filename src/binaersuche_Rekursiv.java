
public class binaersuche_Rekursiv {

	static int laenge = 10;
	static int[]arraymenge = new int[laenge];
	
	public static void main(String[] args) {
		int suchzahl = 4; 
		int anfang = 0;
		int ende = arraymenge.length;
		ArrayBefuellen();
		System.out.println(binaersucheRekursiv(arraymenge, suchzahl, ende, anfang ));
	}
	static void ArrayBefuellen()
	{
		for(int i=0;i<arraymenge.length;i++) arraymenge[i]=i;			
	}
	static boolean binaersucheRekursiv(int[] menge, int zahl, int anfang, int ende )
	{
		int halbe = (anfang+ende)/2;
		System.out.println("Zahl: "+zahl+" |anfang: "+ anfang+" |ende: "+ende+" |halbe: "+halbe);
		if(menge[halbe]==zahl)
		{
			System.out.println("Zahl gefunden: "+halbe);
			return true;
		}else if(menge[halbe] < zahl)
		{
			return binaersucheRekursiv(menge, zahl, anfang, halbe+1);
		}else if(menge[halbe] > zahl)
		{
			return binaersucheRekursiv(menge, zahl, halbe-1, ende);
		}
		return false;
	}
}
