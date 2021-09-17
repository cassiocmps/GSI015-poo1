
public class Caminhao extends Veiculo{
	private Integer eixos;
	
	public Caminhao (String placa, Integer ano, Integer eixos){
		super(placa, ano);
		this.eixos = eixos;
	}

	public Integer getEixos() {
		return eixos;
	}

	public void setEixos(Integer eixos) {
		this.eixos = eixos;
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Eixos: " + this.eixos.toString());
	}	
	
}
