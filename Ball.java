package gameWindow;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle
{
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;
    
	
	Ball(int x, int y, int width, int height) 
	{
		super(x, y, width, height);
		random = new Random();
		int randomXdirection = random.nextInt(2);  //This is going to be either 1 or 0. If it is 0, the ball is going to go to the left and if it is 1, the ball is going to go to the right.
		if (randomXdirection == 0)
			randomXdirection--;
		setXDirection(randomXdirection*initialSpeed);
		int randomYdirection = random.nextInt(2);
		if (randomYdirection == 0)
			randomYdirection--;
		setYDirection(randomYdirection*initialSpeed);
			
		
	}
	
	public void setXDirection(int randomXDirection)
	{
		xVelocity = randomXDirection;
	}
	
	public void setYDirection(int randomYDirection)
	{
		yVelocity = randomYDirection;
	}
	
	public void move()
	{
	    x += xVelocity;
	    y += yVelocity;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
}
