/**
 * 
 */
package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author antPinot
 *
 */

@Entity
@Table
public class Habitant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NOM", length = 100, nullable = false, unique = false)
	private String nom;
	
	@Column(name = "PRENOM", length = 100, nullable = false, unique = false)
	private String prenom;
	
	@ManyToMany
	@JoinTable(name = "HABITANT_VILLE" , joinColumns = @JoinColumn(name = "ID_HABITANT", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_VILLE", referencedColumnName = "ID"))
	private List<Ville> villes = new ArrayList<Ville>();

	/**Constructeur
	 * 
	 */
	public Habitant() {
	}

	/**Constructeur
	 * @param nom
	 * @param prenom
	 * @param villes
	 */
	public Habitant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**Getter pour l'attribut id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**Setter pour l'attribut id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
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

	/**Getter pour l'attribut prenom
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**Setter pour l'attribut prenom
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**Getter pour l'attribut villes
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/**Setter pour l'attribut villes
	 * @param villes the villes to set
	 */
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	

}
