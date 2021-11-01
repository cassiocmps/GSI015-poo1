
public class Conveniado extends Paciente{
	private Plano plano;
	private String carteirinha, dataIngresso;
	private Boolean carencia;
	
	public Conveniado(String cpf, Plano plano) {
		super(cpf);
		this.plano = plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	
	public boolean setCarteirinha(String carteirinha) {
		if (carteirinha.length() > 0) {
			this.carteirinha = carteirinha;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean setDataIngresso(String dataIngresso) {
		if (dataIngresso.length() > 0) {
			this.dataIngresso = dataIngresso;
			return true;
		} else {
			return false;
		}
	}
	
	public void setCarencia(String carencia) {
		if (carencia == "sim") {
			this.carencia = true; 
		} else if (carencia == "nao") {
			this.carencia = false;
		}
	}
	
	public Plano getPlano() {
		return plano;
	}

	public String getCarteirinha() {
		return carteirinha;
	}

	public String getDataIngresso() {
		return dataIngresso;
	}

	public String getCarencia() {
		if (this.carencia == false) {
			return "nao";
		}
		else if (this.carencia == true) {
			return "sim";
		}
		else {
			return "carencia nao setada";
		}
	}

	@Override
	public String toString() {
		return "Conveniado [plano=" + plano + ", carteirinha=" + carteirinha + ", dataIngresso=" + dataIngresso
				+ ", carencia=" + carencia + ", toString()=" + super.toString() + "]";
	}

}
