import java.util.Scanner;
public class InteiroIf {
	
	public static void main (String [] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		final int N1 = ler.nextInt();
		
		System.out.println("Informe o segundo número: ");
		final int N2 = ler.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		final int N3 = ler.nextInt();
		
		
		if (N1 > N2) {
            if (N1 > N3) {
                if (N2 < N3) {
                    System.out.println("O menor número é: " + N2);
                } else {
                    System.out.println("O menor número é: " + N3);
                }
                System.out.println("O maior número é: " + N1);
            } else {
                if (N1 < N2) {
                    System.out.println("O menor número éh: " + N1);
                } else {
                    System.out.println("O menor número é: " + N2);
                }
                System.out.println("O maior número é: " + N3);
            }
        } else {
            if (N2 > N3) {
                if (N1 < N3) {
                    System.out.println("O menor número é: " + N1);
                } else {
                    System.out.println("O menor número é: " + N3);
                }
                System.out.println("O maior número é: " + N2);
            } else {
                if (N1 < N2) {
                    System.out.println("O menor número é: " + N1);
                } else {
                    System.out.println("O menornúmero éh: " + N2);
                }
                System.out.println("O maior número é: " + N3);
                
                ler.close();
            }
        }
    }
	
	}


