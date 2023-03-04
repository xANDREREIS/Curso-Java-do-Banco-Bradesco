package interfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MeuFrame extends JFrame implements ActionListener{
	public MeuFrame() {
		
		super ("Meu Frame ");
		
		JButton botao = new JButton("Clique");
		botao.addActionListener(this);
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MeuFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Voce clicou");
		
	}
}
