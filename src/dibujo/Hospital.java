package dibujo;

import javax.swing.*;

public class Hospital extends JFrame{
	
	public Hospital () {
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		add(new Dibujo());	
	}
	
	public static void main (String [] args) {
		new Hospital();
	}	
}




