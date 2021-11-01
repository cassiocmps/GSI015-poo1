import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cadastrando 5 empregados:");
		String cpf;
		Integer anoNasc;
		Double salario;
		DadosEmpregados dados = new DadosEmpregados();
		
		for (Integer i=0; i<5; i++) {
			System.out.println("Empregado #"+ (i+1) +":");
			System.out.printf("CPF: ");
			cpf = entrada.nextLine();
//			cpf = i.toString();
			System.out.printf("Ano de nascimento: ");		
			anoNasc = entrada.nextInt();
//			anoNasc = i;
			System.out.printf("Salario :");		
			salario = entrada.nextDouble();
//			salario = (double) i;
			entrada.nextLine();
			dados.cadastrar(new Empregado(cpf, anoNasc, salario));
//			System.out.println(dados.listar());
		}
		
		cpf = null;
		System.out.println("Digite o CPF do empregado que deseja procurar: ");
		cpf = entrada.nextLine();
//		cpf = "3";
		dados.buscar(cpf);
		System.out.println("O empregado encontrado foi:");
		System.out.println(dados.buscar(cpf).toString());
		
		salario = null;
		System.out.println("Digite qual o salario que deseja buscar:");
		salario = entrada.nextDouble();
//		salario = 1.0;
		System.out.println("Empregados com salarios maiores que "+salario+":");
		for (Empregado emp: dados.buscarSalariosMaiores(salario)) {
			System.out.println(emp.toString());
		}
		
		dados.gravarBinario();
		dados.gravarTexto();
		
		entrada.close();
	}

}
