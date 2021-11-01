import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{
	protected LocalDate admissao;
	protected String usuario, senha, carteiraTrab;
	private static Integer consultasParaGrat;
	private static Integer consultasMes;

	public Funcionario(String cpf) {
		super(cpf);
		this.admissao = LocalDate.now();
	}

	public Funcionario() {}

	public boolean setUsuario(String usuario) {
		if (usuario.length() > 0) {
			this.usuario = usuario;
			return true;
		} else {
			return false;
		}
	}

	public boolean setSenha(String senha) {
		if (senha.length() > 0) {
			this.senha = senha;
			return true;
		} else {
			return false;
		}
	}

	public boolean setCarteiraTrab(String carteiraTrab) {
		if (carteiraTrab.length() > 0) {
			this.carteiraTrab = carteiraTrab;
			return true;
		} else {
			return false;
		}
	}

	public abstract void calcularSalario();

	public String getCarteiraTrab() {
		return carteiraTrab;
	}

	public LocalDate getAdmissao() {
		return admissao;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "Funcionario [admissao=" + admissao + ", carteiraTrab=" + carteiraTrab + ", usuario=" + usuario + ", " + super.toString() + "]";
	}

	public static void zerarConsultasMes() {
		consultasMes = 0;
	}
	
	public static void addConsultasMes() {
		consultasMes++;
	}
	
	public static void setConsultasParaGrat(Integer consultasParaGrat) {
		Funcionario.consultasParaGrat = consultasParaGrat;
	}
	
	public static Integer getConsultasParaGrat() {
		return consultasParaGrat;
	}

	public static Integer getConsultasMes() {
		return consultasMes;
	}	
	
}
