/**
 * 
 */
package tp5;

import java.util.Arrays;

/**
 * @author Wololo
 *
 */
public class Dictionnaire extends Livre{
	// Variables d'instance 
	private String langue;
	private String [][] dictPages = new String[100][10];
	
	
	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}


	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		if (langue.trim().compareTo("") == 0) {
			this.langue = "Langue inconnue";
		}
		else {
			this.langue = langue;
		}
	}


	/**
	 * @return the dictPages
	 */
	public String[][] getDictPages() {
		return dictPages;
	}


	/**
	 * Cette m�thode permet d'�crire � la premi�re -
	 * @param dictPages the dictPages to set
	 */
	public void setDictPages(String[][] dictPages) {
		int indicePage = 0;
		if(dictPages.length != 0) { // Il faut du texte
			while (indicePage != 100) { // Traverser tout le livre 
				if (this.dictPages[indicePage] == null) { // Premiere page vierge 
					if (indicePage + dictPages.length < 100) { // Si le livre d�passe 100 pages alors on �crit rien
						for (int i = 0; i < dictPages.length; i++ ) {					 
							if (dictPages[i].length < 10) { // Si trop de def alors rien �crire
								for (int j = 0; j < dictPages[i].length; j++) {
									this.dictPages[indicePage][j] = dictPages[i][j];
								}
								indicePage++;
							}
							else {
								System.out.println("Trop de d�finitions � �crire.");
							}
						}
					}
					else {
						System.out.println("Il y a trop de pages � rajouter.");
					}
				}
			}
		}
		else {
			indicePage++;
		}
	}
	
	/**
	 * Permet d'obtenir le hashCode de l'objet courant
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.deepHashCode(dictPages);
		result = prime * result + ((langue == null) ? 0 : langue.hashCode());
		return result;
	}

	/**
	 * Cette m�thode permet de tester l'�galit�
	 * entre 2 objets courants de cette classe
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionnaire other = (Dictionnaire) obj;
		if (!Arrays.deepEquals(dictPages, other.dictPages))
			return false;
		if (langue == null) {
			if (other.langue != null)
				return false;
		} else if (!langue.equals(other.langue))
			return false;
		return true;
	}
	
	/**
	 * Affiche les valeurs des variables d'instance de l'objet courant
	 * en console
	 */


	@Override
	public String toString() {
		return "Dictionnaire [langue=" + langue + ", dictPages=" + Arrays.toString(dictPages) + ", Titre="
				+ getTitre() + ", NomAuteur=" + getNomAuteur() + ", AnneeEdit=" + getAnneeEdit() + "]";
	}
	
	/**
	 * Cette m�thode permet de r�cup�rer toutes les d�finitions
	 * s'un page si celles-ci existe.
	 */
	
	public String getPage(int numPage) {
		String textePage = "";
		if (numPage >= 0 && numPage < 100) {
			String [] page = this.dictPages[numPage];
			if (page == null) {
				return null;
			}
			else {
				for (int i = 0; i < page.length; i++) {
					if (page[i] != null) {
						textePage = textePage + page[i] + "\n";
					}
				}
				return textePage;
			}
		}
		else {
			System.out.println("Num�ro de page incorrecte.");
			return null;
		}
	}
	
	/**
	 * Cette m�thode permet de cr�er une page avec de nouvelles d�finitions
	 * et de renvoyer les anciennes d�finitions 
	 * @param numPage : num�ro de la page � modifier 
	 * @param defsPage : Les nouvelles d�finitions � �crire
	 * @return une cha�ne de caract�res avec une d�finition par ligne
	 */
	
	public String setPage(int numPage, String [] defsPage) {
		String defsAnciennes = "";
		if (numPage >= 0 && numPage < this.dictPages.length && defsPage.length != 0) {
			if (defsPage.length < 10) {
				for (int i = 0; i < defsPage.length; i++) {
					defsAnciennes = defsAnciennes + defsPage[i] + "\n";
					this.dictPages[numPage][i] = defsPage[i];
				}
				return defsAnciennes;
			}
			else {
				System.out.println("Il y a trop de d�finitions pour la page.");
				return null;
			}
		}
		else {
			System.out.println("Le num�ro de page est incorrecte.");
			return null;
		}
	}
	
	/**
	 * Cette m�thode permet de r�cup�rer la premi�re page
	 * avec toute ses d�finitions.
	 * @return Un tableau de cha�ne de caract�res
	 */

	public String [] getPremierePage() {
		if (this.dictPages[0] != null) {
			return this.dictPages[0];
		}
		else {
			return null;
		}
	}
	
	/**
	 * Cette m�thode permet de donner la premi�re d�finition 
	 * de la premi�re page
	 * @return Cha�ne de caract�re de def ou null si pas de def
	 */
	
	public String getExtrait() {
		String [] page;
		if ((page = this.getPremierePage()) != null && this.getPremierePage()[0] != null) {
			return page[0];
		}
		else {
			System.out.println("Pas de premi�re d�finition.");
			return null;
		}
	}
	
	/**
	 * Cette m�thode permet de r�cup�rer la d�finition 
	 * avec les num�ros de page et de d�finition sp�cifi�s 
	 * @param numPage : Num�ro de page du dictionnaire
	 * @param numDef : Num�ro de d�finition de la page
	 * @return La d�finition de la page demand� (String) ou null 
	 */
	
	public String getDefinition(int numPage, int numDef) {
		if (numPage >= 0 && numPage < 100 && numDef >= 0 && numDef < 10) {
			return this.dictPages[numPage][numDef];
		}
		else {
			System.out.println("Num�ro de page ou de d�finition incorrecte.");
			return null;
		}
	}
	/**
	 * Cette m�thode permet d'�crire une nouvelle d�finition � la page 
	 * sp�cifi�e et � la d�finition sp�cifi�e
	 * @param numPage : Num�ro de la page 
	 * @param numDef : Num�ro de la d�fintion sur la page 
	 * @param texteDef : Le d�finition � �crire dans le dictionnaire
	 * @return L'ancienne d�finition qui a �t� remplac�e
	 */
	
	public String setDefinition (int numPage, int numDef, String texteDef) {
		if (numPage >= 0 && numPage < 100 && numDef >= 0 && numDef < 10) {
			String defAncienne = this.dictPages[numPage][numDef];
			this.dictPages[numPage][numDef] = texteDef;
			return texteDef;
		}
		else {
			System.out.println("Num�ro de page ou de d�finition incorrecte.");
			return null;
		}
	}
	
	public Dictionnaire (String titre, String nomAuteur, int anneeEdit, String [][] dictPages) {
		super(titre, nomAuteur, anneeEdit);
		this.setDictPages(dictPages);
	}
}
