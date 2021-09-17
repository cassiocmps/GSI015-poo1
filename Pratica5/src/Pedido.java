import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
	private String cpf;
	private LocalDateTime data = LocalDateTime.now();
	private Float tx_serv=0f;
	private Float valor_pratos=0f;
	private Float total=0f;
	public ArrayList<Prato> pratos = new ArrayList<Prato>();
	
	public Pedido (String cpf) {
		this.cpf = cpf;
	}
	
	public void adicionar_prato(Prato prato) {
		this.pratos.add(prato);
	}

	public void calcular_pratos() {
		if (pratos.size()==0) {
			this.valor_pratos = 0f;
		}else {
			for (Prato prato: pratos) {
				this.valor_pratos+= prato.getPreco();
			}
		}		
	}
	
	public void calcular_tx_serv() {
		if (pratos.size()==0) {
			this.tx_serv = 0f;
		}
		else this.tx_serv = (float) (this.valor_pratos*0.1);  
			
	}
	
	public void calcular_total() {
		if (pratos.size()==0) {
			this.total = 0f;
		}
		else this.total = this.valor_pratos + this.tx_serv;  
			
	}
	@Override
	public String toString() {
		return "Pedido [cpf=" + cpf + ", data=" + data + ", tx_serv=" + tx_serv + ", valor_pratos=" + valor_pratos
				+ ", total=" + total + ", pratos=" + pratos + "]";
	}
	
	
}
