package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	static Robot rob = new Robot();
public static void main(String[] args) {
	rob.setSpeed(50);
	
	String response = JOptionPane.showInputDialog("What color would you like - green, red, or blue?");
	if(response.equalsIgnoreCase("green")) {
		rob.setPenColor(0, 255, 0);
	}
	else if(response.equalsIgnoreCase("red")) {
		rob.setPenColor(255, 0, 0);
	}
	else {
		rob.setPenColor(0, 0, 255);
	}
	
	String answer = JOptionPane.showInputDialog("Which shape do you want?");
	if(answer.equalsIgnoreCase("square")) {
		drawSquare();
	}
	else if(answer.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	else {
		drawCircle();
	}
}

private static void drawSquare() {
	// TODO Auto-generated method stub
	rob.penDown();
	for(int i = 0; i < 4; i++) {
	rob.move(100);
	rob.turn(90);
	}
}

private static void drawTriangle() {
	rob.penDown();
	for(int j = 0; j < 3; j++) {
		rob.move(100);
		rob.turn(120);
	}
}
private static void drawCircle() {
	rob.penDown();
	rob.setSpeed(500);
	for(int i = 0; i < 360; i++) {
		rob.move(1);
		rob.turn(1);
	}
}}
	

