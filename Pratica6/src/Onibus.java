
public class Onibus extends Veiculo{
	private Integer assentos;
	
	public Onibus(String placa, Integer ano, Integer assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

	public Integer getAssentos() {
		return assentos;
	}

	public void setAssentos(Integer assentos) {
		this.assentos = assentos;
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Assentos: " + this.assentos.toString());
	}
}
