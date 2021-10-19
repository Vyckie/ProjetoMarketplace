package projetoMarketplace;
//classe frete com seus respectivos atributos que representam um frete.
public class Frete {
	//ATRIBUTOS
	private String empresa;
	private double valor;
	private int codigo;
	private int prazo;

	//CONSTRUTORES

	public Frete() {
	}

	public Frete(String empresa, double valor, int prazo, int codigo) {
		this.empresa = empresa;
		this.valor = valor;
		this.codigo = codigo;
		this.prazo = prazo;
	}
	// método que retorna os dados formatados.
	public String toString() {
		return String.format("Empresa: %s%nPrazo: %d%n%Valor: %f%nCodigo: %d%n", 
				this.getEmpresa(),this.getPrazo(),this.getValor(), this.getCodigo());
	}
	// abaixo estão os métodos gets e sets da classe.
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
