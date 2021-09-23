
public class Assistente extends Funcionario implements Imprimivel{

	public Assistente(String n, String m, Double sb) {
		super(n, m, sb);
	}

	@Override
	public String mostrarDados() {
		return "Assistente "+super.mostrarDados();
	}
	
	@Override
	public Double calculasalario() {
		return this.salarioBase;
	}

}
