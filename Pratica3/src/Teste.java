import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("insira a hora: ");
		int hora = entrada.nextInt();
		System.out.println("insira o minuto: ");
		int minuto = entrada.nextInt();
		System.out.println("insira o segundo: ");
		int segundo = entrada.nextInt();
		entrada.close();
		
		Tempo tempo1 = new Tempo(hora, minuto, segundo);
		
		System.out.println("Metodo getTempo(): "+tempo1.getTempo());
		tempo1.incrementaMinuto();
		System.out.println("Incrementando +1 minuto: "+tempo1.getTempo());
		tempo1.decrementaMinuto();
		System.out.println("Decrementando -1 minuto: "+tempo1.getTempo());
		

	}

}
