import java.awt.Point;

/**
 * Super classe qui gére les mouvements (Type  
 * @author baptiste
 *
 */
public abstract class Mouvement {
	
	/**
	 * Permet de savoir quand le mouvement est fini
	 * @return Vrai mouvement fini faux sinon
	 */
	public abstract boolean isFinish();
	
	/**
	 * @return Point prochan point à afficher
	 */
	public abstract Point getNextPoint();

}
