package laboratorio;

public class Main {
	
	public void mostraArea(FiguraGeometrica f) {
		System.out.println("Area da figura: " + f.calculaArea());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		Circulo c = new Circulo(2);
		Triangulo t = new Triangulo(3,4);
		
		m.mostraArea(c);
		m.mostraArea(t);
	}

}
