import java.util.Scanner;
public class InteiroIf {
	
	public static void main (String [] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		final int N1 = ler.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		final int N2 = ler.nextInt();
		
		System.out.println("Informe o terceiro n�mero: ");
		final int N3 = ler.nextInt();
		
		
		if (N1 > N2) {
            if (N1 > N3) {
                if (N2 < N3) {
                    System.out.println("O menor n�mero �: " + N2);
                } else {
                    System.out.println("O menor n�mero �: " + N3);
                }
                System.out.println("O maior n�mero �: " + N1);
            } else {
                if (N1 < N2) {
                    System.out.println("O menor n�mero �h: " + N1);
                } else {
                    System.out.println("O menor n�mero �: " + N2);
                }
                System.out.println("O maior n�mero �: " + N3);
            }
        } else {
            if (N2 > N3) {
                if (N1 < N3) {
                    System.out.println("O menor n�mero �: " + N1);
                } else {
                    System.out.println("O menor n�mero �: " + N3);
                }
                System.out.println("O maior n�mero �: " + N2);
            } else {
                if (N1 < N2) {
                    System.out.println("O menor n�mero �: " + N1);
                } else {
                    System.out.println("O menorn�mero �h: " + N2);
                }
                System.out.println("O maior n�mero �: " + N3);
                
                ler.close();
            }
        }
    }
	
	}


