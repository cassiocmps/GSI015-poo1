
public class Teste {

	public static void main(String[] args) {
		
		Triangulo triangulo1 = new Triangulo();
		
		triangulo1.setLado1(2.2);
		triangulo1.setLado2(2.2);
		triangulo1.setLado3(2.2);
		
		System.out.println("Triangulo 1:");
		System.out.println(triangulo1.getLado1()+", "+triangulo1.getLado2()+", "+triangulo1.getLado3());
		System.out.println("Perimetro: "+triangulo1.perimetro());
		System.out.println("Tipo: "+triangulo1.tipoTriang());
		System.out.printf("\n");
		
		Triangulo triangulo2 = new Triangulo();
		
		triangulo2.setLado1(-3);
		triangulo2.setLado2(5);
		triangulo2.setLado3(7);
		
		System.out.println("Triangulo 1:");
		System.out.println(triangulo2.getLado1()+", "+triangulo2.getLado2()+", "+triangulo2.getLado3());
		System.out.println("Perimetro: "+triangulo2.perimetro());
		System.out.println("Tipo: "+triangulo2.tipoTriang());
		System.out.printf("\n");
		
		Triangulo triangulo3 = new Triangulo();
		
		triangulo3.setLado1(7);
		triangulo3.setLado2(5);
		triangulo3.setLado3(7);
		
		System.out.println("Triangulo 1:");
		System.out.println(triangulo3.getLado1()+", "+triangulo3.getLado2()+", "+triangulo3.getLado3());
		System.out.println("Perimetro: "+triangulo3.perimetro());
		System.out.println("Tipo: "+triangulo3.tipoTriang());
		System.out.printf("\n");
		
		Triangulo triangulo4 = new Triangulo();
		
		triangulo4.setLado1(3);
		triangulo4.setLado2(5);
		triangulo4.setLado3(7);
		
		System.out.println("Triangulo 1:");
		System.out.println(triangulo4.getLado1()+", "+triangulo4.getLado2()+", "+triangulo4.getLado3());
		System.out.println("Perimetro: "+triangulo4.perimetro());
		System.out.println("Tipo: "+triangulo4.tipoTriang());
		System.out.printf("\n");
		
	}

}
