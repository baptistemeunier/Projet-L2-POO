import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class qui permet de stocker les formes et de les mettre à jour
 * @author baptiste
 *
 */
public class FormeContainer implements Iterable<Forme>{
	private ArrayList<Forme> formes = new ArrayList<Forme>(); // Liste des formes
	
	/**
	 * Initialise l'array list
	 */
	public FormeContainer() {
		this.formes = new ArrayList<Forme>();
	}
	
	/**
	 * Ajoute une forme dans la liste
	 * @param Forme f La forme à ajouter
	 */
	public void addForme(Forme f) {
		this.formes.add(f);
	}

	/**
	 * Ajoute une forme dans la liste puis lui applique un mouvement
	 * @param Forme f La forme à ajouter
	 * @param Mouvement mouv Le mouvement à appliquer
	 */
	public void addForme(Forme f, Mouvement mouv) {
		this.addForme(f);
		f.setMouvement(mouv);
	}
	
	/**
	 * Retourne un iterateur pour permetre de parcourir l'ArrayList
	 * @Override
	 * @return Iterator<Forme> Un iterateur pour l'ArrayList
	 */
	@Override
	public Iterator<Forme> iterator() {
		return this.formes.iterator();
	}

	/**
	 * Met à jour les coordonées de chaque forme
	 * @return boolean Faux si plus aucune forme n'est a déplacer
	 */
	public boolean moveAll() {
		boolean finish = false;
		for(Forme f : this.formes) { // Pour chaque forme
			finish |= f.move();
		}
		return finish;
	}
}