package Asteroid;

import javax.swing.JFrame;
import java.awt.Component;

public class Asteroid extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Asteroid()
	{
		super("ASTEROID");
		setSize(WIDTH,HEIGHT);

		Board game = new Board();
		((Component)game).setFocusable(true);

		getContentPane().add(game);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		Asteroid run = new Asteroid();
	}
}
