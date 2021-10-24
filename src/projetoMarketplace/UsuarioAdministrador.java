package projetoMarketplace;
//classe usuarioAdministrador que extende a classe usuario
public class UsuarioAdministrador extends UsuarioAutenticado {
	
	private int codigoDeAcessoRestrito;
	
	// construtor
	public UsuarioAdministrador(String nome, String sobrenome, String cidade, String cPF,
			String email, String senha, int codigoDeAcessoRestrito) {
		super(nome, sobrenome, cidade, cPF, email, senha);
		this.codigoDeAcessoRestrito=codigoDeAcessoRestrito;
	}

	public UsuarioAdministrador() {
		
	}

	public int getCodigoDeAcessoRestrito() {
		return codigoDeAcessoRestrito;
	}

	public void setCodigoDeAcessoRestrito(int codigoDeAcessoRestrito) {
		this.codigoDeAcessoRestrito = codigoDeAcessoRestrito;
	}
	// sobescreve o  toString da super classe
	@Override
	public String toString() {
		return String.format("%s%n",super.toString());
	}
	
	
}
