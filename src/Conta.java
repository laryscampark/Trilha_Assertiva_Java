public class Conta {
	
	public int cpf;
	public int nc;
	public double saldo;
	
	public void sacar (double qt) {
		double novoS = this.saldo -qt;
		this.saldo = novoS;
	}
	
	double deposito (double depo){
		this.saldo = saldo + depo;
		return saldo;
	}
}
