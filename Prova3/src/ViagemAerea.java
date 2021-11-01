
public class ViagemAerea extends Viagem{
	
	Integer nroVoo;
	String companhia;
	
	public ViagemAerea(Cliente cliente, String origem, String destino, String dataPartida, String motivo,
			Integer duracao, Integer nroVoo, String companhia) {
		super(cliente, origem, destino, dataPartida, motivo, duracao);
		this.nroVoo = nroVoo;
		this.companhia = companhia;
	}

	@Override
	public String retornaDados() {
		return super.retornaDados() + "Aerea: [nroVoo=" + nroVoo + ", companhia=" + companhia + "]";
	}
}
