
public class Conta {
	
	protected String cpf;
	protected String nro;
	protected Float saldo;
	
	public int saque (Float valor) {
		if (valor <= this.saldo) {
			saldo = saldo - valor;
			return 0;
		}
		else return -1;		
	}
	
	public int deposito (Float valor) {
		saldo = saldo + valor;
		return 0;
	}
	
	public String getConta() {
		return String.format("CPF: %s", this.cpf)+" | "+String.format("Nro Conta: %s", this.nro)+" | "+String.format("Saldo: %s\n", this.saldo);
	}
	
}
