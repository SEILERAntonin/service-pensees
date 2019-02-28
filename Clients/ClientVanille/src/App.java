import accesseur.cache.PenseeDAO;
import modele.Pensee;
import outils.Journal;
import vue.VueInspiration;

public class App {

	public static void main(String[] parametres) {

		
		//Journal.activer();
		Journal.activerNiveau(0);
		
		//Pensee pensee = new Pensee("Rossetti","Ce qui est plus triste qu une oeuvre inachevee, c est une oeuvre jamais commencee.");
		//penseeDAO.ajouterPensee(pensee);		
		
		VueInspiration.launch(VueInspiration.class, parametres);
		
		PenseeDAO cachePenseeDAO = new PenseeDAO();
		//cachePenseeDAO.listerPensees();
		cachePenseeDAO.enregistrerPensee(new Pensee("coucou","coucou"));
		
	}

}