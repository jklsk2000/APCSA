package testing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class BreakOut extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;
	private int score;
	private Wall up, down, left, right;
	private Block[][] blocks;
	
	public BreakOut()
	{		
		//Name, Period, Date, Computer Number
		System.out.println("Name: Danny Lee\nPeriod 4\nDate: 4/4/2018\nComputer Number: 22");
		
		//Ball, Paddle, Score
		ball = new Ball(250,100,10,10,Color.BLUE,4,3);
		paddle = new Paddle(750,400,20,100,Color.BLUE,7);
		score = 0;
		
		//Setting up wall of blocks
		blocks = new Block [5][4];
		int spacingHor = 30;
		int spacingVer = 30;
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 4; j++){
				blocks[i][j] = new Block (spacingHor,spacingVer,10,80,Color.BLACK);
				spacingHor += 40;
			}
			spacingHor = 30;
			spacingVer += 105;
		}
		
		//Setting up walls (Wall.java)
		up = new Wall(0,0,800,10,Color.GRAY);
		down = new Wall(0,551,800,10,Color.GRAY);
		left = new Wall(0,10,10,541,Color.GRAY);
		right = new Wall(774,10,10,541,Color.GRAY);

		keys = new boolean[2];

    	setBackground(Color.WHITE);
		setVisible(true);
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		Graphics2D twoDGraph = (Graphics2D)window;

		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		Graphics graphToBack = back.createGraphics();

		//Draw game elements
		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);
		up.draw(graphToBack);
		down.draw(graphToBack);
		left.draw(graphToBack);
		right.draw(graphToBack);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("Score: " + score, 375, 525);
		for (int i = 0; i < 5; i++){
			for(int j = 0; j < 4; j++){
				blocks[i][j].draw(graphToBack);
			}
		}

		graphToBack.setColor(Color.BLUE);
		
		//Ball colliding with right wall (AKA LOSE)
		if (ball.didCollideRight(right))
		{
			//Stops Ball
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			//Resets Score
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 375, 525);
			score = 0;
			graphToBack.drawString("Score: " + score, 375, 525);
			
			//Resets Ball
			ball.draw(graphToBack,Color.WHITE);
			ball.setX(300);
			ball.setY(20);
			ball.setXSpeed(4);
			ball.setYSpeed(3);
			ball.setColor(Color.BLUE);
			
			//Resets Wall of Blocks
			int spacingHor = 30;
			int spacingVer = 30;
			for (int i = 0; i < 5; i++){
				for (int j = 0; j < 4; j++){
					blocks[i][j] = new Block (spacingHor,spacingVer,10,80,Color.BLACK);
					spacingHor += 40;
				}
				spacingHor = 30;
				spacingVer += 105;
			}
		}
		
		//Ball colliding with other walls
		if (ball.didCollideTop(up) || ball.didCollideBottom(down)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (ball.didCollideLeft(left)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		
		//Ball colliding with paddle
		if (ball.didCollideTop(paddle) || ball.didCollideBottom(paddle)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (ball.didCollideLeft(paddle) || ball.didCollideRight(paddle)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		
		//Ball colliding with blocks
		for (int l = 0; l < 5; l++){
			for (int m = 0; m < 4; m++){
				if (ball.didCollideBottom(blocks[l][m])||ball.didCollideLeft(blocks[l][m])||ball.didCollideRight(blocks[l][m])||ball.didCollideTop(blocks[l][m])){
					if (ball.didCollideBottom(blocks[l][m])||ball.didCollideTop(blocks[l][m])){
						ball.setYSpeed(-ball.getYSpeed());
					}
					if(ball.didCollideLeft(blocks[l][m])||ball.didCollideRight(blocks[l][m])){
						ball.setXSpeed(-ball.getXSpeed());
					}
					blocks[l][m].setColor(Color.WHITE);
					blocks[l][m].draw(graphToBack);
					blocks[l][m].setWidth(0);
					blocks[l][m].setHeight(0);	
					
					score += 1;
					graphToBack.setColor(Color.WHITE);
					graphToBack.drawString("Score: " + (score - 1), 375, 525);
					graphToBack.setColor(Color.BLUE);
					graphToBack.drawString("Score: " + score, 375, 525);
				}
			}
		}
		
		
		//Paddle movement
		if(keys[0] == true) //W
		{
			paddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true) //Z
		{
			paddle.moveDownAndDraw(graphToBack);
		}
		
		//Victory
		if (score == 20){
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			graphToBack.setColor(Color.BLUE);
			graphToBack.drawString("YOU WIN!!!", 380, 300);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}
