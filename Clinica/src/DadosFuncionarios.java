import java.io.Serializable;
import java.util.ArrayList;

public class DadosFuncionarios implements Serializable{
	private ArrayList<Funcionario> listFuncionario = new ArrayList<Funcionario>();
	
	public void cadastrar(Funcionario f) {
		this.listFuncionario.add(f);
		System.out.println("Total de funcionarios: ");
		System.out.println(this.listFuncionario.size());
	}
	
	public void listar(){
		for (Funcionario objeto: this.listFuncionario) {
			objeto.toString();
		}
	}

	public Funcionario buscar(String cpf) {
		Funcionario f = null;
		for ( Funcionario objeto: this.listFuncionario) {
				if (objeto.getCpf().equals(cpf)) {
					f = objeto;
					break;
				}
		}
		return f;
	}
	
	public boolean excluir(String cpf){
		Funcionario f = this.buscar(cpf);
		if (f != null) {
			this.listFuncionario.remove(f);
			return true;
		} else {
			return false;
		}
		}
}
