package projetoMarketplace;
//Classe AnuncioMercado que extende Anuncio.
public class AnuncioMercado extends Anuncio {
	 
		private String tipoPrateleira;// se é carne ou legumes ou temperos...
		private double pesoKG;
		private String tipoProcedencia;// se é organico ou trangenico
	    
	    //CONSTRUTORES
	    public AnuncioMercado() {
	        
	    }

	    public AnuncioMercado(int codigo, String tituloAnuncio, double valorAnuncio, int quantidadeAnuncio, Usuario autor,
	    		String tipoPrateleira, double pesoKG, String tipoProcedencia) {
	        super(codigo, tituloAnuncio, valorAnuncio, quantidadeAnuncio, autor);
	        this.tipoPrateleira = tipoPrateleira;
	        this.pesoKG = pesoKG;
	        this.tipoProcedencia = tipoProcedencia;
	    }

	    
	        

	public void setPesoKG(double pesoKG) {
		if(pesoKG <= 0)
			throw new IllegalArgumentException("o peso em KG não pode ser menor"
					+ " ou igual a 0");
		this.pesoKG = pesoKG;
	}
	public double getPesoKG() {
		return pesoKG;
	}
	public void setTipoPrateleira(String tipoPrateleira) {
		this.tipoPrateleira = tipoPrateleira;
	}
	public String getTipoPrateleira() {
		return tipoPrateleira;
	}
	public void setTipoProcedencia(String tipoProcedencia) {
		this.tipoProcedencia = tipoProcedencia;
	}
	public String getTipoProcedencia() {
		return tipoProcedencia;
	}
	@Override
	public String toString() {
		return String.format("%s%n%s kg %nNa prateleira de: %s%nProduto: %s "
				,super.toString(),getPesoKG(), getTipoPrateleira(), 
				getTipoProcedencia());
	}
	

}
