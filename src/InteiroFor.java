import java.util.Scanner;

public class InteiroFor {

	public static void main(String[] args) {
		final int N = 3;
		int arry [] = new int [N];
		 int i ;
		 int maior = 0;
		 int menor = 0;
		 
		Scanner ler = new Scanner(System.in);
		
		for (i = 0; i < 3; i++) {
			System.out.println("Informe os números: ");
			arry[i] = ler.nextInt();
			
			if (i == 0) {
				maior = arry [i];
				menor = arry [i];
			}
			if (arry [i] > maior) {
				maior = arry [i];
			}
			
			else {
				menor = arry [i];
			}
		}
		
		System.out.println("O maior é: "+ maior);
		System.out.println("O menor é: "+menor);
		
		ler.close();
	}


	}

