
public class Colaborador extends Funcionario{
	private String cargo;
	private Double salarioBase, salario;
	protected static Double gratificacao;

	
	public Colaborador(String cpf, String cargo) {
		super(cpf);
		this.cargo = cargo;
	}

	public boolean setCargo(String cargo) {
		if (cargo.length() > 0) {
			this.cargo = cargo;
			return true;
		} else {
			return false;
		}
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getCargo() {
		return cargo;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public static Double getGratificacao() {
		return gratificacao;
	}

	@Override
	public String toString() {
		return "Colaborador [cargo=" + cargo + ", salarioBase=" + salarioBase
				+ ", " + super.toString() + "]";
	}

	@Override
	public void calcularSalario() {
		if (getConsultasMes() >= getConsultasParaGrat()) {
			salario = salarioBase + gratificacao;
		} else {
			salario = salarioBase;
		}
	}

	public Double getSalario() {
		return salario;
	}
	
}
