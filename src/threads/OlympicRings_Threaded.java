package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot r1 = new Robot(300, 300);
	Robot r2 = new Robot(500, 700);
	Robot r3 = new Robot(700, 300);
	Robot r4 = new Robot(900, 700);
	Robot r5 = new Robot(1100, 300);
	
	r1.setSpeed(10);
	r1.penDown();
	r1.setPenWidth(10);
	r1.setPenColor(Color.BLUE);
	
	r2.setSpeed(10);
	r2.penDown();
	r2.setPenWidth(10);
	r2.setPenColor(Color.YELLOW);
	
	r3.setSpeed(10);
	r3.penDown();
	r3.setPenWidth(10);
	
	r4.setSpeed(10);
	r4.setPenColor(Color.GREEN);
	r4.penDown();
	r4.setPenWidth(10);
	
	
	r5.setSpeed(10);
	r5.setPenColor(Color.RED);
	r5.penDown();
	r5.setPenWidth(10);
	
	
		new Thread(()-> {
			for (int i = 0; i < 360; i++) {
			r1.move(5);
			r1.turn(1);
			
			
			
			
			}
		}).start();
		
		new Thread(()-> {
			for (int i = 0; i < 360; i++) {
				
			
			r2.move(5);
			r2.turn(1);
			}
		}).start();
		
new Thread(()-> {
	for (int i = 0; i < 360; i++) {
		
	
	r3.move(5);
	r3.turn(1);
	}
		}).start();

new Thread(()-> {
	for (int i = 0; i < 360; i++) {
		
	
	r4.move(5);
	r4.turn(1);
	}
}).start();

new Thread(()-> {
	for (int i = 0; i < 360; i++) {
		
	
	r5.move(5);
	r5.turn(1);
	}
}).start();
}
}

