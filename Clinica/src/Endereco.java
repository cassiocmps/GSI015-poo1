
public class Endereco {
	private String rua, num, complemento, bairro, cidade, uf, cep;
	
//	public Endereco(String rua, String num, String bairro, String cidade, String uf,  String cep) {
//		setRua(rua);
//		setNum(num);
//		setBairro(bairro);
//		setCidade(cidade);
//		setUf(uf);
//		setCep(cep);
//	}

	
	public boolean setRua(String rua) {
		if (rua.length() > 0) {
			this.rua = rua;
			return true;
		}
		else {
			return false;
		}
	}

	public boolean setNum(String num) {
		if (num.length() > 0) {
			this.num = num;
			return true;
		}
		else {
			return false;
		}
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public boolean setBairro(String bairro) {
		if (bairro.length() > 0) {
			this.bairro = bairro;
			return true;
		}
		else {
			return false;
		}
	}


	public boolean setCidade(String cidade) {
		if (cidade.length() > 0) {
			this.cidade = cidade;
			return true;
		}
		else {
			return false;
		}
	}


	public boolean setUf(String uf) {
		if (uf.length() == 2) {
			this.uf = uf;
			return true;
		}
		else {
			return false;
		}
	}


	public boolean setCep(String cep) {
		if (cep.length() > 0) {
			this.cep = cep;
			return true;
		}
		else {
			return false;
		}	
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + ", num=" + num + ", cep=" + cep + "]";
	}
	
	
	
}
