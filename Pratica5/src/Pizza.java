
public class Pizza extends Prato{
	private String molho, recheio, borda;

	public Pizza (Float custo, Float preco, Integer t_preparo, String molho, String recheio, String borda) throws Exception {
		super(custo, preco, t_preparo);
		this.molho = molho;
		this.recheio = recheio;
		this.borda = borda;
	}
	
	@Override
	public String toString() {
		return "Pizza [molho:" + molho + ", recheio:" + recheio + ", borda:" + borda + ", custo:" + custo + ", preco:"
				+ preco + ", t_preparo:" + t_preparo + "min]";
	}
	
}
