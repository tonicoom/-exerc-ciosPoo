package exercicio3;

public class Veiculo {
	protected double capacidadeTanque;
	protected double consumoKmL;
	protected double combustivelAtual;
	protected double distanciaPercorrida;

	public Veiculo(double capacidadeTanque, double consumoKmL) {
		this.capacidadeTanque = capacidadeTanque;
		this.consumoKmL = consumoKmL;
		this.combustivelAtual = capacidadeTanque;
		this.distanciaPercorrida = 0;
	}

	public void andar(double distancia) {
		double combustivelNecessario = distancia / this.consumoKmL;

		if (combustivelNecessario <= this.combustivelAtual) {
			this.combustivelAtual -= combustivelNecessario;
			this.distanciaPercorrida += distancia;
			System.out.printf("O veículo andou %.1f km.\n", distancia);
		} else {
			double distanciaPossivel = this.combustivelAtual * this.consumoKmL;
			this.distanciaPercorrida += distanciaPossivel;
			this.combustivelAtual = 0;
			System.out.printf("Combustível insuficiente! O veículo andou apenas %.1f km e parou.\n", distanciaPossivel);
		}
	}

	public void mostrarAutonomia() {
		double autonomia = this.combustivelAtual * this.consumoKmL;
		System.out.printf("Autonomia atual: %.1f km.\n", autonomia);
	}

	public void mostrarDistanciaPercorrida() {
		System.out.printf("Distância total percorrida: %.1f km.\n", this.distanciaPercorrida);
	}
}