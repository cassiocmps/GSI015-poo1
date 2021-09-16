
public class Triangulo {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public void setLado1(double lado1) {
		if(lado1<0) {
			this.lado1 = 0;
		}else {
			this.lado1 = lado1;
		}
	}
	public void setLado2(double lado2) {
		if(lado2<0) {
			this.lado2 = 0;
		}else {
			this.lado2 = lado2;
		}
	}
	public void setLado3(double lado3) {
		if(lado3<0) {
			this.lado3 = 0;
		}else {
			this.lado3 = lado3;
		}
	}
	public double getLado1() {
		return lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public double getLado3() {
		return lado3;
	}
	
	public String perimetro() {
		if (lado1==0 || lado2==0 || lado3==0) {
			return "nao eh triangulo";
		}
		Double resultado = this.lado1+this.lado2+this.lado3;
		return String.format("%.2f", resultado);
	}
	
	public String tipoTriang() {
		if (lado1==0 || lado2==0 || lado3==0) {
			return "nao eh triangulo";
		} else if (lado1==lado2 && lado2==lado3) {
			return "equilatero";
		} else if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
			return "escaleno";
		}
		return "isoceles";
		
	}
	
}
