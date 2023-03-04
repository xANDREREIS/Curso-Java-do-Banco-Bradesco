package prova;

import classes.Matematica;

public class MatematicaTeste {
	public static void main(String[] args) {
		Matematica matematica = new Matematica();
		int maior = matematica.maior(20, 10);
		System.out.println(maior);
		double soma = matematica.soma(50, 40);
		System.out.println(soma);
		
	}
}
