import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> cadastro = new ArrayList<Veiculo>();
		
		cadastro.add(new Veiculo("1234", 2002));
		cadastro.add(new Caminhao("0987", 2012, 2));
		cadastro.add(new Onibus("0987", 2007, 40));
		
		for (Veiculo v: cadastro) {
			v.exibirDados();
		}

	}

}
