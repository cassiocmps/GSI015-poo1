import java.util.ArrayList;

public class Medico extends Funcionario{
	private String crm;
	private ArrayList<Plano> planos;
	private ArrayList<Especialidade> especialidades;
	private Double salario, somaConsultasMes, precoConsulta;
	
	public Medico(String cpf, ArrayList<Plano> planos) {
		super(cpf);
		this.planos = planos;
	}

	public Medico() {}
	
	@Override
	public String toString() {
		System.out.println("medico");
		return "Medico [crm=" + crm + ", especialidades=" + espToString()+", planos=" + planosToString() + ", salario=" + salario + ", " + super.toString()
				+ "]";
	}

	private String planosToString() {
		StringBuilder singleString = new StringBuilder();
		if (planos == null) {
			singleString = singleString.append("nenhum");
			return singleString.toString() ;
		}
		singleString = singleString.append("{");
		for (Plano plano: planos) {
			singleString = singleString.append(plano.getNome());
			singleString = singleString.append(";");
		}
		singleString = singleString.append("}");
		return singleString.toString();
	}
	
	private String espToString() {
		StringBuilder singleString = new StringBuilder();
		if (especialidades == null) {
			singleString = singleString.append("nenhuma");
			return singleString.toString() ;
		}
		singleString = singleString.append("{");
		for (Especialidade esp: especialidades) {
			singleString = singleString.append(esp.getNome());
			singleString = singleString.append(";");
		}
		singleString = singleString.append("}");
		return singleString.toString();
	}

	public boolean setCrm(String crm) {
		if (crm.length() > 0) {
			this.crm = crm;
			return true;
		} else {
			return false; 
		}
	}

	public void addPlano(Plano plano) {
		this.planos.add(plano);
	}

	public void addEspecialidade(Especialidade especialidade) {
		if (this.especialidades == null) {
			this.especialidades = new ArrayList<Especialidade>();
		}
		this.especialidades.add(especialidade);
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCrm() {
		return crm;
	}

	public ArrayList<Plano> getPlanos() {
		return planos;
	}

	public ArrayList<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public Double getSalario() {
		return salario;
	}

	@Override
	public void calcularSalario() {
		salario += somaConsultasMes;
		somaConsultasMes = 0.0;
	}
	
	public void addSomaConsultasMes(Double x) {
		somaConsultasMes += x;
	}
	
	public void zerarSomaConsutlasMes() {
		salario += somaConsultasMes;
		somaConsultasMes = 0.0;
	}

	public Double getPrecoConsulta() {
		return precoConsulta;
	}

	public void setPrecoConsulta(Double precoConsulta) {
		this.precoConsulta = precoConsulta;
	}
	
	
	
	
	
}
