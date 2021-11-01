
public class ViagemMaritima extends Viagem{
	String capitao;
	String nomeNavio;
	
	public ViagemMaritima(Cliente cliente, String origem, String destino, String dataPartida, String motivo,
			Integer duracao, String capitao, String navio) {
		super(cliente, origem, destino, dataPartida, motivo, duracao);
		this.capitao = capitao;
		this.nomeNavio = navio;
	}

	@Override
	public String retornaDados() {
		return super.retornaDados() + "Maritima: [capitao=" + capitao + ", navio=" + nomeNavio + "]";
	}
}
