package classes;

public class Cachorro extends Animal{
	public void latir() {
		System.out.println("AUUUUUU AU AU AU");
	}
	@Override
	public String toString() {
		return "Cachorro [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}
