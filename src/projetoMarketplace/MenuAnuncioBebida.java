package projetoMarketplace;

import java.util.ArrayList;
import java.util.Scanner;
//ESSA CLASSE CRIA E EDITA ANUNCIOS DE BEBIDA
public class MenuAnuncioBebida {
	Scanner input = new Scanner(System.in);
	//Método que exibe algumas opções na tela. 				
	public void menuBebidas() {
		System.out.println("Digite 1 para editar titulo\n"
				+ "Digite 2 para editar o valor\n"
				+ "Digite 3 para editar a quantidade"
				+ "Digite 4 para editar a quantidade de ML \n"
				+ "Digite 5 para editar o tipo de bebida\n"
				+ "Digite 6 para editar o tiop de recipiente\n");

	}
	// Método responsavél de fato por cadastrar um anuncio do tipo bebida.
	public void cadastrarAnuncioBebidas(Listas listas, MenuUsuario menuUsuario) {  
		try {
		System.out.println("Informe o codigo");
		String textoResposta = input.nextLine();
		int novoCodigo = Integer.valueOf(textoResposta);
		
		System.out.println("Informe o titulo \n");
		String novoTituloAnuncio = input.nextLine();
				
		System.out.println("Informe o valor \n");
		String textoResposta1 = input.nextLine();
		double novoValorAnuncio = Double.valueOf(textoResposta1);
				
		System.out.println("Informe a quantidade de anuncio");
		textoResposta = input.nextLine();
		int novaQuantidadeAnuncio = Integer.valueOf(textoResposta);
		
		System.out.println("Informe a quantidade de Ml da bebida\n");
		textoResposta = input.nextLine();
		double novaQuantidadeML = Integer.valueOf(textoResposta);
		
		System.out.println("Informe o tipo de bebida\n");
		String novoTipoBebida = input.nextLine();
		
		System.out.println("Informe o tipo de recipiente\n");
		String novoTipoRecipiente = input.nextLine();
		

		AnuncioBebidas novoAnuncioBebidas = new AnuncioBebidas(novoCodigo,novoTituloAnuncio, novoValorAnuncio,
				novaQuantidadeAnuncio,menuUsuario.getUsuarioLogado(),
	            	novaQuantidadeML, novoTipoRecipiente, novoTipoBebida);
		
		listas.getListaDeAnuncios().add(novoAnuncioBebidas);
		System.out.println("Anuncio criado");
		
		}catch(Exception exception) {
			
			System.out.println("Resposta invalida");
		}
	}
	
//Método responsavél por editar um annuncio do tipo bebida.	
public void editarAnuncioBebidas(AnuncioBebidas anuncio) {
		
		boolean informante = false;
		menuBebidas();// usa um menuBebidas
		try {
			String textoResposta = input.nextLine();
			int resposta = Integer.valueOf(textoResposta);
			if(resposta == 1 || resposta == 2 || resposta ==3 || resposta == 4 ||
					resposta == 5 || resposta == 6) 
			{
				switch(resposta) { // lÃª e altera os dados que o usuÃ¡rio solicitou.
				case 1:
					System.out.println("Titulo atual: "+ anuncio.getTituloAnuncio());
					System.out.println("Informe o novo titulo \n");
					String novoTituloAnuncio = input.nextLine();
					anuncio.setTituloAnuncio(novoTituloAnuncio);
					break;
				case 2:
					System.out.println("Valor atual: "+ anuncio.getValorAnuncio()+" dinheiros");
					System.out.println("Informe o novo valor \n");
					textoResposta = input.nextLine();
					double novoValorAnuncio = Integer.valueOf(textoResposta);
					anuncio.setValorAnuncio(novoValorAnuncio);
					break;
				case 3:
					System.out.println("Quantidade atual: "+ anuncio.getQuantidadeAnuncio()+ " anuncios");
					System.out.println("Informe a nova quantidade de anuncio\n");
					textoResposta = input.nextLine();
					int novoQuantidadeAnuncio = Integer.valueOf(textoResposta);
					anuncio.setQuantidadeAnuncio(novoQuantidadeAnuncio);
					break;
				case 4:
					System.out.println("Quantidade atual: "+ anuncio.getQuantidadeML() +"Ml");
					System.out.println("Informe a nova quantidade em ML \n");
					textoResposta = input.nextLine();
					double novaQuantidadeML = Integer.valueOf(textoResposta);
					anuncio.setQuantidadeML(novaQuantidadeML);
					break;
				case 5:
					System.out.println("Tipo atual: "+ anuncio.getTipoBebida());
					System.out.println("Informe o novo tipo de bebida \n");
					String novoTipoBebida = input.nextLine();
					anuncio.setTipoBebida(novoTipoBebida);
					break;
				case 6:
					System.out.println("Recipiente atual: "+ anuncio.getTipoRecipiente());
					System.out.println("Informe o novo tipo de recipiente \n");
					String novoTipoRecipiente = input.nextLine();
					anuncio.setTipoRecipiente(novoTipoRecipiente);
					break;
				}
				informante = true;
			}if(informante == false ) {
				System.out.println("OPÇÃO NÃO ENCONTRADA");
			}
		}catch(Exception e) {
			System.out.println("RESPOSTA INVALIDA");
		}
	}
}
