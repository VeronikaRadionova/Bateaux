package resources;

public class Client {
	
	/* les informations sur un client */
	private String nomClient;
	private String prenomClient;
	
	private int jourNaissance;
	private int moisNaissance;
	
	
	/* constructeur */
	public Client(String nomClient, String prenomClient, int jourNaissance, int moisNaissance) {
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.jourNaissance = jourNaissance;
		this.moisNaissance = moisNaissance;
	}
	
	
	/* Getters pour les attributs */
	public String getNomClient() {
		return nomClient;
	}
	
	public String getPrenomClient() {
		return prenomClient;
	}
	public int getJourNaissance() {
		return jourNaissance;
	}
	public int getMoisNaissance() {
		return moisNaissance;
	}
	
	
}
