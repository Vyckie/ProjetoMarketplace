package projetoMarketplace;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// cria objetos de seus repectivos tipos
		Menu menu = new Menu();
		MenuUsuario menuUsuario= new MenuUsuario();
		MenuFrete menuFrete = new MenuFrete();
		GerenciadorAnuncio gerenciadorAnuncio = new GerenciadorAnuncio();

		// este topico � responsav�l por criar as listas do tipo Usuario, Anuncios  e frete.
		Listas listas = new Listas();
		listas.criarListaUsuarios();
		listas.criarListaAnuncios();
		listas.criarListaFretes();

		// la�o de repeti��o que � encerrado se o usuario digitar 0, e onde � exibido o primeiro
		// menu que o usuario tem contato.
		int resposta=9;
		while(resposta!=0) {
			try {
				menuUsuario.menuUsuario();//Loga ou cadrasta o usuario
				String textoResposta = input.nextLine();
				resposta =Integer.valueOf(textoResposta);
				boolean informante = false; // Um informante que serve pra auxiliar o m�todo a seguir.
				// que ferifica se o n�mero digitado pelo usu�rio corresponde o solicitado no menu. 
				if(resposta == 0 || resposta == 1 || resposta == 2 ||
						resposta == 3 || resposta == 4 || resposta == 5 || resposta == 6) 
				{
					switch(resposta) {
					case 1:
						// autentica o usuario
						menuUsuario.logar(listas);

						if(menuUsuario.isUsuarioCadastrado()==true) {
							//Se o usuario estiver cadastrado ele tem acesso ao menu
							
							int resposta2=55;
							//outro la�o de repeti��o que exibe o segundo menu com as op�oes a mais  para um usu�rio autenticado ou administrador 
							while(resposta2!=0) {
								try {// artificio resposnsavel por capturar exce��es
									menu.menuOpcoesPrimeiraTela();
									String textoResposta2 = input.nextLine();
									resposta2 = Integer.valueOf(textoResposta2);
									boolean informante2 = false; // Um informante que serve pra auxiliar o m�todo a seguir.
									// que ferifica se o n�mero digitado pelo usu�rio corresponde o solicitado no menu. 
									if(resposta == -0 || resposta == 1 || resposta == 2 ||
											resposta == 3 || resposta == 4 || resposta == 5 || resposta == 6
											|| resposta == 7 || resposta == 8 || resposta ==9 || resposta == 10) 
									{
										switch(resposta2){
										case 0:
											resposta2=0;//sair
											break;
										case 1:
											gerenciadorAnuncio.listarAnuncios(listas);// exibe na tela todos os anuncios

											break;
										case 2://criar anuncios
											gerenciadorAnuncio.cadastrarAnuncio(listas);
											break;

										case 3://editar anuncios
											gerenciadorAnuncio.editarAnuncio(listas,menuUsuario);
											break;
										case 4:// excluir um anuncio 
											gerenciadorAnuncio.excluirAnuncio(listas, menuUsuario);
											break;

										case 5://exibir detalhe de um anuncio
											gerenciadorAnuncio.exibirDetalhesAnuncio(listas);

											break;

										case 6://exibir detalhes de um frete
											menuFrete.exibirDetalhesFrete(listas);
											break;
										case 7://listar todos os fretes
											menuFrete.listarFretes(listas);

											break;

										case 8://gerenciarFrete(Acesso restrito ao ADM)
											menuFrete.GerenciarFretes(listas);

											break;

										case 9://comprar
											menuUsuario.comprar(listas, gerenciadorAnuncio, menuUsuario);
											break;
										case 10://listar todos os fretes
											menuUsuario.gerenciarPerfilDeUsuario(listas);

											break;
										}
										informante2 = true; // se o switch for executado informante recebe true
										// e quer dizer que o usu�rio digitou uma resposta correta.
									}
									if (informante2 == false) {
										System.out.println(" OP��O N�O ENCONTRADA");
										break;
									}
									// se aresposta digitada pelo usuario n�o condiz com o silicitado
									// este tratamento de exce��es printa uma mensagem na tela. 
								}catch(Exception e){
									System.out.println("Resposta invalida");	
								}
							}
						}
						break;	
					case 2 :// cadastra o usuario, de ele n�o tiver cadastro no sistema.
						menuUsuario.cadastraUsuario(listas);
						break;
					case 3:
						gerenciadorAnuncio.listarAnuncios(listas);
						break;
					case 4:
						menuFrete.listarFretes(listas);
						break;
					case 5:

						gerenciadorAnuncio.exibirDetalhesAnuncio(listas);
						break;
					case 6:
						menuFrete.exibirDetalhesFrete(listas);
						break;
					}

					informante = true; // se o switch for executado informante recebe true
					// e quer dizer que o usu�rio digitou uma resposta correta.
				}
				if (informante == false) {
					System.out.println(" OP��O N�O ENCONTRADA");
					break;
				}

			}catch(Exception exception){
				System.out.println("Resposta inv�lida!");

			}
		}
	}

}
