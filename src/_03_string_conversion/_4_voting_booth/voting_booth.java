package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {
public static void main(String[] args) {
	String HowOld = null;
	int HowOld2 = 0;
	HowOld = JOptionPane.showInputDialog("How old are you?");
	HowOld2 = Integer.parseInt(HowOld);
	if (HowOld2 >= 18) {
		JOptionPane.showInputDialog(null, "who should the next president be?");
		JOptionPane.showMessageDialog(null, "I think so too!");
	}else if (HowOld2 < 18) {
	JOptionPane.showMessageDialog(null, "You are not old enough to vote. In other words, nobody cares about your opinion.");	
	}
}
}
