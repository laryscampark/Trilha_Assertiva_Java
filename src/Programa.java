import java.util.Scanner; 
public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		Conta c = new Conta();

		c.cpf = 123456789;
		c.nc = 258741369;
		c.saldo = 200;
		
		c.sacar(20);
		c.deposito(10);
		
		System.out.println("O cpf do titular da conta: "+c.cpf);
		System.out.println("O número da conta do titular: "+c.nc);
		System.out.println("Seu saldo atual é R$: " +c.saldo);
		
		ler.close();
	}

}
