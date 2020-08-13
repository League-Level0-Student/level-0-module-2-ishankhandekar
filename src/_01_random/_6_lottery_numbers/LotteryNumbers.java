package _01_random._6_lottery_numbers;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<Integer>();
	
Random randy = new Random();
for(int i = 0;i<6;i++) {
 int random = randy.nextInt(9);
list.add(random);
 
}
JOptionPane.showMessageDialog(null, "Lottery Number " + list.get(0) + list.get(1) + list.get(2) + list.get(3) + list.get(4) + list.get(5));
	}
}
