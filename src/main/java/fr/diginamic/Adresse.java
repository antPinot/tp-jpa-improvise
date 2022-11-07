/**
 * 
 */
package fr.diginamic;

import javax.persistence.Embeddable;

/**
 * @author antPinot
 *
 */
@Embeddable
public class Adresse {
	
	private Integer numeroVoie;
	
	private String voie;
	
	

	/**Constructeur
	 * 
	 */
	public Adresse() {
	}

	/**Constructeur
	 * @param numeroVoie
	 * @param voie
	 */
	public Adresse(Integer numeroVoie, String voie) {
		this.numeroVoie = numeroVoie;
		this.voie = voie;
	}

	/**Getter pour l'attribut numeroVoie
	 * @return the numeroVoie
	 */
	public Integer getNumeroVoie() {
		return numeroVoie;
	}

	/**Setter pour l'attribut numeroVoie
	 * @param numeroVoie the numeroVoie to set
	 */
	public void setNumeroVoie(Integer numeroVoie) {
		this.numeroVoie = numeroVoie;
	}

	/**Getter pour l'attribut voie
	 * @return the voie
	 */
	public String getVoie() {
		return voie;
	}

	/**Setter pour l'attribut voie
	 * @param voie the voie to set
	 */
	public void setVoie(String voie) {
		this.voie = voie;
	}

	@Override
	public String toString() {
		return "Adresse [numeroVoie=" + numeroVoie + ", voie=" + voie + "]";
	}
	
	

}
