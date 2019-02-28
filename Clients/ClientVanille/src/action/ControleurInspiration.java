// Auteur : Antonin Seiler INFO 2
// Date : 21/02/2019
// Sujet : Maintenance

package action;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import accesseur.PenseeDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import modele.Pensee;
import outils.Journal;
import vue.VueInspiration;

public class ControleurInspiration  implements Initializable {
	protected PenseeDAO penseeDAO = new PenseeDAO();

	public ControleurInspiration()
	{
		ControleurInspiration.instance = this;
	}
	protected static ControleurInspiration instance = null;
	public static ControleurInspiration getInstance() {return ControleurInspiration.instance;}	
	
	@FXML protected void trouverInspiration(ActionEvent evenement) {
    	
    	System.out.println("trouverInspiration( )");
		Pensee pensee = penseeDAO.chargerPenseeAleatoire();
		VueInspiration.getInstance().afficherPensee(pensee);
    	
    	// Singleton obligatoire car le framework de JavaFX cache l'instance
    	//VueInspirationVisuelle.getInstance().ecrireUnMessage("allo");
    }

	public void initialiser()
	{
		//List<Pensee> listePensees = penseeDAO.listerPensees();
		Pensee pensee = penseeDAO.chargerPenseeAleatoire();
		
		 //for(Iterator<Pensee> visiteur = listePensees.iterator(); visiteur.hasNext(); )
		//{
		//	Pensee pensee = visiteur.next();		
		//	Journal.ecrire(5, pensee.getMessage() + "(" + pensee.getAuteur() + ")");
		//}
		//VueInspirationVisuelle.getInstance().afficherListePensees(listePensees);
		VueInspiration.getInstance().afficherPensee(pensee);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
}