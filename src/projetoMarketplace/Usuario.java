package projetoMarketplace;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

	    //ATRIBUTOS--------------------------------------------------------------------------------
	    private String nome;
	    private String sobrenome;
	    private String cidade;
	    private String cPF;
	    private String email;
	    private String senha;
	    
	    private ArrayList<Compras> listaDeCompras = new ArrayList();
	    
	    
	    
	    Scanner input = new Scanner(System.in);
	    //CONSTRUTORES-----------------------------------------------------------------------------
	    public Usuario() {                  //CONSTRUTOR VAZIO
	           
	    }

	    public Usuario(String nome, String sobrenome, String cidade, String cPF, String email, String senha) {
	        this.nome = nome;
	        this.sobrenome = sobrenome;
	        this.cPF = cPF;
	        this.email = email;
	        this.senha = senha;
	        this.cidade = cidade;
	    }
	    
	    
	    public String toString() {
			return String.format("%s %s%n%s%n%s%n", 
					 this.getNome(),this.getSobrenome(),this.getCidade(),this.getEmail());
		}
	  
	    //Getters--------------------------------------------------------------------

	    public String getNome() {
	        return nome;
	    }
	   
	    public String getSobrenome() {
	        return sobrenome;
	    }

	    public String getcPF() {
	        return cPF;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getSenha() {
	        return senha;
	    }

	    public String getCidade() {
	        return cidade;
	    }
	    
	    
	    
	    public ArrayList<Compras> getListaDeCompras2() {
			return listaDeCompras;
		}
	    
	    //Setters-----------------------------------------------------------------

	   



		
		public void setSenha(String senha) {
	        this.senha = senha;
	    }

	    public void setCidade(String cidade) {
	        this.cidade = cidade;
	    }
}
