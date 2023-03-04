package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame{
	public Layouts() {
		super("Meu Layout");
		
		Container container = getContentPane();
		
		container.add(BorderLayout.NORTH, new JButton("Bot�o norte"));
		container.add(BorderLayout.SOUTH, new JButton("Bot�o sul"));
		container.add(BorderLayout.CENTER, new JButton("Bot�o centro"));
		container.add(BorderLayout.EAST, new JButton("Bot�o leste"));
		container.add(BorderLayout.WEST, new JButton("Bot�o oeste"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Layouts();
	}
}
