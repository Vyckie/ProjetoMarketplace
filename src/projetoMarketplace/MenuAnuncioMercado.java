package projetoMarketplace;

import java.util.Scanner;
//ESSA CLASSE CRIA E EDITA ANUNCIOS DE MERCADO
public class MenuAnuncioMercado {
	Scanner input = new Scanner(System.in);
	public void opcoesEditarAnuncioMercado() {
		System.out.println("Digite 1 para editar titulo\n"
				+ "Digite 2 para editar o valor\n"
				+ "Digite 3 para editar a quantidade\n"
				+ "Digite 4 para editar o peso Kg \n"
				+ "Digite 5 para editar a prateleira\n"
				+ "Digite 6 para editar  a procedencia\n");

	}
	public void cadastrarAnuncioMercado(Listas listas, MenuUsuario menuUsuario) {//metodo para cadrastar um novo anuncio

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
			String textoResposta2 = input.nextLine();
			int QuantidadeAnuncio = Integer.valueOf(textoResposta2);
			//anuncioM.setQuantidadeAnuncio(QuantidadeAnuncio);
			System.out.println("Informe o peso do produto em KG %n");
			String textoResposta3 = input.nextLine();
			double pesoKG = Integer.valueOf(textoResposta3);
			//anuncioM.setPesoKG(pesoKG);
			System.out.println("Informe em que tipo de prateleira seu produto se adequa %n");
			String tipoPrateleira = input.nextLine();
			//anuncioM.setTipoPrateleira(tipoPrateleira);
			System.out.println("Informe a procedencia do produt %n");
			String tipoProcedencia = input.nextLine();
			//anuncioM.setTipoProcedencia(tipoProcedencia);



			AnuncioMercado anuncioMercado = new AnuncioMercado(codigo, TituloAnuncio,ValorAnuncio,
					QuantidadeAnuncio, menuUsuario.getUsuarioLogado(), tipoPrateleira,pesoKG, tipoProcedencia);
			
			listas.getListaDeAnuncios().add(anuncioMercado);
			
		}catch(Exception exception) {
			System.out.println("Resposta Invalidá");
		}
	}

	public void editarAnuncioMercado(AnuncioMercado anuncio) { //metodo para editar um anuncio
		boolean informante = false;
		try {
			opcoesEditarAnuncioMercado();
			String textoResposta = input.nextLine();
			int resposta = Integer.valueOf(textoResposta);
			if(resposta == 1 || resposta == 2 || resposta ==3 || resposta == 4 ||
					resposta == 5 || resposta == 6) 
			{
				switch(resposta) {
				case 1:// edita o titulo do anuncio
					System.out.println("Titulo atual: "+ anuncio.getTituloAnuncio());
					System.out.println("Informe o novo titulo \n");
					String novoTituloAnuncio = input.nextLine();
					anuncio.setTituloAnuncio(novoTituloAnuncio);
					break;
				case 2:// edita o valor do anuncio
					System.out.println("Valor atual: "+ anuncio.getValorAnuncio()+ " dinheiros");
					System.out.println("Informe o novo valor \n");
					double novoValorAnuncio = input.nextDouble();
					anuncio.setValorAnuncio(novoValorAnuncio);
					break;
				case 3:// edita a quantidade de anuncio.
					System.out.println("Quantidade atual: "+ anuncio.getQuantidadeAnuncio()+ " anuncios");
					System.out.println("Informe a nova quantidade de anuncio");
					int novoQuantidadeAnuncio = input.nextInt();
					anuncio.setQuantidadeAnuncio(novoQuantidadeAnuncio);
					break;
				case 4:
					System.out.println("Peso atual: "+ anuncio.getPesoKG()+" Kg");
					System.out.println("Informe o novo peso em KG");
					double novoPesoKG = input.nextDouble();
					anuncio.setPesoKG(novoPesoKG);
					break;

				case 5:
					System.out.println("Prateleira atual: "+ anuncio.getTipoPrateleira());
					System.out.println("Informe o novo tipo de prateleira %n");
					String novoTipoPrateleira = input.nextLine();
					anuncio.setTipoPrateleira(novoTipoPrateleira);
					break;

				case 6:
					System.out.println("Procedencia atual: "+ anuncio.getTipoProcedencia());
					System.out.println("Informe o novo tipo de procedencia");
					String novoTipoProcedencia = input.nextLine();
					anuncio.setTipoPrateleira(novoTipoProcedencia);
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
