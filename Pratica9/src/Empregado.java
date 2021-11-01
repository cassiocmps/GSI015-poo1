
public class Empregado implements Comparable<Empregado> {
	private String cpf;
	private Integer anoNasc;
	private Double salario;
	
	
	public Empregado(String cpf, Integer anoNasc, Double salario) {
		this.cpf = cpf;
		this.anoNasc = anoNasc;
		this.salario = salario;
	}
	public Empregado() {}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(Integer anoNasc) {
		this.anoNasc = anoNasc;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empregado [cpf=" + cpf + ", anoNasc=" + anoNasc + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Empregado emp) {
		if (this.getAnoNasc() < emp.getAnoNasc()) {
			return -1;
		} else 
			if (this.getAnoNasc() > emp.getAnoNasc()) {
				return 1;
			} else {
				return 0;
			}
	}
	
	
}
