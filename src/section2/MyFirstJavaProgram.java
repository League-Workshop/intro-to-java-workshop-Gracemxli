package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot Rob = new Robot ();
		Rob.penDown();
		Rob.setSpeed(100);
		Rob.move(100);
		Rob.turn(90);
		Rob.move(100);
		Rob.turn(90);
		Rob.move(100);
		Rob.turn(90);
		Rob.move(100);
		Rob.turn(90);
	}
}
