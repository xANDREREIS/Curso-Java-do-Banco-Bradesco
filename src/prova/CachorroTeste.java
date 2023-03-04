package prova;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Cachorro;

public class CachorroTeste {
	public static void main(String[] args) {
		List<Cachorro> cachorros = new ArrayList<>();
		String name;
		String age;
		String weight;
		for (int i = 0; i < 2; i++) {
			Cachorro cachorro = new Cachorro();
			name = JOptionPane.showInputDialog("Digite o nome do cachorro: ");
			age = JOptionPane.showInputDialog("Digite a idade do cachorro: "); 
			weight = JOptionPane.showInputDialog("Digite o peso do cachorro: "); 
			cachorro.setName(name);
			cachorro.setAge(Integer.valueOf(age));
			cachorro.setWeight(Double.valueOf(weight));
			cachorro.latir();
			cachorros.add(cachorro);
		}
		for (Cachorro cachorro : cachorros) {
			System.out.println(cachorro);
			System.out.println("------------");
		}
			
	}
}
