package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public void showButton() {
		System.out.println("Button clicked");

		JFrame frame = new JFrame();

		frame.setVisible(true);

		JButton button = new JButton();
		frame.add(button);
		frame.pack();

		button.addActionListener(this); 
		
		JOptionPane.showMessageDialog(null, "WOOHOO!");
		
		
		   
		int rand = new Random().nextInt(5);
		   
		   JOptionPane.showMessageDialog(null, "Click ok to see your number fortune");
		   
		JOptionPane.showMessageDialog(null, "You got "+rand);
		
		
		
		
		
		
		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		int rand = new Random().nextInt(5);
		
		if (rand == 1 ) {
			
			System.out.println("Your fortune is INFINITE RICHES!");
			
		}
		

		if (rand == 2 ) {
			
			System.out.println("Your fortune is terrible, you will become POOR!");
			
		}
		

		if (rand == 3 ) {
			
			System.out.println("Your fortune is absolutely NOTHING!");
			
		}
		

		if (rand == 4 ) {
			
			System.out.println("Your fortune is that you will get into a terrible accident...");
			
		}
		

		if (rand == 5 ) {
			
			System.out.println("Your fortune is ");
			
		}
		
		
		
	}

}
