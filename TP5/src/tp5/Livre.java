/**
 * 
 */
package tp5;

/**
 * @author Wololo
 *
 */
public class Livre {
	// Variables d'instance 
	private String titre, nomAuteur;
	private String [] pagesLivre = new String[100];
	private int anneeEdit;
	
	
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}


	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		if (titre.trim().compareTo("") == 0) {
			this.titre = "Titre inconnu";
		}
		else {
			this.titre = titre;
		}
	}


	/**
	 * @return the nom
	 */
	public String getNomAuteur() {
		return nomAuteur;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNomAuteur(String nomAuteur) {
		if (nomAuteur.trim().compareTo("") == 0) {
			this.nomAuteur = "Auteur inconnu";
		}
		else {
			this.nomAuteur = nomAuteur;
		}
	}


	/**
	 * Cette méthode permet de rajouter des pages
	 * à partir de la première page vierge du livre
	 * @return the premierePage
	 */

	public void setPagesLivre(String [] textePage) {
		int indiceDepart = 0;
		if (textePage.length != 0) {
			while (indiceDepart != 100) {
				if (this.pagesLivre[indiceDepart] == null) {
					if (indiceDepart + textePage.length < 100) {
						for (int i = 0; i < textePage.length; i++) {
							this.pagesLivre[indiceDepart] = textePage[i];
						}
						indiceDepart = 100;
					}
					else {
						System.out.println("Il y a trop de pages à rajouter!");
					}
				}
				else {
					indiceDepart++;
				}
			}
		}
	}

	/**
	 * @return the anneeEdit
	 */
	public int getAnneeEdit() {
		return anneeEdit;
	}


	/**
	 * @param anneeEdit the anneeEdit to set
	 */
	public void setAnneeEdit(int anneeEdit) {
		this.anneeEdit = anneeEdit;
	}
	
	/**
	 * Renvoit le hashCode de l'objet courant
	 */
	
	public int hashCode() {
		return anneeEdit * this.nomAuteur.hashCode() * this.titre.hashCode() * this.pagesLivre.hashCode();
	}
	
	/**
	 * Cette classe teste l'égalité entre 2 objets
	 */

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Livre other = (Livre) obj;
		if (this.hashCode() != other.hashCode()) {
			return false;
		}
		return true;
	}
	
	public String setPage(int numPage, String contenuPage) {
		String pageAncienne = "";
		String page = this.pagesLivre[numPage];
		if (numPage >= 0 && numPage < this.pagesLivre.length) {
			if (page != null) {
				pageAncienne = page;
				this.pagesLivre[numPage] = contenuPage;
				return pageAncienne;
			}
			else {
				this.pagesLivre[numPage] = contenuPage;
				return null;
			}
		}
		else {
			System.out.println("La numéro de page est incorrecte !");
			return null;
		}
	}
	
	public Livre (String titre, String nomAuteur, int anneeEdit) {
		this.setTitre(titre);
		this.setNomAuteur(nomAuteur);
		this.setAnneeEdit(anneeEdit);
	}
	
	public Livre (String titre, String nomAuteur, int anneeEdit, String [] pages) {
		this.setTitre(titre);
		this.setNomAuteur(nomAuteur);
		this.setAnneeEdit(anneeEdit);
		this.setPagesLivre(pages);
	}

	/**
	 * Cette méthode renvoit le texte de la page demandéé
	 * Si la page n'existe pas -> null
	 * Si elle existe -> texte de la page
	 * @param numPage : Numéro de page demandé
	 * @return Le texte de la page si trouvé ou null si page inexistante
	 */
	
	public String getPage (int numPage) {
		if (numPage >= 0 && numPage < 100) {
			if (this.pagesLivre[numPage] == null) {
				return null;
			}
			else {
				return this.pagesLivre[numPage];
			}
		}
		else {
			return null;
		}
	}
	
	
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", nomAuteur=" + nomAuteur + ", anneeEdit=" + anneeEdit + "]";
	}
	
	/**
	 * Cette méthode permet de récupérer le texte 
	 * de la première page. 
	 * @return Le texte de la première page || null si aucun texte
	 */
	
	public String getFirstPage () {
		return this.getPage(0);
	}

	public String extrait() {
		String [] phrases = this.getFirstPage().split("[.!?]");
		String extrait = "";
		if (phrases == null) {
			return "Il n'y a pas d'extrait";
		}
		else {
			for (int i = 0; i < (phrases.length / 2); i++) {
				extrait = extrait.concat(phrases[i]);
			}
			return extrait;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre1 = new Livre(" ", " ", 1999);
		Livre livre2 = new Livre("Livre", "Auteur", 19, new String [] {"Je.Suis?la!yes.a.b?a!a!a", "Deuxieme page c'est dingue"});
		System.out.println(livre1.getNomAuteur());
		System.out.println(livre1.getTitre());
		System.out.println(livre1.getFirstPage());
		System.out.println(livre2.getNomAuteur());
		System.out.println(livre2.getTitre());
		System.out.println(livre2.getPage(1));
		System.out.println(livre2.getPage(2));
		System.out.println(livre2.getPage(100));
		System.out.println(livre2.getFirstPage());
		System.out.println(livre2.extrait());
		System.out.println(livre2);
		
		System.out.println(livre2.setPage(99, "a"));
		System.out.println(livre2.getPage(99));
		
}
}
