package projetoMarketplace;
import java.util.Scanner;

//ESSA CLASSE GERENCIA OS ANUNCIOS(EDITA, LISTA, EXIBE DETALHES E EXCLUI)
public class GerenciadorAnuncio {

	MenuAnuncioBebida menuBebidas = new MenuAnuncioBebida();
	MenuAnuncioMercado menuMercado = new MenuAnuncioMercado();
	MenuAnuncioRestaurante menuRestaurante = new MenuAnuncioRestaurante();
	MenuFrete menuFrete = new MenuFrete();
	MenuUsuario menuUsuario = new MenuUsuario();
	Menu menu = new Menu();
	Scanner input = new Scanner(System.in);

	public void cadastrarAnuncio(Listas listas) {//metodo para cadastrar anuncios, com as opcçoes dos tipos de anuncios
		menu.menuTipoAnuncio();

		int resposta = input.nextInt();
		switch(resposta){
		case 1:
			menuBebidas.cadastrarAnuncioBebidas(listas,menuUsuario);// cria um anuncio de bebida
			break;
		case 2:  
			menuMercado.cadastrarAnuncioMercado(listas, menuUsuario);// cria um anuncio de mercado
			break;

		case 3:
			menuRestaurante.cadastrarAnuncioRestaurante(listas, menuUsuario);
			break;
		}
	}


	public void editarAnuncio(Listas listas, MenuUsuario menuUsuario) {
		try {
			boolean informante = false;
			menu.menuTipoAnuncio();
			String respostatexto = input.nextLine();
			int respostaOpcao = Integer.valueOf(respostatexto);
			System.out.println("Informe o codigo  \n");
			respostatexto = input.nextLine();
			int respostaCodigo = Integer.valueOf(respostatexto);
			
			for(Anuncio anuncio : listas.getListaDeAnuncios() ){
				if(respostaCodigo== anuncio.getCodigoAnuncio() && menuUsuario.getUsuarioLogado()==anuncio.getAutor()){
					switch(respostaOpcao) {
					case 1:
						menuBebidas.editarAnuncioBebidas((AnuncioBebidas) anuncio);
						break;
					case 2:
						menuMercado.editarAnuncioMercado((AnuncioMercado) anuncio);
						break;
					case 3:
						menuRestaurante.editarAnuncioRestaurante((AnuncioRestaurante) anuncio);
						break;
					}	
					informante = true;
				}
			}
			if(informante == false) {
				System.out.println("Codigo inválido");
			}
		}catch(Exception e) {
			System.out.println("Resposta Inválida");
		}
	}
	//Mostra 10 anuncios na lista
	public void listarAnuncios(Listas listas){
		try {
			/*A lista de produtos/serviços exibe no máximo 10 produtos/serviços por vez e um comando
	    pode ser dado para exibir mais 10.*/


			for(int i=0; i<10; i++){
				System.out.println(listas.getListaDeAnuncios().get(i).getTituloAnuncio()+" | codigo: "
						+listas.getListaDeAnuncios().get(i).getCodigoAnuncio());            //Mostra 10 anuncios na lista
			}

			System.out.println("-----------------------------------------------");
			System.out.println("Ver Mais Anuncios: 1-Sim 2-Não");
			int verMaisAnuncio = Integer.parseInt(input.next());

			if(verMaisAnuncio==1){                             
				for(int j=10; j<20; j++){
					System.out.println(listas.getListaDeAnuncios().get(j).getTituloAnuncio()+" | codigo: "
							+listas.getListaDeAnuncios().get(j).getCodigoAnuncio());     
				}

				System.out.println("-----------------------------------------------");
				System.out.println("Ver Mais Anuncios: 1-Sim 2-Não");
				verMaisAnuncio = Integer.parseInt(input.next());
				if(verMaisAnuncio==1){
					for(int j=20; j<listas.getListaDeAnuncios().size(); j++){
						System.out.println(listas.getListaDeAnuncios().get(j).getTituloAnuncio()+" | codigo: "
								+listas.getListaDeAnuncios().get(j).getCodigoAnuncio()+"\n");   //mostra mais anuncios 
					}
				}
			}
		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}
	}

	// Método que exibe detalhes de um anuncio.
	public void exibirDetalhesAnuncio(Listas listas){
		try {
			System.out.println("Digite o codigo do Anuncio");
			int resp = input.nextInt();

			for(int i=0; i<listas.getListaDeAnuncios().size(); i++){

				if(resp==listas.getListaDeAnuncios().get(i).getCodigoAnuncio()){//se o codigo digitado for igual ao codigo da lista 
					System.out.println(listas.getListaDeAnuncios().get(i).toString());

				}
			}

		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}

	}

	// Método resposnsavél por excluir um anuncio
	public void excluirAnuncio(Listas listas, MenuUsuario menuUsuario) {
		try {
			Usuario usuarioLogado = menuUsuario.getUsuarioLogado();
			System.out.println("Digite o codigo do Anuncio que deseja excluir");
			String textoResposta = input.nextLine();
			int codigoDoAnuncio = Integer.valueOf(textoResposta);

			for(int i=0; i<listas.getListaDeAnuncios().size();i++) {

				if(codigoDoAnuncio==listas.getListaDeAnuncios().get(i).getCodigoAnuncio() //Verificar se o codigo esta presente na lista
						&& usuarioLogado==listas.getListaDeAnuncios().get(i).getAutor()){// e se o usuario é dono do anuncio

					listas.getListaDeAnuncios().remove(i);//Remove o Anuncio na mesma posição do codigo digitado
					System.out.println("Anuncio Removido");
				}

			}


		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}
	}
}
