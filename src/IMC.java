import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
		
		double peso, altura, imc;
	    
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe seu peso: ");
		peso = ler.nextDouble();
		
		System.out.println("Informe sua altura: ");
		altura = ler.nextDouble();
		
		imc = (peso/(altura*altura));
		
		if (imc < 18.5) {
			System.out.println("Adulto com baixo peso: "+imc);
		}
		
		else if (imc >= 18.5 && imc < 25.0) {
			System.out.println("Adulto com peso adequado: "+imc);
		}
		
		else if (imc >= 25.0 && imc < 30.0) {
			System.out.println("Adulto com sobrepeseo: "+imc);
		}
		
		else {
			System.out.println("Adulto com obesidade: "+imc);
		}
		ler.close();
	}

}
