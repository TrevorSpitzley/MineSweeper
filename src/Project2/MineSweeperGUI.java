package Project2;


import javax.swing.*;

public class MineSweeperGUI {
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Mine Sweeper!");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		MineSweeperPanel panel = new MineSweeperPanel();
		frame.getContentPane().add(panel);
		frame.setSize(800, 500);
		frame.setVisible(true);
	}
}

