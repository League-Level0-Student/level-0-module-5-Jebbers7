package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	
	SkillPractice skills = new SkillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5();
  
    
}

void skill1() {
	String answer = JOptionPane.showInputDialog("How many dimes do you have?");
	int answerInt = Integer.parseInt(answer);
	JOptionPane.showMessageDialog(null, "You have " + answerInt * 10 + " cents");
	String response = JOptionPane.showInputDialog("How tall are you? (inches)");
	int responseInt = Integer.parseInt(response);
	if(responseInt <= 36) {
		JOptionPane.showMessageDialog(null, "Eat your wheaties");
	}}
void skill2() {
	for (int i = 1; i < 31; i++) {
		if(i % 3 == 0) {
			System.out.println(i);
		}
	}}
void skill3() {
	Random rand = new Random();
	int i = rand.nextInt(20);
	System.out.println(i);
	int j = rand.nextInt(10);
	System.out.println(j);
	JOptionPane.showMessageDialog(null,"The difference between the numbers is " + (i - j));
}
void skill4() {
	String answer = JOptionPane.showInputDialog("What city do you live in?");
	if(answer.equalsIgnoreCase("San Diego")) {
		JOptionPane.showMessageDialog(null,"You live in America's finest city!");
	}
	else {
		JOptionPane.showMessageDialog(null, "You should move to San Diego");
	}
	int cars = 3;
	JOptionPane.showMessageDialog(null,"The cars have " + (cars*4) + " wheels between them.");
}
void skill5() {
	String answer = JOptionPane.showInputDialog("What is the name of your school?");
	JOptionPane.showMessageDialog(null, answer + "is a fantastic school!");
}
	
}

