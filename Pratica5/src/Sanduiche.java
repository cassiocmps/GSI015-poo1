
public class Sanduiche extends Prato {
	private String pao, carne, salada;

	public Sanduiche(Float custo, Float preco, Integer t_preparo, String pao, String carne, String salada) throws Exception {
		super(custo, preco, t_preparo);
		this.pao = pao;
		this.carne = carne;
		this.salada = salada;
	}

	@Override
	public String toString() {
		return "Sanduiche [pao:" + pao + ", carne:" + carne + ", salada:" + salada + ", custo:" + custo + ", preco:"
				+ preco + ", tempo de preparo:" + t_preparo + "min]";
	}

	

}
