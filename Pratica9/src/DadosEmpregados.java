import java.io.*;
import java.util.ArrayList;

public class DadosEmpregados implements Serializable {
	private ArrayList<Empregado> list;
	
	public void cadastrar(Empregado emp) {
		if (list == null) {
			this.list = new ArrayList<Empregado>();
		}
		this.list.add(emp);
	}
	
	public String listar(){
		StringBuilder singleString = new StringBuilder();
		for (Empregado emp: this.list) {
			singleString = singleString.append(emp.toString());
			singleString.append(System.getProperty("line.separator"));
		}
		return singleString.toString();
	}

	public Empregado buscar(String cpf) {
		Empregado emp = null;
		for (Empregado objeto: this.list) {
				if (objeto.getCpf().equals(cpf)) {
					emp = objeto;
					break;
				}
		}
		return emp;
	}
	
	public boolean excluir(String cpf){
		Empregado emp = this.buscar(cpf);
		if (emp != null) {
			this.list.remove(emp);
			return true;
		} else {
			return false;
		}
	}
	
	public ArrayList<Empregado> buscarSalariosMaiores(Double salario) {
		ArrayList<Empregado> maioresSalarios = new ArrayList<Empregado>();
		for (Empregado emp: this.list) {
			if (emp.getSalario() > salario) {
					maioresSalarios.add(emp);
				}
		}
		return maioresSalarios;
	}
	
	public void gravarBinario() {
		FileOutputStream escritorArquivo = null;
		ObjectOutputStream escritorObj = null;
		try {
			escritorArquivo = new FileOutputStream("empregados");
			escritorObj = new ObjectOutputStream(escritorArquivo);
			escritorObj.writeObject(this.list);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (escritorArquivo != null) escritorArquivo.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void gravarTexto() {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("empregados.txt"), "utf-8"))) {
	   writer.write(this.listar());
	} catch(IOException e){
			e.printStackTrace();
		}
	}
}
