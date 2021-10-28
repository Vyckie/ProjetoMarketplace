package projetoMarketplace;
//classe responsavél por exibir alguns menus na tela.
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);
	//método que exibe algumas opçoes na tela
	public void menuOpcoesPrimeiraTela() {
		System.out.println("\nDigite 0 para sair \n"
				+ "Digite 1 para listar todos os produtos anunciados \n"
				+ "Digite 2 para criar um anuncio \n"
				+ "Digite 3 para editar um anuncio \n"
				+ "Digite 4 para excluir um anuncio \n"
				+ "Digite 5 para exibir detalhe de um anuncio \n"
				+ "Digite 6 para exibir detalhes de um frete \n"
				+ "Digite 7 para listar todos os fretes \n"
				+ "Digite 8 para gerenciar fretes  \n"
				+ "Digite 9 para comprar \n"
				+ "Digite 10 para acessa o perfil de usuario\n");
	}
	// método que exibe opçoes na tela
	public void menuTipoAnuncio() {
		System.out.println("Escolha uma opcao de anuncio\n"
				+ "1 para anuncio de bebidas \n"
				+ "2 para anuncio de mercado \n"
				+ "3 para anuncio de restaurante \n");
	}

}

