import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Poupanca[] poupanca = new Poupanca[2];
		Especial[] especial = new Especial[2];
		
		String cpf = new String();
		String nro = new String();
		Float lim = Float.valueOf(0f);
		Float rend = Float.valueOf(0f);
		
		System.out.println("\nCadastrando 5 contas poupanca: ");
		for (int i=0; i<2; i++) {
			System.out.println("--- Conta Poupanca #" + (i+1) + " ---");
			System.out.printf("CPF: ");
			cpf = entrada.nextLine();
			System.out.printf("Numero: ");
			nro = entrada.nextLine();
			System.out.printf("Rendimento: ");
			rend = entrada.nextFloat();
			entrada.nextLine();
			poupanca[i] = new Poupanca(cpf, nro);
		}
		
		System.out.println("\nCadastrando 5 contas especiais: ");
		for (int i=0; i<2; i++) {
			System.out.println("--- Conta Especial #" + (i+1) + " ---");
			entrada.nextLine();
			System.out.printf("CPF: ");
			cpf = entrada.nextLine();
			System.out.printf("Numero: ");
			nro = entrada.nextLine();
			System.out.printf("Limite: ");
			lim = entrada.nextFloat();
			entrada.nextLine();
			especial[i] = new Especial(cpf, nro, lim);
		}
		
		entrada.close();
		
		System.out.println("Mostrando as contas poupanca:");
		for (int i=0; i<2; i++) {
			System.out.printf("Conta poup. #%d:\n", i+1);
			System.out.println(poupanca[i].getConta());
		}
		
		System.out.println("Mostrando as contas especiais:");
		for (int i=0; i<2; i++) {
			System.out.printf("Conta esp. #%d:\n", i+1);
			System.out.println(especial[i].getConta());
		}
		
	}

}
