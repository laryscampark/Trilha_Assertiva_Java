
public class Tamanho_Array {

	public static void main (String [] args) {
		
		int [] arryOne = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
		int [] arryTwo = {43, 42, 4, 8, 55, 21, 2, 45};
		
		if (arryTwo.length > 8) {
			
			System.out.println("O tamanho do ArryTwo - Maior que 8!");
		}else{
			System.out.println("O tamanho do ArryTwo - Menor que 8!");
		}
			System.out.println("O tamanho do ArryOne = "+arryOne.length);
	}
}
