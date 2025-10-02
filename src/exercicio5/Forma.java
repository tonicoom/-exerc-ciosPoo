package exercicio5;

public abstract class Forma {
	private static int contadorObjetos = 0;

	public Forma() {
		contadorObjetos++;
	}

	public abstract double calcularArea();

	public static void mostrarQuantidadeObjetos() {
		System.out.println("Quantidade de formas criadas: " + contadorObjetos);
	}
}