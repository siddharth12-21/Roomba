import java.util.Scanner;  //may be necessary for input

import javax.swing.JOptionPane;  //may be necessary for input

import kareltherobot.*;
//SIDDHARTH RAMESH
public class Driver implements Directions {
// declared here so it is visible in all the methods!! 
// It will be assigned a value in the getInfo method
	private static Robot roomba; 

	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		Driver d = new Driver();
		Robot roomba = new Robot(7,6,North,0);

    String wrldName = "basicRoom.wld";
	World.readWorld(wrldName);
    World.setVisible(true);
	World.setDelay(1);
	int row=0;
	int columns=0;
	int area;
	boolean go= true;
	while (go==true){
		while (roomba.frontIsClear()==true){
			roomba.move();
			if (roomba.nextToABeeper() == true){
				while (roomba.nextToABeeper()==true){
					roomba.pickBeeper();
				}
			}
			while (roomba.frontIsClear()==false){
				if (roomba.facingNorth() == true) {
					row ++;
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.move();
					while (roomba.nextToABeeper()==true){
						roomba.pickBeeper();
					}
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
				}
				else if (roomba.facingSouth() == true){
					row++;
					roomba.turnLeft();
					roomba.move();
					while (roomba.nextToABeeper()==true){
						roomba.pickBeeper();
					}
					roomba.turnLeft();
				}
			}
		}
	}
		// the line below causes a null pointer exception
		// what is that and why are we getting it?

		


  





  	/*
	 * this info in the console (boring) or you can present using JOptionPane (cool!)
	 */

    System.out.println("The biggest pile was ");
	








  }

}
