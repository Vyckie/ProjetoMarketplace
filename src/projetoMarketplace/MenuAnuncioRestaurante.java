package projetoMarketplace;

import java.util.Scanner;
//ESSA CLASSE CRIA E EDITA ANUNCIOS DE RESTAURANTE
public class MenuAnuncioRestaurante {
	Scanner input = new Scanner(System.in);
	public void menuRestaurante() {
		System.out.println("Digite 1 para editar titulo\n"
				+ "Digite 2 para editar o valor\n"
				+ "Digite 3 para editar a quantidade\n"
				+ "Digite 4 para editar a porcentagem de Glutem\n"
				+ "Digite 5 para editar os acompanhamentos \n"
				+ "Digite 6 para editar de que seu prato é composto \n");
	}
	public void cadastrarAnuncioRestaurante(Listas listas, MenuUsuario menuUsuario) {//metodo para cadrastar um novo anuncio
		try {
			System.out.println("Informe o codigo");
			String textoResposta = input.nextLine();
			int codigo = Integer.valueOf(textoResposta);
			System.out.println("Informe o titulo \n");
			String TituloAnuncio = input.nextLine();
			//anuncioM.setTituloAnuncio(TituloAnuncio);
			System.out.println("Informe o valor \n");
			String textoResposta1 = input.nextLine();
			double ValorAnuncio = Integer.valueOf(textoResposta1);
			//anuncioM.setValorAnuncio(ValorAnuncio);
			System.out.println("Informe a quantidade de anuncio");
			textoResposta = input.nextLine();
			int QuantidadeAnuncio = Integer.valueOf(textoResposta);
			System.out.println("Informe a porcentagem de Glutem \n");
			textoResposta = input.nextLine();
			double porcentagemGlutem =  Integer.valueOf(textoResposta);
			System.out.println("Informe os acompanhamentos \n");
			String acompanhamento = input.nextLine();
			System.out.println("Informe do que seu prato é composto \n");
			String compostoPor = input.nextLine();


			AnuncioRestaurante anuncioRestaurante = new AnuncioRestaurante(codigo, TituloAnuncio,ValorAnuncio,
					QuantidadeAnuncio,menuUsuario.getUsuarioLogado(), porcentagemGlutem,acompanhamento,compostoPor);
			
			listas.getListaDeAnuncios().add(anuncioRestaurante);
		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}
	}

	public void editarAnuncioRestaurante(AnuncioRestaurante anuncio) {//metodo para editar um anuncio
		boolean informante = false;
		try {
			menuRestaurante();
			String textoResposta = input.nextLine();
			int resposta = Integer.valueOf(textoResposta);
			if(resposta == 1 || resposta == 2 || resposta ==3 || resposta == 4 ||
					resposta == 5 || resposta == 6) 
			{
				switch(resposta) {
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
					System.out.println("Quantidade atual: "+ anuncio.getQuantidadeAnuncio()+" anuncios");
					System.out.println("Informe a nova quantidade de anuncio \n");
					textoResposta = input.nextLine();
					int novoQuantidadeAnuncio = Integer.valueOf(textoResposta);
					anuncio.setQuantidadeAnuncio(novoQuantidadeAnuncio);
					break;
				case 4:
					System.out.println("Porcentagem atual: "+ anuncio.getPorcentagemGlutem()+"% de Glutem");
					System.out.println("Informe a nova porcentagem de Glutem \n");
					textoResposta = input.nextLine();
					double novaPorcentagemGlutem = Integer.valueOf(textoResposta);
					anuncio.setPorcentagemGlutem(novaPorcentagemGlutem);
					break;

				case 5:
					System.out.println("Acompanhamento atual: "+ anuncio.getAcompanhamento());
					System.out.println("Informe os novos acompanhamentos \n");
					String novoAcompanhamento = input.nextLine();
					anuncio.setAcompanhamento(novoAcompanhamento);

				case 6 :
					System.out.println("Atualmente seu prato é composto por: "+ anuncio.getCompostoPor());
					System.out.println("Informe de que seu prato é composto");
					String novoCompostoPor = input.nextLine();
					anuncio.setCompostoPor(novoCompostoPor);
					break;
				}
				informante = true;
			}if(informante == false) {
				System.out.println("OPÇÃO NÃO ENCONTRADA");
			}
		}catch(Exception exception) {
			System.out.println("RESPOSTA INVALIDA");
		}
	}
}



