import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inicializando sistema do restaurante...");
		
		System.out.println("Insira o custo e o preco da pizza:");
		System.out.printf("Custo: ");
		Float custoP = entrada.nextFloat();
		System.out.printf("Preco: ");		
		Float precoP = entrada.nextFloat();
		System.out.printf("Tempo de preparo: ");		
		Integer tempoP = entrada.nextInt();
		
		System.out.println("Insira o custo e o preco do sanduiche:");
		System.out.printf("Custo: ");
		Float custoS = entrada.nextFloat();
		System.out.printf("Preco: ");		
		Float precoS = entrada.nextFloat();
		System.out.printf("Tempo de preparo: ");
		Integer tempoS = entrada.nextInt();
		entrada.nextLine();
		
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>(); 
		
		char novoPedido = 's';
		while (novoPedido == 's') {
			System.out.println("=== Novo Pedido ===");
			
			System.out.printf("CPF do cliente: \n");
			String cpf = entrada.nextLine();
			Pedido pedido = new Pedido(cpf);
			
			char novoPrato = 's';
			while (novoPrato == 's') {
				System.out.println("--- Novo Prato ---");
				System.out.printf("Pizza ou Sanduiche? (p/s)");
				char prt = entrada.next().charAt(0);
				entrada.nextLine();
				if (prt=='p') {
					System.out.printf("Molho: ");
					String m = entrada.nextLine();
					System.out.printf("Recheio: ");
					String r = entrada.nextLine();
					System.out.printf("Borda: ");
					String b = entrada.nextLine();
					try {
						pedido.adicionar_prato(new Pizza(custoP, precoP, tempoP, m, r, b));
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
				}
				if (prt=='s') {
					System.out.printf("Pao: ");
					String p = entrada.nextLine();
					System.out.printf("Carne: ");
					String c = entrada.nextLine();
					System.out.printf("Salada: ");
					String s = entrada.nextLine();
					try {
						pedido.adicionar_prato(new Sanduiche(custoS, precoS, tempoS, p, c, s));
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				System.out.println("Adicionar outro prato? (s/n)");
				novoPrato = entrada.next().charAt(0);
			}
			
			System.out.println(pedido.pratos.size());
			
			pedido.calcular_pratos();
			pedido.calcular_tx_serv();
			pedido.calcular_total();
			
			pedidos.add(pedido);
						
			System.out.println("Pedido gerado e adicionado:");
			System.out.println(pedidos.get(pedidos.size()-1).toString());
			
			System.out.printf("Adicionar outro pedido? (s/n)");
			novoPedido = entrada.next().charAt(0);
			
		}
		
		entrada.close();

	}

}
