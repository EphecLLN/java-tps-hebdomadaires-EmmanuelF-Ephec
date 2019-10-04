/**
 * Création de classe : Classe IP ( Tp1-4.5 )
 * Date de création : 29/09
 */
package tp1;

/**
 * Cette classe permet de créer une adresse IP
 * @author Emmanuel Foureau
 */
public class IP {
	// Attributs
	
	int octet1;
	int octet2;
	int octet3;
	int octet4;
	
	/** 
	 * Création d'adresse IP
	 * @param args : Arguments de la ligne de commande 
	 */
	public static void main(String[] args) {
		IP ip = new IP();
		ip.octet1 = Integer.parseInt(args[0]);
		ip.octet2 = Integer.parseInt(args[1]);
		ip.octet3 = Integer.parseInt(args[2]);
		ip.octet4 = Integer.parseInt(args[3]);
		System.out.println("L'adresse ip est la suivante : " + ip.octet1 + "." + ip.octet2 + "." + ip.octet3 + "." + ip.octet4 + " !");
	}

}
