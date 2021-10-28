package projetoMarketplace;

import java.util.Scanner;
//classe responasavél por gerenciar dados e ações que o usuário pode fazer no sistema.
public class MenuUsuario {

	Scanner input = new Scanner(System.in);
	//cria vavriaveis de instância
	private boolean usuarioCadastrado;
	private Usuario usuarioLogado;

	public boolean isUsuarioCadastrado() {
		return usuarioCadastrado;
	}
	public void setUsuarioCadastrado(boolean usuarioCadastrado) {
		this.usuarioCadastrado = usuarioCadastrado;
	}	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	// Método respoansavel por autenticar/logar um usuario.
	public void logar(Listas listas) {
		try {
			System.out.println("Digite seu email");
			String respostaEmail = input.nextLine();
			System.out.println("Digite sua senha");
			String respostaSenha = input.nextLine();
			usuarioCadastrado = false;
			for(int i=0; i<listas.getListaDeUsuarios().size() ; i++){
				if(respostaEmail.equals(listas.getListaDeUsuarios().get(i).getEmail()) && 
						respostaSenha.equals(listas.getListaDeUsuarios().get(i).getSenha())){
					usuarioCadastrado=true;
					usuarioLogado=listas.getListaDeUsuarios().get(i);
				}
			}
			if(usuarioCadastrado==false){
				System.out.println("Usuário e/ou senha inválidos\n");

			}
		}catch(Exception exception) {
			System.out.println("Resposta Inválida\n");
		}

	}
	// Método responsavél por cadastrar um usuario.
	public void cadastraUsuario(Listas listas) {
		try {
			System.out.println("Digite seu nome");
			String novoNome=input.nextLine();
			System.out.println("Digite seu sobrenome");
			String novoSobrenome=input.nextLine();
			System.out.println("Digite sua cidade");
			String novaCidade=input.nextLine();
			System.out.println("Digite seu cpf");
			String novoCpf=input.nextLine();
			System.out.println("Digite seu email");
			String novoEmail=input.nextLine();
			System.out.println("Digite sua senha");
			String novaSenha=input.nextLine();

			Usuario novoUsuario = new Usuario(novoNome,novoSobrenome,novaCidade,novoCpf,novoEmail,novaSenha);

			listas.getListaDeUsuarios().add(novoUsuario);
		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}
	}

	//Listar Anuncios DO Usuario 
	public void ExibirAnunciosDoUsuario(Listas listas){
		try {
			for(int i = 0; i<listas.getListaDeAnuncios().size(); i++) {//percorre a lista de anuncios
				Anuncio anuncio = listas.getListaDeAnuncios().get(i);
				if(this.usuarioLogado==anuncio.getAutor()) {
					System.out.println(anuncio.getTituloAnuncio()+" "+" "+anuncio.getCodigoAnuncio());
				} 
			}
		}catch(Exception exception) {
			System.out.println("Ocorreu um erro!");
		}
	}


	// Um simplis método para exibir algumas opçoes para usuario.
	public void menuUsuario(){
		System.out.println("0- Sair \n1- Logar \n2- Cadastre-se \n3- ListarAnuncios \n4- ListarFretes \n5- Exibir detalhes de Anuncio \n6- Exibir detalhes de Fretes");
	}

	public void gerenciarPerfilDeUsuario(Listas listas) {//O usuario pode ver suas compras, anuncios, e informções proprias
		try {
			System.out.println("Digite 1 para acessar suas informações\n"
					+"Digite 2 para acessar suas compras\n"
					+"Digite 3 para acessar seus anuncios\n");

			String textResposta = input.nextLine();
			int resp =Integer.valueOf(textResposta);
			switch(resp){
			case 1:
				//exibir detalhes do usuario
				exibirInformaçõesDoUsuario(listas);
				break;
			case 2:  
				//acessa compras
				this.listarCompras();
				this.exibirDetalhesDeCompra();
				break;

			case 3:
				//acessar anuncios
				exibirAnunciosDoUsuario(listas);
				break;
			}
		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}
	}
	// Método responsavel por exibir as informações do usuario.
	public void exibirInformaçõesDoUsuario(Listas listas) {
		try {
			System.out.println("Nome: "+ this.usuarioLogado.getNome()
			+"\nSobrenome: "+ this.usuarioLogado.getSobrenome()
			+"\nCidade: "+ this.usuarioLogado.getCidade()
			+"\nCpf: "+this.usuarioLogado.getcPF()
			+"\nEmail: "+this.usuarioLogado.getEmail());
		}catch(Exception exception) {
			System.out.println("Ocorreu um erro!");
		}
	}
	// Método responsável por exibir os anuncios de um determinado usuario.
	public void exibirAnunciosDoUsuario(Listas listas) {
		try {
			for(int i =0; i <listas.getListaDeAnuncios().size(); i++ ) {

				if(listas.getListaDeAnuncios().get(i).getAutor()==this.usuarioLogado) {//

					System.out.println(listas.getListaDeAnuncios().get(i).getTituloAnuncio()+" | Codigo: "
							+listas.getListaDeAnuncios().get(i).getCodigoAnuncio()+"\n");
				}
			}
		}catch(Exception exception) {
			System.out.println("Ocorreu um erro!");
		}
	}
	// Método resposnsavel por exibir detalhes de uma compra especifica.
		public void exibirDetalhesDeCompra() {
			try {
				System.out.println("Digite o codigo da compra");
				String textoResposta = input.nextLine();
				int codigoDigitado = Integer.valueOf(textoResposta);
				for(int i=0; i<this.usuarioLogado.getListaDeCompras2().size();i++) {
					if(codigoDigitado== this.usuarioLogado.getListaDeCompras2().get(i).getAnuncio().getCodigoAnuncio()) {// procura o codigo digitado na lista de anuncios
						System.out.println(this.usuarioLogado.getListaDeCompras2().get(i).getAnuncio().toString());	
						System.out.println("Empresa Frete: "+this.usuarioLogado.getListaDeCompras2().get(i).getFrete().getEmpresa()+
								"\n Prazo: "+ this.usuarioLogado.getListaDeCompras2().get(i).getFrete().getPrazo()+" dias"+
								"\nValor Frete: " +this.usuarioLogado.getListaDeCompras2().get(i).getFrete().getValor()+" dinheiros"+
								"\nCodigo frete: "+this.usuarioLogado.getListaDeCompras2().get(i).getFrete().getCodigo());
						

					}
				}
			}catch(Exception exception) {
				System.out.println("Resposta Inválida");
			}
		}
	// Método responsavel por fazer uma compra.
	public void comprar(Listas listas,GerenciadorAnuncio gerenciadorAnuncio, MenuUsuario menuUsuario) {
		double valorTotalCompra=0;
		try {
			System.out.println("\nDigite o codigo do anuncio que deseja comprar ");
			String textoResposta = input.nextLine();
			int codigoAnuncioDigitado = Integer.valueOf(textoResposta);//usuario escolhhe o anuncio que quer comprar

			Anuncio anuncio=null;
			Frete frete=null;

			for(int i=0; i<listas.getListaDeAnuncios().size();i++) {
				if(codigoAnuncioDigitado==listas.getListaDeAnuncios().get(i).getCodigoAnuncio()) {// procura o codigo digitado na lista de anuncios
					anuncio =listas.getListaDeAnuncios().get(i);	
					valorTotalCompra= listas.getListaDeAnuncios().get(i).getValorAnuncio();
				}
			}
			System.out.println("\nDigite o codigo do frete que deseja contratar ");
			textoResposta = input.nextLine();
			int codigoFreteDigitado = Integer.valueOf(textoResposta);
			for(int i=0; i<listas.getListaDeFretes().size();i++) {
				if(codigoFreteDigitado==listas.getListaDeFretes().get(i).getCodigo()) {// procura o codigo digitado na lista de anuncios
					frete =listas.getListaDeFretes().get(i);	
					valorTotalCompra = (valorTotalCompra + listas.getListaDeFretes().get(i).getValor()); 
				}
			}
			System.out.println("valor total: "+ valorTotalCompra);
			System.out.println("Digite o valor total para pagar");
			textoResposta = input.nextLine();
			double respostaPago = Double.valueOf(valorTotalCompra);
			if(respostaPago == valorTotalCompra) {

				Compras novaCompra = new Compras(anuncio,frete);

				menuUsuario.getUsuarioLogado().getListaDeCompras2().add(novaCompra);
				System.out.println("Compra Realizada");
			}
			if(respostaPago != valorTotalCompra) {
				System.out.println(" valor imcompativel");
			}
		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}
	}
	
public void listarCompras() {
	System.out.println("AA");
	for(int i=0 ; i<this.getUsuarioLogado().getListaDeCompras2().size();i++) {//percorre a lista de compras 
		System.out.println("BB");
		System.out.println("Codigo: "+this.getUsuarioLogado().getListaDeCompras2().get(i).getAnuncio().getCodigoAnuncio()
				+" Titulo: "+this.getUsuarioLogado().getListaDeCompras2().get(i).getAnuncio().getTituloAnuncio());
	}
}


}
