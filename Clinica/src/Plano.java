
public class Plano {
	private String nome, cnpj;
	private Endereco end;
	
	public Plano(String nome) {
		setNome(nome);
	}
	
	public boolean setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
			return true;
		}
		else {
			return false;
		}
	}

	public boolean setCnpj(String cnpj) {
		if (cnpj.length() > 0) {
			this.cnpj = cnpj;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setEndereco(Endereco end) {
		this.end = end;
	}
	
	
	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Endereco getEnd() {
		return end;
	}

	@Override
	public String toString() {
		return "Plano [nome=" + nome + ", cnpj=" + cnpj + ", endereco=" + end.toString() + "]";
	}
}
