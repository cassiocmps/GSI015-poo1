
public class Veiculo {
	private String placa;
	private Integer ano;
	
	public Veiculo(){}
	
	public Veiculo (String placa, Integer ano) {
		this.placa = placa;
		this.ano = ano;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public void setAno(String ano) {
		this.ano = Integer.parseInt(ano);
	}

	public String getPlaca() {
		return placa;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public void exibirDados() {
		System.out.println(this.getClass().toString());
		System.out.println("Placa: " + this.placa.toString());
		System.out.println("Ano: " + this.ano.toString());
	}
	
}
