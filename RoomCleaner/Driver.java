import java.util.Scanner;  //may be necessary for input

import javax.swing.JOptionPane;  //may be necessary for input

import kareltherobot.*;

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

	int turner= 0;

	while (roomba.frontIsClear()==true){
		roomba.move();
		while (roomba.frontIsClear()==false){
			if (turner/2==0) {
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.move();
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.turnLeft();
			}
			if(turner/2!=0){
				roomba.turnLeft();
				roomba.move();
				roomba.turnLeft();
			}
			turner++;
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
