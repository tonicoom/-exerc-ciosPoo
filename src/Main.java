

import exercicio1.Pessoa;
import exercicio2.Bicicleta;
import exercicio3.Carro;
import exercicio3.Moto;
import exercicio4.Divisao;
import exercicio4.Multiplicacao;
import exercicio4.OperacaoMatematica;
import exercicio4.Soma;
import exercicio4.Subtracao;
import exercicio5.Circulo;
import exercicio5.Forma;
import exercicio5.Quadrado;
import exercicio5.Triangulo;

public class Main {

	public static void main(String[] args) {

		// Exercício 1

		Pessoa pessoa1 = new Pessoa("Carlos", 80.5, 1.75);
		double imc = pessoa1.calcularIMC();

		System.out.println("Cálculo de IMC:");
		System.out.printf("O IMC de %s é: %.2f\n", pessoa1.getNome(), imc);

		// Exercício 2

		Bicicleta minhaBike = new Bicicleta();

		System.out.println("Controle da Bicicleta:");
		minhaBike.mostrarVelocidade();
		minhaBike.acelerar(10);
		minhaBike.mostrarVelocidade();
		minhaBike.acelerar(5);
		minhaBike.mostrarVelocidade();
		minhaBike.frear(8);
		minhaBike.mostrarVelocidade();
		minhaBike.frear(7);
		minhaBike.mostrarVelocidade();

		// Exercício 3

		System.out.println("--- Testando o Carro ---");
		Carro meuCarro = new Carro(50, 12);
		meuCarro.mostrarAutonomia();
		meuCarro.andar(120);
		meuCarro.mostrarAutonomia();
		meuCarro.mostrarDistanciaPercorrida();
		meuCarro.andar(500);
		meuCarro.mostrarDistanciaPercorrida();

		System.out.println("\n--- Testando a Moto ---");
		Moto minhaMoto = new Moto(15, 25);
		minhaMoto.mostrarAutonomia();
		minhaMoto.andar(100);
		minhaMoto.mostrarAutonomia();
		minhaMoto.mostrarDistanciaPercorrida();

		// Exercício 4

		OperacaoMatematica soma = new Soma();
		OperacaoMatematica subtracao = new Subtracao();
		OperacaoMatematica multiplicacao = new Multiplicacao();
		OperacaoMatematica divisao = new Divisao();

		double x = 10;
		double y = 5;

		System.out.println("Calculadora:");
		System.out.printf("%.1f + %.1f = %.1f\n", x, y, soma.calcular(x, y));
		System.out.printf("%.1f - %.1f = %.1f\n", x, y, subtracao.calcular(x, y));
		System.out.printf("%.1f * %.1f = %.1f\n", x, y, multiplicacao.calcular(x, y));
		System.out.printf("%.1f / %.1f = %.1f\n", x, y, divisao.calcular(x, y));

		System.out.println("Criando formas...");
		Forma.mostrarQuantidadeObjetos();

		Circulo c1 = new Circulo(10.0);
		Quadrado q1 = new Quadrado(5.0);
		Triangulo t1 = new Triangulo(4.0, 6.0);
		Circulo c2 = new Circulo(2.5);

		System.out.printf("Área do Círculo: %.2f\n", c1.calcularArea());
		System.out.printf("Área do Quadrado: %.2f\n", q1.calcularArea());
		System.out.printf("Área do Triângulo: %.2f\n", t1.calcularArea());

		System.out.println("\nVerificando o contador de objetos:");
		Forma.mostrarQuantidadeObjetos();

	}
}
