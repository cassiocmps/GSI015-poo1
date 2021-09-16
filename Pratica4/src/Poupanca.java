
public class Poupanca extends Conta {
	private Float rendimento;
	
	public int calcularNovoSaldo () {
		if (rendimento > 0) {
			this.saldo = saldo*rendimento + saldo;
			return 0;
		}
		else return -1;
	}
	
	public Poupanca (String cpf, String nro, Float rendimento) {
		this.cpf = cpf;
		this.nro = nro;
		this.rendimento = rendimento;
		this.saldo = 0f;
	}
}

