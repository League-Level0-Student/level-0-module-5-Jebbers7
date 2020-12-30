package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Please enter a number");
	int answerInt = Integer.parseInt(answer);
	String response = prime(answerInt);
	JOptionPane.showMessageDialog(null, response);
	
	
}
static String prime(int number) {
	for(int i = 2; i < number; i++)	{
		if(number % i == 0) {
		return number + " is not prime";	
		}	
	}
return number + " is prime";
}
}
