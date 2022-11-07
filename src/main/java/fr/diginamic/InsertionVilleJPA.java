/**
 * 
 */
package fr.diginamic;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author antPinot
 *
 */
public class InsertionVilleJPA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp-improvise");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		Region nvAquitaine = new Region("Nouvelle-Aquitaine");
		Region occitanie = new Region("Occitanie");
		Region bretagne = new Region("Bretagne");
		Region paca = new Region("Provence-Alpes-Côte d'Azur");
		Region auvRhone = new Region("Auvergne-Rhône-Alpes");
		
		
		Ville nice = new Ville("Nice", 6000, new Date(), Categorie.GRANDE, paca);
		
		Ville lagrave = new Ville("La Grave", 5320, new Date(), Categorie.PETITE, auvRhone);
		
		Ville nantes = new Ville("Nantes", 44000, new Date(), Categorie.GRANDE, bretagne);
		
		Ville glasgow = new Ville("Glasgow", 99000, new Date(), Categorie.GRANDE, bretagne);
		
		Habitant xav = new Habitant("Dupont de Ligonnes", "Xavier", new Adresse(35, "Avenue de la Terrasse"));
		
		xav.getVilles().add(nantes);
		
		xav.getVilles().add(glasgow);
		
		em.persist(nvAquitaine);
		
		em.persist(occitanie);
		
		em.persist(bretagne);
		
		em.persist(paca);
		
		em.persist(auvRhone);
		
		em.persist(nice);
		
		em.persist(lagrave);
		
		em.persist(nantes);
		
		em.persist(glasgow);
		
		em.persist(xav);
		
		transaction.commit();
		
		Habitant habitant = em.find(Habitant.class, 1);
		
		System.out.println(habitant);

	}

}
