//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		
		int randomNumber = randomMaker.nextInt(5);
		
		

		// 1. Use each value of randomNumber to give the user a random compliment.
		String compliments[] = {"You are very smart", "You are good at math", "You are very nice", "You are very good at running", "Your a natural born artist"};
		JOptionPane.showInputDialog(compliments[randomNumber]);
		
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
