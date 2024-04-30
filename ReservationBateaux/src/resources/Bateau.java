package resources;

public class Bateau {
	
	/* les informations sur le bateau */
	private String nomBateau;
	private int nbPersonneMax;
	private int prixHeure;
	
	private int largeur;
	private int longueur;
	
	
	/* constructeur */
	public Bateau(String nomBateau, int nbPersonneMax, int prixHeure, int largeur, int longueur) {
		this.nomBateau = nomBateau;
		this.nbPersonneMax = nbPersonneMax;
		this.prixHeure = prixHeure;
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	
	/* Getters pour les attributs */
	public String getNomBateau() {
		return nomBateau;
	}
	
	public int getNbPersonneMax() {
		return nbPersonneMax;
	}
	public int getPrixHeure() {
		return prixHeure;
	}
	public int getLargueur() {
		return largeur;
	}
	public int getLongueur() {
		return longueur;
	}
	
	
	
}
