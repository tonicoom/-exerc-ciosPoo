package exercicio4;

public class Divisao extends OperacaoMatematica {
	@Override
	public double calcular(double a, double b) {
		if (b == 0) {
			System.out.println("Erro: Divisão por zero!");
			return Double.NaN;
		}
		return a / b;
	}
}
