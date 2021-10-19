package projetoMarketplace;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
// Classe Anuncio que tem caracteristicas de um Anuncio.
public class Anuncio {

	//ATRIBUTOS------------------------------------------------------------------
    private String tituloAnuncio;
    private double valorAnuncio;
    private int quantidadeAnuncio;
    private int codigo;
    private Usuario autor;
    

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    
        
    Scanner input = new Scanner(System.in);
    //METODOS CONSTRUTORES--------------------------------------------------------
    public Anuncio() {//CONSTRUTOR VAZIO
    }

    public Anuncio(int codigo, String tituloAnuncio, double valorAnuncio, int quantidadeAnuncio, Usuario autor) {
    	this.codigo=codigo;
        this.tituloAnuncio = tituloAnuncio;
        this.valorAnuncio = valorAnuncio;
        this.quantidadeAnuncio=quantidadeAnuncio;
        this.codigo = codigo;
        this.autor = autor;
    }
    
    public String toString() {
		return String.format("Codigo: %d%nTitulo:%s%nValor: %.2f%nEmail do vendedor: %s", 
				 this.getCodigoAnuncio(),this.getTituloAnuncio(), this.getValorAnuncio(), this.getAutor().getNome());
	}
      
    
    //GETTERS AND SETTERS------------------------------------------------------------
    public String getTituloAnuncio() {
        return tituloAnuncio;
    }

    public void setTituloAnuncio(String titulo) {
        this.tituloAnuncio = titulo;
    }

    public Double getValorAnuncio() {
        return valorAnuncio;
    }

    public void setValorAnuncio(Double valor) {
        this.valorAnuncio = valor;
    }

    public int getCodigoAnuncio() {
        return codigo;
    }

    public void setCodigoAnuncio(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeAnuncio() {
        return quantidadeAnuncio;
    }

    public void setQuantidadeAnuncio(int quantidadeAnuncio) {
        this.quantidadeAnuncio = quantidadeAnuncio;
    }

	
    
    
}
