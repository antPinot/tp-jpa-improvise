/**
 * 
 */
package fr.diginamic;

/**
 * @author antPinot
 *
 */
public enum Categorie {
	
	PETITE("Petite"),
	MOYENNE("Moyenne"),
	GRANDE("Grande");
	
	private String libelle;

	/**Constructeur
	 * @param libelle
	 */
	private Categorie(String libelle) {
		this.libelle = libelle;
	}

	/**Getter pour l'attribut libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**Setter pour l'attribut libelle
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
