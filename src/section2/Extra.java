package section2;

import org.jointheleague.graphical.robot.Robot;

public class Extra {
	public static void main(String[] args) {
		Robot Bobby=new Robot();

		Bobby.penDown();
		Bobby.setSpeed(100);
		
		int x=10;
		int y=600;
		
		for (int i = 0; i < 50; i++) {
			Bobby.turn(180);
			Bobby.move(75);
			Bobby.turn(-90);
			Bobby.move(25);
			
			x+=50;
		
					Bobby.turn(-90);
					
			
		}
	}

}
