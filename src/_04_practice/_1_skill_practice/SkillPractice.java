package _04_practice._1_skill_practice;

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
	// UNFINISHED \\
	

	
}
}
