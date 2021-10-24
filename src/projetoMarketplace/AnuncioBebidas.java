package projetoMarketplace;
//Classe AnuncioBebidas que extende Anuncio
public class AnuncioBebidas extends Anuncio {
	// declara as variaveis de instância.
	private double quantidadeML;
	private String tipoRecipiente;
	private String tipoBebida; // alcolica, sem alccol, destilada e etc

        //CONSTRUTORES
    public AnuncioBebidas() {//construtor vazio
    }

             
	public AnuncioBebidas(int codigo, String tituloAnuncio, double valorAnuncio, int quantidadeAnuncio, Usuario autor,
            double quantidadeML, String tipoRecipiente, String tipoBebida) {
        super(codigo, tituloAnuncio, valorAnuncio, quantidadeAnuncio, autor);
        this.quantidadeML = quantidadeML;
        this.tipoRecipiente = tipoRecipiente;
        this.tipoBebida = tipoBebida;
        if(quantidadeML <= 0)
			throw new IllegalArgumentException("Não é permitido quantidade de ML "
					+ "menor ou igual a 0");
		this.quantidadeML = quantidadeML;
    }
       
	// Abaixo estão os métodos getters e setters.
	public void setQuantidadeML(double quantidadeML) {
		if(quantidadeML <= 0)
		throw new IllegalArgumentException("Não é permitido quantidade de ML "
				+ "menor ou igual a 0");
		this.quantidadeML = quantidadeML;
	}
	public double getQuantidadeML() {
		return quantidadeML;
	}
	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}
	public String getTipoBebida() {
		return tipoBebida;
	}
	public void setTipoRecipiente(String tipoRecipiente) {
		this.tipoRecipiente = tipoRecipiente;
	}
	public String getTipoRecipiente() {
		return tipoRecipiente;
	}
	// método que exibe as informações formatadas. 
	@Override
	public String toString() {
		return String.format("%s%n%s ml %n%s %n%s", super.toString(), 
				getQuantidadeML(), getTipoBebida(), getTipoRecipiente());
	}
}
