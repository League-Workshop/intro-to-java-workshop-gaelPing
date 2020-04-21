package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot alpha=new Robot();
		alpha.setSpeed(10);
		alpha.penDown();
	
		for (int i = 0; i < 4; i++) {
			alpha.move(100);
			alpha.turn(90);
			
		}
		
		
	}
}
