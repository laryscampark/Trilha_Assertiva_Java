import java.util.Scanner;

public class CriarCarro implements Motor, Veiculo{
	
	public String Modelo;
	public String Fabricante;
	public String Nome;
	public String Ld;
	
	Scanner ler = new Scanner(System.in);
	
	@Override
	public String getModelo() {
		return Modelo;
	}

	@Override
	public String getFabricante() {
		return Fabricante;
	}

	@Override
	public String getNome() {	
		return Nome;
	}

	@Override
	public String getLd() {
		return Ld;
		
	}
	
	

}



