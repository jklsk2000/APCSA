package unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
	  setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
	  Robot r = new Robot();
	   
      window.setColor(Color.BLUE);
      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      r.head(window);
      //call other methods
      r.upperBody(window);
      r.lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);
      window.fillOval(300, 100, 200, 100);
		//add more code here
      window.setColor(Color.RED);
      window.fillOval(340, 120, 20, 20);
      window.fillOval(440, 120, 20, 20);
      window.setColor(Color.BLACK);
      window.fillOval(390, 140, 30, 15);
      window.drawArc(350, 100, 100, 80, 225, 90);
   }

   public void upperBody( Graphics window )
   {
		//add more code here
	   window.setColor(Color.CYAN);
	   window.fillRect(320, 210, 160, 80);
	   window.setColor(Color.BLACK);
	   window.drawLine(320, 210, 220, 210);
	   window.drawLine(480, 210, 580, 210);
   }

   public void lowerBody( Graphics window )
   {
		//add more code here
	   window.setColor(Color.CYAN);
	   window.fillRect(320, 300, 160, 80);
	   window.setColor(Color.BLACK);
	   window.drawLine(320, 380, 320, 480);
	   window.drawLine(480, 380, 480, 480);
   }
}
