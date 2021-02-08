
public class Quadrado {

	private int lado;
	
	public int getLado() {
		return lado;
	}
	
	public void setLado (int _lado) {
		this.lado = _lado;
	}
	
	public int getArea() {
		int area = 0;
		area = lado * lado;
		
		return area;
	}
	
	public int getPerimetro() {
		int perimetro = 0;
		perimetro = lado * 4;
		
		return perimetro;
	}
	
	public String getFigura() {
		return "quadrado";
	}
}
