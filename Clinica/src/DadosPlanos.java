import java.io.Serializable;
import java.util.ArrayList;

public class DadosPlanos implements Serializable{
	private ArrayList<Plano> listPlanos = new ArrayList<Plano>();
	
	public void cadastrar(Plano p) {
		this.listPlanos.add(p);
		System.out.println("Total de planos: ");
		System.out.println(this.listPlanos.size());
	}
	
	public void listar(){
		for (Plano objeto: this.listPlanos) {
			objeto.toString();
		}
	}

	public Plano buscar(String cnpj) {
		Plano p = null;
		for ( Plano objeto: this.listPlanos) {
				if (objeto.getCnpj().equals(cnpj)) {
					p = objeto;
					break;
				}
		}
		return p;
	}
	
	public boolean excluir(String cnpj){
		Plano p = this.buscar(cnpj);
		if (p != null) {
			this.listPlanos.remove(p);
			return true;
		} else {
			return false;
		}
		}
}
