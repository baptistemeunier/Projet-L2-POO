import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		FormeContainer formeCont = new FormeContainer(); // Chargement d'un container pour les formes

		/** Ajout des formes et mouvement demandé dans le sujet */
		formeCont.addForme(new Cercle(Color.RED, 10), new LineaireMouvement(new Point(100, 100), new Point(300, 100)));
		formeCont.addForme(new Rectangle(Color.BLUE, 30, 20), new CirculaireMouvement(new Point(100, 100), 50));
		formeCont.addForme(new Ellipse(Color.GREEN, 20, 10), new ArchimedeMouvement(new Point(250, 250), 100, 50));

		/** Création de la fenêtre **/
		Window window = new Window();
		AffichageFormePanel panel = new AffichageFormePanel(formeCont);
		window.setContentPane(panel);

		/** Tant que des formes sont à déplacer **/
		while(formeCont.moveAll()) {
			panel.repaint(); 
			try {
			    Thread.sleep(5);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
		System.out.println("end");
		
	}
}