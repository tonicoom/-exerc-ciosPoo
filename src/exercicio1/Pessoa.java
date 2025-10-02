package exercicio1;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;

	public Pessoa(String nome, double peso, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public double calcularIMC() {
		if (this.altura <= 0) {
			return 0;
		}
		return this.peso / (this.altura * this.altura);
	}

	public String getNome() {
		return nome;
	}
}