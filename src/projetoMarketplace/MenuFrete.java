package projetoMarketplace;

import java.util.ArrayList;
import java.util.Scanner;
public class MenuFrete {
	Scanner input = new Scanner(System.in);

	public void GerenciarFretes(Listas listas) {
		try {
			System.out.println("Digite seu codigo de acesso");
			String textoResposta = input.nextLine();
			int resposta =Integer.valueOf(textoResposta);
			for(int i =0; i< listas.getListaAdm().size();i++) {
				if(resposta==listas.getListaAdm().get(i).getCodigoDeAcessoRestrito()) {//SE O USUARIO TIVER CODIGO DE ACESSO ELE PODE GERENCIAR OS FRETES
					System.out.println("Digite 1 para criar um frete\n"
							+ "Digite 2 para editar um frete\n"
							+ "Digite 3 para excluir o frete\n");
					String textResposta = input.nextLine();
					int resp =Integer.valueOf(textResposta);
					switch(resp){
					case 1:
						criarFrete(listas);
						break;
					case 2:  
						System.out.println("editar frete");
						editarFrete(listas);
						break;

					case 3:
						excluirFrete(listas);
						break;
					}
				}
			}
		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}

	}

	public void criarFrete(Listas listas) {
		try {
			System.out.println("Digite o nome da Empresa: ");
			String nomeEmpresa = input.nextLine();

			System.out.println("Digite o valor do frete");
			String textResposta = input.nextLine();
			double valor = Double.valueOf(textResposta);

			System.out.println("Digite o prazo em dias");
			textResposta = input.nextLine();
			int prazo = Integer.valueOf(textResposta);

			System.out.println("Digite o codigo do frete");
			textResposta = input.nextLine();
			int codigo = Integer.valueOf(textResposta);

			Frete novoFrete = new Frete(nomeEmpresa, valor,prazo, codigo);
			listas.getListaDeFretes().add(novoFrete);
			
		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}
	}

	public void editarFrete(Listas listas) {
		try {
			boolean codigovalido = false;

			System.out.println("Informe o codigo  \n");
			String respostatexto = input.nextLine();
			int respostaCodigo = Integer.valueOf(respostatexto);

			for(Frete frete : listas.getListaDeFretes() ){

				if(respostaCodigo== frete.getCodigo()){
					edicaoFrete((Frete) frete);
					codigovalido = true;
					break;
				}
			}

			if(codigovalido == false) {
				System.out.println("Codigo incorreto");

			}
		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}

	}

	public void edicaoFrete(Frete frete) {
		boolean informante = false;
		try {
			System.out.println("opcoes para editar frete \n"
					+ "1 para editar nome da empresa \n"
					+ "2 para editar o valor \n"
					+ "3 para editar o prazo \n");
			String textoResposta = input.nextLine();
			int resposta = Integer.valueOf(textoResposta);
			if(resposta == 1 || resposta == 2 || resposta ==3 || resposta == 4 ||
					resposta == 5 || resposta == 6) 
			{
				switch(resposta) { // lÃª e altera os dados que o usuÃ¡rio solicitou.
				case 1:
					System.out.println(" Empresa atual: "+ frete.getEmpresa());
					System.out.println("Informe o novo titulo \n");
					String novoNomeEmpresa = input.nextLine();
					frete.setEmpresa(novoNomeEmpresa);
					break;
				case 2:
					System.out.println(" Valor atual: "+ frete.getValor());
					System.out.println("Informe o novo valor do frete \n");
					textoResposta = input.nextLine();
					double novoValorFrete = Double.valueOf(textoResposta);

					frete.setValor(novoValorFrete);
					break;
				case 3:
					System.out.println(" Prazo atual: "+ frete.getPrazo());
					System.out.println("Informe o novo prazo maximo do frete \n");
					textoResposta = input.nextLine();
					int novoPrazoMaximo = Integer.valueOf(textoResposta);
					frete.setValor(novoPrazoMaximo);
					break;
				}
				informante = true;
			}if(informante == false ) {
				System.out.println("OPÇÃO NÃO ENCONTRADA");
			}
		}catch(Exception e) {
			System.out.println("Resposta Inválida");
		}
	}


	public void excluirFrete(Listas listas) {
		try {
			System.out.println("Digite o codigo do Frete que deseja excluir");
			String textoResposta = input.nextLine();
			int codigoDoFrete = Integer.valueOf(textoResposta);
			for(int i=0; i<listas.getListaDeFretes().size();i++) {
				if(codigoDoFrete==listas.getListaDeFretes().get(i).getCodigo()) {//Verificar se o codigo esta presente na lista
					listas.getListaDeFretes().remove(i);//Remove o frete na mesma posição do codigo digitado
				}
			}
		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}
	}

	public void exibirDetalhesFrete(Listas listas){
		try {

			System.out.println("Digite o codigo do frete");
			int resp = input.nextInt();
			boolean codigoValido=false;
			for(int i=0; i<listas.getListaDeFretes().size(); i++){

				if(resp==listas.getListaDeFretes().get(i).getCodigo()){//se o codigo digitado for igual ao codigo da lista 
					System.out.println("Empresa: "+listas.getListaDeFretes().get(i).getEmpresa()
							+"\nValor: "+listas.getListaDeFretes().get(i).getValor()+"\nPrazo: "
							+listas.getListaDeFretes().get(i).getPrazo()+"");
					codigoValido=true;
				}
			}
			if(codigoValido==false){
				System.out.println("Codigo digitado inválido");
			}
		}catch(Exception exception) {
			System.out.println("Resposta Inválida");
		}

	}
	public void listarFretes(Listas listas){
		try {
			/*A lista de fretes exibe um código do cadastro do frete que pode ser usado em outras funções. 
        A lista exibe no máximo 10 fretes por vez e um comando pode ser dado para exibir mais 10.*/
			for(int i=0; i<listas.getListaDeFretes().size(); i++){
				Frete frete =  listas.getListaDeFretes().get(i);
				System.out.println("Empresa: "+frete.getEmpresa()+"\n Codigo: "+frete.getCodigo());
			}

		}catch(Exception exception) {
			System.out.println("Ocorreu um erro!");
		}
	}
}
