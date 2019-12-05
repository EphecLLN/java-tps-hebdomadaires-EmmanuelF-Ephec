package test;

import controller.BibliothequeController;
import model.Bibliotheque;
import view.BibliothequeVue;
import view.BibliothequeVueConsole;
import view.BibliothequeVueGUI;

public class BibliothequeMVC {
	public BibliothequeMVC() {
		//Création du modèle
		
		//TODO

		//Création des contrôleurs : Un pour chaque vue
		//Chaque contrôleur doit avoir une référence vers le modèle pour pouvoir le commander
		
		//TODO
		
		//Création des vues.
		//Chaque vue doit connaître son contrôleur et avoir une référence vers le modèle pour pouvoir l'observer
		
		//TODO
		
		//On donne la référence à la vue pour chaque contrôleur
		
		//TODO
		
		
	}
	
	public static void main(String args[]) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		Bibliotheque biblio = new Bibliotheque();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new BibliothequeMVC();
			}
		});
	}
}
