package resources;

public class Reservation {
	
	/*les informations sur la résérvation */
	private int numReservation;
	private Client client;
	private Bateau bateau;
	private int jourResa;
	private int moisResa;
	// float ili int - reshit' na stadii Map ili oblegchit' jizn' 
	// vozmojno ne nbheure a horraires sdelat' -> osmotrim kak poydet
	private float nbHeures;
	
	private int nbPersonnes;
	
	
	/* constructeur */
	public Reservation(int numReservation, Client client, Bateau bateau, int jourResa, int moisResa, float nbHeures, int nbPersonnes) {
		this.numReservation = numReservation;
		this.client = client;
		this.bateau = bateau;
		this.jourResa = jourResa;
		this.moisResa = moisResa;
		this.nbHeures = nbHeures;
		this.nbPersonnes = nbPersonnes;
	}

	
	/* Getters pour les attributs */
	public Client getClient() {
		return client;
	}

	public int getNumReservation() {
		return numReservation;
	}

	public Bateau getBateau() {
		return bateau;
	}

	public int getJourResa() {
		return jourResa;
	}

	public int getMoisResa() {
		return moisResa;
	}

	public float getNbHeures() {
		return nbHeures;
	}

	public int getNbPersonnes() {
		return nbPersonnes;
	}
	
	
	/* les methodes utiles */
	public int trouverPrixBateau() {
		return bateau.getPrixHeure();
	}
	
	
	
}
