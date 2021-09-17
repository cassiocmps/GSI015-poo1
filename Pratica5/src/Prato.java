
public class Prato {
	protected Float custo, preco;
	protected Integer t_preparo;
	
	public Prato(Float custo, Float preco, Integer t_preparo) throws Exception {
		if (custo <=0 || preco<=0 || t_preparo<=0) {
			throw new Exception("Valores inseridos incorretamente");
		}
		this.custo = custo;
		this.preco = preco;
		this.t_preparo = t_preparo;
	}

	public Float getCusto() {
		return custo;
	}

	public Float getPreco() {
		return preco;
	}

	public Integer getT_preparo() {
		return t_preparo;
	}

	@Override
	public String toString() {
		return "Prato [custo:" + custo + ", preco:" + preco + ", tempo de preparo:" + t_preparo + "min]";
	}
	
}
