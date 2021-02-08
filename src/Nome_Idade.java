import java.util.Scanner;
public class Nome_Idade {
	public static void main (String [] args) {
		
		String name;
		int id;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Qual o seu nome: ");
		name = ler.next();
		System.out.println("Olá,"+name+" qual a sua idade?");
		id = ler.nextInt();
		System.out.println("Ah! então você tem : "+id+" anos, "+name);
		
		ler.close();
		
	}
}
