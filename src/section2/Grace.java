package section2;

import org.jointheleague.graphical.robot.Robot;

public class Grace {
	public static void main(String[] args) {
		Robot Rob = new Robot();
		Rob.penDown();
	Rob.setSpeed(100);
		for (int i = 0; i < 360; i++) {
			Rob.move(1);
			Rob.turn(1);
			
		}
	}

}
