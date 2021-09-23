import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Funcionario> cadastro = new ArrayList<Funcionario>();
		
		cadastro.add(new Assistente("cassio", "1111", 1000.0));
		cadastro.add(new Gerente("joao", "2222", 1000.0));
		cadastro.add(new Vendedor("gustavo", "3333", 1000.0, 200.0));
		
		Double folhaSal=0.0;
		
		for (Funcionario f: cadastro) {
			folhaSal += f.calculasalario();
		}
		
		System.out.println("Folha salarial da empresa: "+folhaSal.toString());
		
		for (Funcionario f: cadastro) {
			System.out.println(f.mostrarDados());
		}
	}

}
