import java.io.Serializable;
import java.util.ArrayList;

public class DadosPacientes implements Serializable{
	private ArrayList<Paciente> listPaciente = new ArrayList<Paciente>();
	
	public void cadastrar(Paciente c) {
		this.listPaciente.add(c); //ADICIONA O PACIENTE NO ARRAY
		System.out.println("Total de pacientes: ");
		System.out.println(this.listPaciente.size());
	}
	
	public void listar(){
		for (Paciente objeto: this.listPaciente) {
			objeto.toString();
			//método mostrarDados();
		}
	}
	//este método retorna o objeto Paciente caso encontrado, ou null,caso não encontrado
	public Paciente buscar(String cpf) {//pode-se usar também int
		Paciente c = null;
		for ( Paciente objeto: this.listPaciente) {
				if (objeto.getCpf().equals(cpf)) {
					c = objeto;
					break;
				}
		}
		return c;
	}
	
	//este método usa o método buscar já implementado
	public boolean excluir(String cpf){
		Paciente c = this.buscar(cpf);
		if (c != null) {
			this.listPaciente.remove(c);
			return true;
		} else {
			return false;
		}
		}
}
