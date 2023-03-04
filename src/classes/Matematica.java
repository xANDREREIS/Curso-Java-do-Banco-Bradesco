package classes;

public class Matematica {
	
	public int maior(int um, int dois) {
		if(um>dois) {
			return um;
		}else {
			return dois;
		}
	}
	
	public int raiz(int numero) {
		return (int) Math.sqrt(numero);
	}
	
	public String romanos(int numero) {
		return String.valueOf(numero);
	}
	
	public double soma(double um, double dois) {
		return um + dois;
	}
	
	
	
	
	
}
