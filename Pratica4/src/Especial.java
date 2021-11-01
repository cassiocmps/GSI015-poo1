
public class Especial extends Conta{

	private Float limite;
	
	public int saque (Float valor) {
		if (valor <= saldo + limite) {
			saldo = saldo - valor;
			return 0;
		}
		else return -1;		
	}
	
	public Especial(String cpf, String nro, Float limite) {
		super(cpf, nro);
		this.limite = limite;
		// TODO Auto-generated constructor stub
	}
//	public Especial (String cpf, String nro, Float limite) {
//		this.cpf = cpf;
//		this.nro = nro;
//		this.limite = limite;
//		this.saldo = 0f;
//	}
}
