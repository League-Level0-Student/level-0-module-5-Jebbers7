package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class forloopgauntlet {
public static void main(String[] args) {
	//#1 Display numbers 1-100
	for(int i = 0; i < 101; i++) {
		//System.out.println(i);
	}
	//#2 Display numbers 100-0
	for (int i = 100; i > 0; i--) {
		//System.out.println(i);
	}
	//#3 Display all even numbers from 2-100

	for (int i = 0; i < 101; i++) {
		if(i % 2 == 0) {
			//System.out.println(i);
		}
	}

	//#4 Display all odd numbers from 1-99
	for (int i = 0; i < 100; i++) {
		if(i % 2 == 1) {
			//System.out.println(i);
		}
	}
	//#5 Display all numbers 1-500. Print odd and even next to them
	for (int i = 0; i < 501; i++) {
		if(i % 2 == 0) {
			//System.out.println(i + " is even");
		}
		else {
			//System.out.println(i + " is odd");
		}
	}
	//#6 Display all multiples of 7 from 0-777
	for (int i = 0; i < 778; i++) {
		if(i % 7 == 0) {
			//System.out.println(i);
		}
	}
	//#7 Print all the years you were alive and how old you were in each
	for (int i = 2007; i < 2022; i++) {
		int var = i - 2007;
		//System.out.println("In "+ i + " I was " + var);
	}
	//NESTED FOR LOOPS
	//#1 Display shown output
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			//System.out.println(i + " " + j);
		}
	}
	//#2 Display numbers 1-9 in a 3x3 grid as shown
	int count = 1;
	for (int i = 0; i < 3; i++) {
		for (int j = 1; j < 4; j++) {
			//System.out.print(count + " ");
			count ++;
		}
		//System.out.println();
	}
	//#3 Display the numbers 1-100 in a 10x10 square grid
	int var = 1;
	for (int i = 0; i < 10; i++) {
		for (int j = 1; j < 11; j++) {
			System.out.print(var + " ");
			var ++;
		}
		System.out.println();
	}
	//#4 Display shown output
	for (int i = 1; i < 7; i++) {
		for (int j = 1; j < 2; j++) {
			System.out.println("*");
		}
	}
	
	for (int j = 1; j <= 3; j++) {
		for (int i = 0; i < j; i++) {
			
		}
		
	}
	
	for (int i = 0; i < 3; i++) {
		
	}
	















}
}
