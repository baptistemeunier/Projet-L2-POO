import javax.swing.JFrame;
 
public class Window extends JFrame {

	private static Window instance = null;

	public static Window getInstance() {
		if(instance == null) {
			instance = new Window();
		}
		return instance;
	}
	
	Window(){
	    this.setTitle("Project POO");
	    this.setSize(500, 500);
	    this.setLocationRelativeTo(null);               
	    this.setResizable(false);
	    this.setVisible(true);
	}

}