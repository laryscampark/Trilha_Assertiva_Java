import java.util.Scanner;
public class OperadoresA {

	public static void main(String[] args) {
		
		int result = 0;
		
		Scanner ler = new Scanner(System.in);
		
		result = 10 + 5;
		System.out.println(result);
		
		result = result - 5;
		System.out.println(result);
		
		result = result / 2;
		System.out.println(result);
		
		result = result * 10;
		System.out.println(result);
		
		result = result + 2;
		result = result % 5;
		
		System.out.println(result);
		System.out.println("Resultado: "+result);
		
		ler.close();
		
	}

}
