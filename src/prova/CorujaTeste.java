package prova;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Cachorro;
import classes.Coruja;

public class CorujaTeste {
	public static void main(String[] args) {
		String name;
		String age;
		String weight;
		List<Coruja> corujas = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Coruja coruja = new Coruja();
			name = JOptionPane.showInputDialog("Digite o nome do coruja: ");
			age = JOptionPane.showInputDialog("Digite a idade da coruja: "); 
			weight = JOptionPane.showInputDialog("Digite o peso da coruja: "); 
			coruja.setName(name);
			coruja.setAge(Integer.valueOf(age));
			coruja.setWeight(Double.valueOf(weight));
			coruja.botouOvo();
			coruja.voar();
			corujas.add(coruja);
		}
	}
}
