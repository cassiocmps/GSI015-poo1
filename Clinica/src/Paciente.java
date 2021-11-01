import java.time.LocalDate;

public abstract class Paciente extends Pessoa{
	protected String ultimaConsulta;
	protected LocalDate dataCadastro;
	
	public Paciente(String cpf) {
		super(cpf);
		this.dataCadastro = LocalDate.now();
	}

	public String getUltimaConsulta() {
		return ultimaConsulta;
	}

	public void setUltimaConsulta(String data) {
		this.ultimaConsulta = data;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	@Override
	public String toString() {
		return "Paciente [ultimaConsulta=" + ultimaConsulta + ", dataCadastro=" + dataCadastro + super.toString() + "]";
	}
	
	

}
