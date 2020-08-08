import java.applet.Applet;
import java.awt.Graphics;


public class AppletExample extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public void paint(Graphics g){
        g.drawArc(100, 50, 100, 100, 0, 360);
        g.drawArc(120, 75, 10, 10, 0, 360);
        g.drawArc(170, 75, 10, 10, 0, 360);
        g.drawLine(150, 75, 150, 110);
        g.drawArc(125, 120, 50, 10, 180, 360);
	}

	
		
}
