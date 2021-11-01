import java.io.Serializable;
import java.util.ArrayList;

public class DadosExames implements Serializable{
	private ArrayList<Exame> listExames = new ArrayList<Exame>();
	
	public void cadastrar(Exame e) {
		this.listExames.add(e);
		System.out.println("Total de exames: ");
		System.out.println(this.listExames.size());
	}
	
	public void listar(){
		for (Exame objeto: this.listExames) {
			objeto.toString();
		}
	}

	public Exame buscar(String nome) {
		Exame e = null;
		for ( Exame objeto: this.listExames) {
				if (objeto.getNome().equals(nome)) {
					e = objeto;
					break;
				}
		}
		return e;
	}
	
	public boolean excluir(String nome){
		Exame e = this.buscar(nome);
		if (e != null) {
			this.listExames.remove(e);
			return true;
		} else {
			return false;
		}
		}
}
