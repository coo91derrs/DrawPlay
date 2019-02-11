import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Moon {

	private static final int RAYON = 20;

	public void draw(Graphics g, int mouseX, int mouseY) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.white);
		g2.fillOval(mouseX, mouseY, RAYON, RAYON);
		int x = mouseX + RAYON;
		int y = mouseY + RAYON / 2;
		// text appears below mouse body, +10 places below
		// so it doesn't overlap the drawing
		g2.drawString("Squeak", mouseX, mouseY + RAYON + 11);
	}
}
