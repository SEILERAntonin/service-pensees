// Auteur : Antonin Seiler INFO 2
// Date : 21/02/2019
// Sujet : Maintenance

package outils;

public class Journal {
	
	protected static int niveau = 0;
	
	public static void activerNiveau(int niveau)
	{
		Journal.niveau = niveau;
	}
	
	public static void ecrire(int niveau,String message)
	{
		if(niveau >= Journal.niveau) System.out.println(message);
	}
}
