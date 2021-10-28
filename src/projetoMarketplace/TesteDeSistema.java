package projetoMarketplace;

import java.util.ArrayList;
import java.util.Scanner;
//classe responsavel por executar e testar todos os casos de uso do sitema, 
//como é uma classe de testes aqui não à a exibiçao do menu "principal" com as opçoes 
//para o usuário digitar, e sim uma sequencia de metodos autoexplicativos.

public class TesteDeSistema {

	public static void main(String[] args) {
		Menu menu = new Menu();
		MenuUsuario menuUsuario= new MenuUsuario();
		MenuFrete menuFrete = new MenuFrete();
		GerenciadorAnuncio gerenciadorAnuncio = new GerenciadorAnuncio();
				
		Listas listas = new Listas();
		listas.criarListaUsuarios();
		listas.criarListaAnuncios();
		listas.criarListaFretes();
	
		
		
		
		//Método que lista os anuncios 
		System.out.printf("%n Agora vai listar os anuncios de 10 em 10 na tela %n");
		gerenciadorAnuncio.listarAnuncios(listas);
		
		//Método que cria os anuncios
		System.out.printf("%n Agora vai criar um anuncio%n");
		gerenciadorAnuncio.cadastrarAnuncio(listas);
		
		//Método que editar um anuncio
		System.out.printf("%n Agora vai editar um anuncio%n");
		gerenciadorAnuncio.editarAnuncio(listas,menuUsuario);
		
		//Método que exclui um anuncio
		System.out.printf("%n Agora vai excluir um anuncio%n");
		gerenciadorAnuncio.excluirAnuncio(listas,menuUsuario);
		
		//Método que exibi detalhes de um anunncio
		System.out.printf("%n Agora vai exibir detalhes um anuncio%n");
		gerenciadorAnuncio.exibirDetalhesAnuncio(listas);
		
		//Método que exibi detalhes de um frete
		System.out.printf("%n Agora vai exibir detalhes um frete %n");
		menuFrete.exibirDetalhesFrete(listas);
		
		//Método que edita um frete
		System.out.printf("%n Agora vai editar um  frete %n");
		menuFrete.editarFrete(listas);
		
		//Método que excluir um frete
		System.out.printf("%n Agora vai excluir um  frete %n");
		menuFrete.excluirFrete(listas);
		
		//Método que cria um frete
		System.out.printf("%n Agora vai criar um  frete %n");
		menuFrete.criarFrete(listas);
		
		// Método que lista os fretes de 10 em 10
		System.out.printf("%n Agora vai listar os fretes de 10 em 10 %n");
		menuFrete.listarFretes(listas);
		
		//Método que compra um produto/anuncio
		System.out.printf("%n Agora vai comprar um anuncio/produto %n");
		menuUsuario.comprar(listas,gerenciadorAnuncio,menuUsuario);
		
		//Método que acessa informações do usuário
		System.out.printf("%n Agora o usuario vai poder accessar as informacoes dele %n");
		menuUsuario.exibirInformaçõesDoUsuario(listas);
		
		//Método que acessa compras do usuário
		System.out.printf("%n Agora o usuario vai poder accessar as informacoes de sua compra %n");
		menuUsuario.exibirDetalhesDeCompra();
		
		//Método que acessa anuncios/produtos do usuario
		System.out.printf("%n Agora o usuario vai poder accessar seus anuncios cadastrados no sistema %n");
		menuUsuario.exibirAnunciosDoUsuario(listas);
		
		//Método que loga um usuario
		System.out.printf("%n Agora o usuario vai poder logar no sistema %n");
		menuUsuario.logar(listas);
		
		//Método que cadasta usuário
		System.out.printf("%n Agora o usuario vai poder se cadastrar no sistema %n");
		menuUsuario.cadastraUsuario(listas);
		
		
		System.out.printf("%n Fim %n");
		
		
		
		
	}

}
