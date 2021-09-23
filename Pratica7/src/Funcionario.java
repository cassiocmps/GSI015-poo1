
public abstract class Funcionario implements Imprimivel{
	protected String nome;
	protected String matricula;
	protected Double salarioBase;
	
	public Funcionario(String n, String m, Double sb) {
		this.nome = n;
		this.matricula = m;
		this.salarioBase = sb;
	}
	
	public String mostrarDados() {
		return "[nome=" + nome + ", matricula=" + matricula + ", salarioBase=" + salarioBase + "]";
	}
	
	public abstract Double calculasalario();
}
