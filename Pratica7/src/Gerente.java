
public class Gerente extends Funcionario implements Imprimivel{

	public Gerente(String n, String m, Double sb) {
		super(n, m, sb);
	}


	@Override
	public String mostrarDados() {
		return "Gerente "+super.mostrarDados();
	}


	@Override
	public Double calculasalario() {
		return 2*salarioBase;
	}

}
