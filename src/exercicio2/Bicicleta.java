package exercicio2;

public class Bicicleta {
	private int velocidade;
	private String estado;

	public Bicicleta() {
		this.velocidade = 0;
		this.estado = "parada";
	}

	public void acelerar(int delta) {
		this.velocidade += delta;
		System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");

		if (this.velocidade > 0) {
			this.estado = "andando";
		}
	}

	public void frear(int delta) {
		this.velocidade -= delta;

		if (this.velocidade <= 0) {
			this.velocidade = 0;
			this.estado = "parada";
		}
		System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");
	}

	public void mostrarVelocidade() {
		System.out.printf("A bicicleta está %s a %d km/h.\n", this.estado, this.velocidade);
	}
}