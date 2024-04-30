package resources;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Bureau {
	
	/* les informations du bureau des résérvations */
	private Map <Reservation, Float> reservations = new HashMap<>();
	private int nbReservations;
	
	
	/* constructeur */
	public Bureau(Map<Reservation, Float> reservations) {
		this.reservations = reservations;
	}

	
	/* Getters pour les attributs */
	public Map<Reservation, Float> getReservations() {
		return reservations;
	}

	public int getNbReservations() {
		return nbReservations;
	}

	
	/* les methodes utiles */
	
	public void ajouterReservation(Reservation reservation, float prix) {
		if (!reservations.containsKey(reservation)) {
			reservations.put(reservation, prix);
			nbReservations++;
		}
	}
	
	public void supprimerReservation(Reservation reservation) {
		if (reservations.containsKey(reservation)) {
			float prix = reservations.get(reservation);
			reservations.remove(reservation, prix);
			nbReservations--;
		} else {
			throw new NoSuchElementException();
		}
	}
	
	public Reservation rechercherReservation(int numReservation) {
		Set<Reservation> keySet = reservations.keySet();
        ResaIterator it = new ResaIterator(keySet);
        
        try {
            while (it.hasNext()) {
                Reservation courant = it.next();
                if (courant.getNumReservation() == numReservation) {
                    return courant;
                }
            }
            throw new NoSuchElementException("Résérvation numéro " + numReservation + " n'existe pas");
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException : " + e.getMessage());
        }
        return null;
	}
	
	public float recherchePrix(Reservation reservation) {
		if (reservations.containsKey(reservation)) {
			return reservations.get(reservation);
		} else {
			throw new NoSuchElementException();
		}
	
	}
	
	
}
