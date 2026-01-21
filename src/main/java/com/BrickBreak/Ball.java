package com.BrickBreak;
import java.awt.*;
//
//  Class author: Akhil Palli
//  Date created:  1/5/2025
//  General description: In this class, the Ball's movements and other functions, which are necessary
// 						 for the balls movement are created.
//
public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private double changeX;
	private double changeY;
	private int size;

	
	
	//constructor(s):

	public Ball(int x, int y,int size) {
        this.x = x;
        this.y = y;
        this.changeX = changeX;
        this.changeY = changeY;
        this.size = size;
    }

	//methods:



	public int getSize(){
		return this.size;
	}




	//precondition: g is a non-null value
	//postcondition: makes the ball on the screen
   public void draw(Graphics g){
   	 
    
    	g.fillOval(x, y, size, size);

   }

   //precondition: None
   //postcondition: moves the ball by changeX and changeY
   public void move() {
	   
    x+= changeX;
    y+= changeY;
   }


   //precondition: None
 //postcondition: changes the y direction of the ball
   public void reverseY(){
    changeY*=-1;
   }
   
   //precondition: none
   //postcondition: changes the x direction of the ball
   public void reverseX(){
    changeX*=-1;
   }
   
  
 	//precondition: None
 	//postcondition: returns the ball's y value
  	public int getYpos() {
	  	return y;
  	}
  
  	//precondition: None
  	//postcondition: returns the ball's x value
  	public int getXpos() {
		  return x;
  	}
  
  	//precondition: y is a non-null number
  	//postcondition: sets the y value of the ball equal to the inputed y
  	public void setY(int y) {
	 	 this.y=y;
 	 }
  
	//precondition: x is a non-null number
	//postcondition: sets the x value of the ball equal to the inputed x
  	public void setX(int x) {
	  	this.x=x;
  	}


	//precondition: none
	//postcondition: gets the changeX of the ball equal to the inputed speed
	public double getChangeX() {
		return changeX;
	}

	//precondition: none
	//postcondition: gets the changeY of the ball equal to the inputed speed
	public double getChangeY() {
		return changeY;
		}
	//precondition: x is a non-null number, and when increasing or decreasing the changeX don't change by a whole number. Use smaller decimals 
	//postcondition: sets the changeX of the ball equal to the inputed x
	public void setChangeX(double newX) {
		this.changeX= newX;
	}
	//precondition: y is a non-null number, and when increasing or decreasing the changey don't change by a whole number. Use smaller decimals 
	//postcondition: sets the changeY of the ball equal to the inputed y
	public void setChangeY(double newY) {
		this.changeY=newY;
	}	


	//precondition: inputs an integer value
	// postcondition: updates x velocity of ball 
	public void setXVelocity(int nw){
		changeX = nw; 
	}
	
	//precondition: takes an input value to change Y velocity of the ball
	public void setYVelocity(int nw){
		changeY = nw;
	}


  
	
}
