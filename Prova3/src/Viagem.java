
public class Viagem {
	protected Cliente cliente;
	protected String origem, destino, dataPartida, motivo;
	protected Integer duracao;
	
	public Viagem(Cliente cliente, String origem, String destino, String dataPartida, String motivo, Integer duracao) {
		this.cliente = cliente;
		this.origem = origem;
		this.destino = destino;
		this.dataPartida = dataPartida;
		this.motivo = motivo;
		this.duracao = duracao;
		cliente.setUltimoDestino(this);
		cliente.addViagem(this);
	}

	public String retornaDados() {
		return "Viagem [cliente=" + cliente.getNome() + ", origem=" + origem + ", destino=" + destino + ", dataPartida="
				+ dataPartida + ", motivo=" + motivo + ", duracao=" + duracao + "]";
	}
}
