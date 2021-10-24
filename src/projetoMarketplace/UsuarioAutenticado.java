package projetoMarketplace;
//classe UsuaioAutenticado que extende Usuario.
public class UsuarioAutenticado extends Usuario {

	public UsuarioAutenticado() {
		
	}

	public UsuarioAutenticado(String nome, String sobrenome, String cidade, String cPF, String email, String senha) {
		super(nome, sobrenome, cidade, cPF, email, senha);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("%s%n",super.toString());
	}
	
}
