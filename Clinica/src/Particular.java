
public class Particular extends Paciente{
	private Double descontoEsp, valorUltConsulta;

	public Particular(String cpf) {
		super(cpf);
		descontoEsp = 0.0;
	}
	
	public void setDescontoEsp(Double descontoEsp) {
		this.descontoEsp = descontoEsp;
	}
	
	public void setValorUltConsulta(Double valorUltConsulta) {
		this.valorUltConsulta = valorUltConsulta;
	}
	
	public Double getDescontoEsp() {
		return descontoEsp;
	}

	public Double getValorUltConsulta() {
		return valorUltConsulta;
	}

	@Override
	public String toString() {
		return "Particular [descontoEsp=" + descontoEsp + ", valorUltConsulta=" + valorUltConsulta + ", toString()="
				+ super.toString() + "]";
	}
	
}
