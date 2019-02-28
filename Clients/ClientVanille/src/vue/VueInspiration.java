// Auteur : Antonin Seiler INFO 2
// Date : 21/02/2019
// Sujet : Maintenance

package vue;
import java.util.Iterator;
import java.util.List;

import action.ControleurInspiration;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import modele.Pensee;
import outils.Journal;

public class VueInspiration extends Application {
	public VueInspiration()
	{
		System.out.println("new VueInspiration()");
		VueInspiration.instance = this;	
	}
	protected static VueInspiration instance = null;
	public static VueInspiration getInstance() {return VueInspiration.instance;};
	
	protected Scene scene = null;
	@Override
	public void start(Stage stade) throws Exception {
		Parent racine = FXMLLoader.load(getClass().getResource("inspiration.fxml"));
		//Pane racine = new StackPane();
		scene = new Scene(racine, 800, 600);
		stade.setScene(scene);
		stade.show();
		ControleurInspiration.getInstance().initialiser();
		
		// stade.setOnShowing(new EventHandler<WindowEvent>() {public void handle(WindowEvent event) {  } });
	}	
	
	public void afficherPensee(Pensee pensee)
	{
		System.out.println("afficherPensee()");
		TextArea champsMessage = (TextArea) scene.lookup("#listePensees"); // TODO corriger l'id
		
		champsMessage.setText(pensee.getMessage() + " - " + pensee.getAuteur() + " (" + pensee.getSource() + ")");
		Journal.ecrire(5, pensee.getMessage() + " - " + pensee.getAuteur());

	}
	
	
}