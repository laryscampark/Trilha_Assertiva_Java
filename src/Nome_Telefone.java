import java.util.Scanner;
public class Nome_Telefone {

	public static void main(String[] args) {
		String name, vz;
		int i = 0;
		
		Scanner ler = new Scanner(System.in);
		
        System.out.println("Informe sua s�rie favorita: ");
        name = ler.next();
        
        System.out.println("Quantas vezes assistiu? ");
        vz = ler.next();
        
        System.out.println("Essa � sua s�rie favorita: "+name);
        System.out.println("Esse foi o n�mero de vezes que assistiu: "+vz);
        
        while (i < 5) {
        	System.out.println(name);
        	System.out.println(vz);
        	i++;
        	
        	ler.close();
        }
	}

}
