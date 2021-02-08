import java.util.Scanner;
public class TestCarro {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Carro c = new Carro ();
		
		System.out.println("Informa a cor do seu carro: ");
		c.cor = ler.next();
		
		System.out.println("Informe o modelo do carro: ");
		c.modelo = ler.next();
		
		c.liga();
		
		System.out.println("O quanto quer acelar o carro: ");
		c.acelera(ler.nextDouble());
		
		System.out.println("A cor do carro é "+c.cor+", com o modelo "+c.modelo+", sua a velocidade de km "
		+c.velocidadeAtual+" está na marcha de : "+c.pegaMarcha());
		
		
		ler.close();
	}

}
