package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;


//
//  Class author:  Akhil Palli
//  Date created: 1/ 5/ 2026
//  General description: Defines all the methods necessary for paddle class to run.
//  
public class Paddle {

	//your code here!

	//don't forget you need instance variables:
	private int x;
	private int y;
	private int height;
	private int speed;
	private int width=15;
	
	//constructor(s):
	public Paddle (int x, int y, int height, int speed) {
		this.x = x;
        this.y = y;
        this.height = height;
        this.speed = speed;
	}
	
	//methods:

	//precondition: none
	//postcondition: fetches players paddle's velocity.
	public int getVelocity(){
		return this.speed;
	}

	//preconditon: takes an integer value and ads it to velocity.
	//postcondition: updates player's paddle's velocity.
	public int addVelocity(int adds){
		return this.speed + adds;
	}



	//precondition: None
	//postcondition: returns a number (width) for the players paddle.
	public int getWidth(){
		return this.width;
	}


	//precondition: none 
	//Postcondition: Returns an integer( height ) for the player paddle
	public int getHeight(){
		return this.height;
	}




	//precondition: g is a non-null value
	//postcondition: draws the paddle on the screen
	public void draw(Graphics g) {
		
		
		g.fillRect(x, y, width, height);
		
	}




	//precondition: location is a non-null value
	//postcondition: moves the paddle in the direction of the location 
	public void moveX(int location) {
	 int centerX = x + height / 2;		
	 
	 if (centerX<location) {
		if ((centerX+speed)>location) {
			x+= Math.abs(location-(centerX+speed));
		}
		else y+=speed;
	 }
	 else if (centerX>location) {
	      if((centerX-speed)<location) {
	    	  y-=(location-(centerX-speed));
	      }
	      else { y-=speed;	} 
	 }
	}

	//precondition: none
	//postcondition: returns the paddles y
	public int getY() {
		  return y;
	  }
	
	//precondition: none
	//postcondition: returns the paddles x
	  public int getX() {
		  return x;
	  }


	  //precondition: ball is a non-null value
		//postcondition: returns true if the ball is touching one the paddle this is called on
	 public boolean isTouching(Ball ball) {
		 int rightX= x+width;
		 int bottomY = y+height;
		  if(x <= ball.getXpos() && ball.getXpos()<=rightX) {
			 System.out.println("x in bounds");
			 if(bottomY >= ball.getYpos() && ball.getYpos()>=y) {
				 
				 return true;
			 }
	 }
		 return false;
	 }


	 //precondition: accepts integer value
	 //postcondidtion:  changes x pos of paddle.
	 public void setX(int num){
		this.x = num; 
	}

	//precondition: Accepts an integer value
	//postcondition: sets the velocity  of the paddle.
	public void setVelocity(int num ){
		this.speed = num;	
	}

	//preconditon: none
	//postcondition: makes players paddle moveable 
	public void move(){
		speed = 1;
	}
}
