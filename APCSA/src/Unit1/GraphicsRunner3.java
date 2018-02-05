package Unit1;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsRunner3 extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner3()
	{
		super("Rectangle");
		setSize(WIDTH,HEIGHT);
		getContentPane().add(new RQE1());
		setVisible(true);
	}

	public static void main( String args[] )
	{
		GraphicsRunner3 run = new GraphicsRunner3();
	}
}

