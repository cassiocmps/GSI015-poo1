import java.io.Serializable;
import java.util.ArrayList;

public class DadosConsultas implements Serializable{
	private ArrayList<Empregado> listConsulta = new ArrayList<Empregado>();
	
	public void cadastrar(Empregado c) {
		this.listConsulta.add(c);
		System.out.println("Total de consultas marcadas: ");
		System.out.println(this.listConsulta.size());
	}
	
	public void listar(){
		for (Empregado objeto: this.listConsulta) {
			objeto.toString();
		}
	}

	public Empregado buscar(String cpf) {
		Empregado c = null;
		for ( Empregado objeto: this.listConsulta) {
				if (objeto.getPaciente().getCpf().equals(cpf)) {
					c = objeto;
					break;
				}
		}
		return c;
	}
	
	public boolean excluir(String cpf){
		Empregado c = this.buscar(cpf);
		if (c != null) {
			this.listConsulta.remove(c);
			return true;
		} else {
			return false;
		}
	}
}
