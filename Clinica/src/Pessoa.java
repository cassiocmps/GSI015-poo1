import java.util.InputMismatchException;

public abstract class Pessoa {
	protected String nome, cpf, rg;
	protected Byte estCivil;
	protected Endereco end;
	
	public Pessoa(String cpf) {
		this.setCpf(cpf);
	}
	
	public Pessoa() {}
	
	public boolean setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean setCpf (String cpf) {
		if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
	        cpf.equals("22222222222") || cpf.equals("33333333333") ||
	        cpf.equals("44444444444") || cpf.equals("55555555555") ||
	        cpf.equals("66666666666") || cpf.equals("77777777777") ||
	        cpf.equals("88888888888") || cpf.equals("99999999999") ||
	        (cpf.length() != 11)) {
	            return(false);
		}
		char dig10, dig11;
	    int sm, i, r, num, peso;
	    
	    try {
	        sm = 0;
	        peso = 10;
	        for (i=0; i<9; i++) {
	        	num = (int)(cpf.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	        }

	        r = 11 - (sm % 11);
	        
	        if ((r == 10) || (r == 11)) {
	                dig10 = '0';
	        } else { 
	        	dig10 = (char)(r + 48);
	        }

            sm = 0;
            peso = 11;
            
            for(i=0; i<10; i++) {
	            num = (int)(cpf.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
            	dig11 = '0';
            } else {
            	dig11 = (char)(r + 48);
            }

            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
                this.cpf = cpf; 
            	return(true);
            } else {
            	return (false);
            }
                } catch (InputMismatchException erro) {
	                return(false);
	            }
		
	}
	
	public boolean setRg(String rg) {
		if (rg.length() > 0) {
			this.rg = rg;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean setEstCivil(String estCivil) {
		if (estCivil == "solteiro" || estCivil == "solteira") {
			this.estCivil = 0;
			return true;
		} else if (estCivil == "casado" || estCivil == "casada") {
			this.estCivil = 1;
			return true;
		} else if (estCivil == "divorciado" || estCivil == "divorciada") {
			this.estCivil = 2;
			return true;
		} else {
			return false;
		}
	}
	
	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getEstCivil() {
		if (estCivil == 0) {
			return "Solteiro(a)";
		} else if (estCivil == 1) {
			return "Casado(a)";
		} else 
			return "Divorciado(a)";
		
	}

	public String getEnd() {
		return end.toString();
	}

	@Override
	public String toString() {
		System.out.println("pessoa");
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", estCivil=" + getEstCivil() + ", end=" + end.toString() + "]";
	}	
}

