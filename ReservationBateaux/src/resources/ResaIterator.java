package resources;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class ResaIterator implements Iterator <Reservation> {
	private Iterator<Reservation> iterateur;
	
	
	public ResaIterator(Set<Reservation> reservations) {
		this.iterateur = reservations.iterator();
	}

	@Override
	public boolean hasNext() {
		return iterateur.hasNext();
	}

	@Override
	public Reservation next() {
		if (!hasNext()) {
			throw new NoSuchElementException("Aucun élément");
		}
		return iterateur.next();
	}

	@Override
	public void remove() {
		iterateur.remove();
	}
	
	

}
