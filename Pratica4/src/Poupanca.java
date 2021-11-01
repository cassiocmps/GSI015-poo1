
public class Poupanca extends Conta {

	private Double rendimento;
	
	public int calcularNovoSaldo () {
		if (rendimento > 0) {
			this.saldo = saldo*rendimento + saldo;
			return 0;
		}
		else return -1;
	}
	public Poupanca(String cpf, String nro) {
		super(cpf, nro);
		// TODO Auto-generated constructor stub
	}
	
//	public Poupanca (String cpf, String nro, Double rendimento) {
//		this.cpf = cpf;
//		this.nro = nro;
//		this.rendimento = rendimento;
//		this.saldo = 0.0;
//	}
}

