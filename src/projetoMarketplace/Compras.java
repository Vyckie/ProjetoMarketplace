package projetoMarketplace;
//classe de compras que tem as caracteristicas de compra
public class Compras {
	// declara variáveis de intância do tipo anuncio e frete.
	private Anuncio anuncio;
	private Frete frete;
	//construtores
	public Compras() {
		
	}
			
	public Compras( Anuncio anuncio, Frete frete) {
				
		this.anuncio = anuncio;
		this.frete = frete;
	}
	
	// método que retorna os dados formatados.
	public String toString() {
		return String.format("n%s%n%f%n%s%n", 
				 this.getAnuncio().toString(), this.getFrete().toString());
	}
	
	// métodos getters e setters
	public Anuncio getAnuncio() {
		return anuncio;
	}
	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}
	public Frete getFrete() {
		return frete;
	}
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	
	
	
	
}
