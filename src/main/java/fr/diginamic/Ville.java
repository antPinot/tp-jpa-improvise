/**
 * 
 */
package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author antPinot
 *
 */

@Entity
@Table
public class Ville {
	
	@ManyToOne
	@JoinColumn(name = "ID_REGION")
	private Region region;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "NOM", length = 100, nullable = false, unique = false)
	private String nom;
	
	@Column(name = "CODE_POSTAL", nullable = false, unique = false)
	private int codePostal;
	
	@Column(name = "DERNIER_RECENSEMENT", nullable = false, unique = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDernierRecensement;
	
	@Column(name = "CATEGORIE", nullable = true, unique = false)
	@Enumerated(EnumType.STRING)
	private Categorie categorie;
	
	@ManyToMany(mappedBy = "villes")
	private List<Habitant> habitants = new ArrayList<Habitant>();

	/**Constructeur
	 * 
	 */
	public Ville() {
	}

	/**Constructeur
	 * @param nom
	 * @param codePostal
	 * @param dateDernierRecensement
	 * @param categorie
	 */
	public Ville(String nom, int codePostal, Date dateDernierRecensement, Categorie categorie, Region region){
		this.nom = nom;
		this.codePostal = codePostal;
		this.dateDernierRecensement = dateDernierRecensement;
		this.categorie = categorie;
		this.region = region;
	}

	/**Getter pour l'attribut id
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**Setter pour l'attribut id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter pour l'attribut codePostal
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**Setter pour l'attribut codePostal
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**Getter pour l'attribut dateDernierRecensement
	 * @return the dateDernierRecensement
	 */
	public Date getDateDernierRecensement() {
		return dateDernierRecensement;
	}

	/**Setter pour l'attribut dateDernierRecensement
	 * @param dateDernierRecensement the dateDernierRecensement to set
	 */
	public void setDateDernierRecensement(Date dateDernierRecensement) {
		this.dateDernierRecensement = dateDernierRecensement;
	}

	/**Getter pour l'attribut categorie
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**Setter pour l'attribut categorie
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
