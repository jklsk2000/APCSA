package Unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class RQE1 extends Canvas {
	   public RQE1()
	   {
		  setSize(800,600);
	      setBackground(Color.WHITE);   	
	      setVisible(true);
	   }

		public void update(Graphics window)
		{
			paint(window);
		}
	   
	   public void paint( Graphics window )
	   {
		   window.drawRect(15,15,7,6);
	   }
}
