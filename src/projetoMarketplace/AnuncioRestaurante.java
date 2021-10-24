package projetoMarketplace;
//Classe Anunciorestaurante que extende Anuncio.
public class AnuncioRestaurante extends Anuncio{
	
	// declara as variaveis.
		private double porcentagemGlutem;
		private String acompanhamento;
		private String compostoPor;// composi�ao do produto, ex p�o,salada e carne
	        //CONSTRUTORES

	    public AnuncioRestaurante() {
	    }

	    public AnuncioRestaurante(int codigo, String tituloAnuncio, Double valorAnuncio, int quantidadeAnuncio, Usuario autor,
	                                double porcentagemGlutem, String acompanhamento, String compostoPor) {
	        super(codigo, tituloAnuncio, valorAnuncio, quantidadeAnuncio,autor);
	        
	        this.acompanhamento = acompanhamento;
	        this.compostoPor = compostoPor;
	        if(porcentagemGlutem <0){
	                throw new IllegalArgumentException("a quantidade de gl�tem n�o pose "
						+ "ser menor que 0");
	        }
	        this.porcentagemGlutem = porcentagemGlutem;
	        
	    }
	        
	        
		public void setPorcentagemGlutem(double porcentagemGlutem) {
			if(porcentagemGlutem <= 0)
				throw new IllegalArgumentException("a quantidade de gl�tem n�o pose "
						+ "ser menor ou igual a 0");
			this.porcentagemGlutem = porcentagemGlutem;
		}
		// A seguir est�o os m�todos gets e sets que validam e retornam os dados.
		public double getPorcentagemGlutem() {
			return porcentagemGlutem;
		}
		public void setAcompanhamento(String acompanhamento) {
			this.acompanhamento = acompanhamento;
		}
		public String getAcompanhamento() {
			return acompanhamento;
		}
		public void setCompostoPor(String compostoPor) {
			this.compostoPor = compostoPor;
		}
		public String getCompostoPor() {
			return compostoPor;
		}// m�todo que retorna os dados como resposta formatada.
		@Override
		public String toString() {
			return String.format("%s%n porcentagem de Glutem: %s  %n Acompanha: %s%nComposto por: %s", 
					super.toString(), getPorcentagemGlutem(),
					getAcompanhamento(), getCompostoPor());
		}
			
}
