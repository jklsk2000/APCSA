package unit1;

import javax.swing.JFrame;

public class GraphicsRunner0 extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner0()
	{
		super("Graphics Runner");
		
		setSize(WIDTH,HEIGHT);
		getContentPane().add(new SmileyFace());
		//getContentPane().add(new BigHouse());				
		//getContentPane().add(new Robot());	
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner0 run = new GraphicsRunner0();
	}
}