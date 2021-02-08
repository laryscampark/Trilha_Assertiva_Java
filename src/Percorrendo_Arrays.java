
public class Percorrendo_Arrays {

	public static void main (String [] args) {
		
		int [] arryN = {87, 68, 52, 5, 49, 83, 45, 12, 64};
		int somaArry = 0;
		
		for(int i : arryN) 
			somaArry += i;
			
			System.out.println("O total de elementos na arryN: % \n"+somaArry);
		}
		
	}

