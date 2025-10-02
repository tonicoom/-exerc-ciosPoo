package exercicio5;

public class Circulo extends Forma {
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * this.raio * this.raio;
	}
}
