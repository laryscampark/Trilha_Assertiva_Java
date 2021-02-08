
public class Carro {

	public String cor;
	public String modelo;
	public double velocidadeAtual;
	
	
	public void liga() {
		System.out.println("O carro está ligado");
	}
	
	public void acelera (double qtd) {
		double novaV = this.velocidadeAtual + qtd;
		this.velocidadeAtual = novaV;
	}
	
	int pegaMarcha () {
		
		if (velocidadeAtual < 0) {
			return -1;
		}
		
		if (velocidadeAtual >= 0 && velocidadeAtual < 40) {
			return 1;
		}
		
		if (velocidadeAtual >= 40 && velocidadeAtual < 80) {
			return 2;
		}
		else {
			return 3;
		}
	}
}
