package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot jefferey = new Robot();
		for (int i = 0; i < 1; i++) {
			jefferey.setPenColor(0, 0, 255);

			jefferey.moveTo(100, 200);
			jefferey.setSpeed(7);
			jefferey.penDown();
			jefferey.move(-200);
			jefferey.turn(-90);
			jefferey.move(-200);
			jefferey.turn(-90);
			jefferey.move(-200);
			jefferey.turn(-90);
			jefferey.move(-200);
			jefferey.turn(-90);
		}
