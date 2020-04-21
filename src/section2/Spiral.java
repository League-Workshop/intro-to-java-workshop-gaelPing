package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot beta= new Robot();
		// 2. Set your robot's pen down 
		beta.penDown();
		// 3. Set the robot to go at max speed (100)
		beta.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 75; i++) {
			beta.setPenWidth(i);
			beta.setRandomPenColor();
			beta.move(5*i);
			beta.turn(360/7);
		}
			// 5. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			
			// 7. Turn the robot 360/7 degrees to the right
		
			// 8. Set the pen width to i
			
	}
}
