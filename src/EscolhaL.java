import java.util.Scanner;
public class EscolhaL {

	public static void main(String[] args) {
		int op;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Escolha uma linguagem: Java ou C, sendo 1- Java e  2- C");
		op = ler.nextInt();
		
		switch (op) {
		
		case 1:
			System.out.println("Voc� escolheu a linguagem de programa��o Java");
			break;
		case 2:
			System.out.println("Voc� escolheu a linaguem de programa��o C");
			break;
			
			default:
				System.out.println("Op��o inv�lida");
				
				ler.close();
		}
	}

}
