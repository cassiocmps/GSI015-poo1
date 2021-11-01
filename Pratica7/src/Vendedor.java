import java.io.FileNotFoundException;

public class Vendedor extends Funcionario implements Imprimivel{
	
	private Double comissao;
	
	public Vendedor(String n, String m, Double sb, Double c) {
		super(n, m, sb);
		this.comissao = c;
	}

	@Override
	public String mostrarDados() {
		return "Vendedor [comissao=" + this.comissao.toString() +super.mostrarDados();
	}

	@Override
	public Double calculasalario() {
		return salarioBase+comissao;
	}
	
}
