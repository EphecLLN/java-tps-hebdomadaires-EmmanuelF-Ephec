/**
 * Création de classe : Classe IP ( Tp1-4.5 )
 * Date de création : 29/09
 */
package tp2;

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
	 * @return the octet1
	 */
	public int getOctet1() {
		return octet1;
	}



	/**
	 * @param octet1 the octet1 to set
	 */
	public void setOctet1(int octet1) {
		this.octet1 = octet1;
	}



	/**
	 * @return the octet2
	 */
	public int getOctet2() {
		return octet2;
	}



	/**
	 * @param octet2 the octet2 to set
	 */
	public void setOctet2(int octet2) {
		this.octet2 = octet2;
	}



	/**
	 * @return the octet3
	 */
	public int getOctet3() {
		return octet3;
	}



	/**
	 * @param octet3 the octet3 to set
	 */
	public void setOctet3(int octet3) {
		this.octet3 = octet3;
	}



	/**
	 * @return the octet4
	 */
	public int getOctet4() {
		return octet4;
	}



	/**
	 * @param octet4 the octet4 to set
	 */
	public void setOctet4(int octet4) {
		this.octet4 = octet4;
	}

	/**
	 * Initialise une adresse ip
	 * @param octet1 = premier octet de l'adresse
	 * @param octet2 = deuxième octet de l'adresse
	 * @param octet3 = troisième octet de l'adresse
	 * @param octet4 = quatrième octet de l'adresse
	 */
	
	public IP(int octet1, int octet2, int octet3, int octet4) {
		this.setOctet1(octet1);
		this.setOctet2(octet2);
		this.setOctet3(octet3);
		this.setOctet4(octet4);
	}
	
	

	@Override
	public String toString() {
		return "IP [octet1=" + octet1 + ", octet2=" + octet2 + ", octet3=" + octet3 + ", octet4=" + octet4 + "]";
	}



	/** 
	 * Création d'adresse IP
	 * @param args : Arguments de la ligne de commande 
	 */
	public static void main(String[] args) {
		IP ip = new IP(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		System.out.println(ip);
	}

}
