import java.util.ArrayList;

public class Empregado {
	private String data;
	private String meds, sintomas, receita;
	private Medico medico;
	private Paciente paciente;
	private Colaborador colaborador;
	private ArrayList<Exame> exames;
	
	public Empregado(Medico medico, Paciente paciente) {
		this.medico = medico;
		this.paciente = paciente;
	}

	public boolean setData(String data) {
		if (data.length() > 0) {
			this.data = data;
			return true;
		} else {
			return false;
		}
	}

	public void setMeds(String meds) {
		this.meds = meds;
	}

	public boolean setSintomas(String sintomas) {
		if (sintomas.length() > 0) {
			this.sintomas = sintomas;
			return true;
		} else {
			return false;
		}
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}
	
	public void setExames(ArrayList<Exame> exames) {
		this.exames = exames;
	}

	public void addExame(Exame exame) {
		if (this.exames == null) {
			this.exames = new ArrayList<Exame>();
		}
		this.exames.add(exame);
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public String getData() {
		return data;
	}

	public String getMeds() {
		return meds;
	}

	public String getSintomas() {
		return sintomas;
	}

	public String getReceita() {
		return receita;
	}

	public Medico getMedico() {
		return medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public ArrayList<Exame> getExames() {
		return exames;
	}
	
	private String examesToString() {
		StringBuilder singleString = new StringBuilder();
		if (exames == null) {
			singleString = singleString.append("nenhum");
			return singleString.toString() ;
		}
		singleString = singleString.append("{");
		for (Exame ex: exames) {
			singleString = singleString.append(ex.getNome());
			singleString = singleString.append(";");
		}
		singleString = singleString.append("}");
		return singleString.toString();
	}

	@Override
	public String toString() {
		return "Consulta [data=" + data + ", meds=" + meds + ", sintomas=" + sintomas + ", receita=" + receita
				+ ", medico=" + medico + ", paciente=" + paciente + ", colaborador=" + colaborador + ", exames="
				+ examesToString() + "]";
	}
	
	public void realizarConsulta(String meds, String sintomas, String receita, ArrayList<Exame> exames) {
		
		Funcionario.addConsultasMes();
		
		paciente.setUltimaConsulta(this.data);
		
		Double preco = medico.getPrecoConsulta();;
		if (paciente instanceof Particular) {
			if (((Particular) paciente).getDescontoEsp() > 0) {
				preco = (preco*(100-((Particular)paciente).getDescontoEsp()))/100.0;
				medico.addSomaConsultasMes(preco);
			} else {
				medico.addSomaConsultasMes(preco);
			}
		}
		if (paciente instanceof Conveniado) {
			medico.addSomaConsultasMes(preco);
		}
		
		this.setMeds(meds);
		this.setSintomas(sintomas);
		this.setReceita(receita);
		this.setExames(exames);
	}
}
