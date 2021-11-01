import java.util.ArrayList;

public class Cliente {
	private String nome;
	private Integer cpf;
	private Integer rg;
	private ArrayList<Viagem> viagens = new ArrayList<Viagem>();
	private Viagem ultimoDestino;
	
	public Cliente(String nome, Integer cpf, Integer rpg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.ultimoDestino = null;
	}
	public String getNome() {
		return nome;
	}

	public Viagem getUltimoDestino() {
		return ultimoDestino;
	}
	
	public void setUltimoDestino(Viagem ultimoDestino) {
		this.ultimoDestino = ultimoDestino;
	}
	
	public void addViagem(Viagem viagem) {
		 viagens.add(viagem);
	}
	
	
}
