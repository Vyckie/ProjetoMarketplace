package projetoMarketplace;
import java.util.ArrayList;
import java.util.Scanner;
//ESSE É O "BANCO DE DADOS", CONTEM AS LISTAS DE USUARIO, ANUNCIO, FRETE
public class Listas {
	
    Scanner input = new Scanner(System.in);
    
    
    //CRIAR LISTA DE USUARIOS-------------------------------------------------------------------------
    private ArrayList<Usuario> listaDeUsuarios = new ArrayList();
    private ArrayList <UsuarioAdministrador> listaAdm = new ArrayList<UsuarioAdministrador>();
    
    //CRIAR USUARIOS
    //Ao executar o programa ele já deve ter ao menos 1 usuário administrador.
    UsuarioAdministrador u1 = new UsuarioAdministrador("Vyckie","Santos","Paris","123456789","vyckie@gmail.com","12345678910",0000);
    //Ao executar o programa ele já deve ter ao menos 3 usuários comuns cadastrados
    Usuario u2 = new Usuario("Talita","Rosario","Cruz","11122233344","talita@gmail.com","0000");
    Usuario u3 = new Usuario("Vitor","Dias","Cruz","55566677788","vitor@gmail.com","carro123");
    Usuario u4 = new Usuario("Joao","Henrique","Cruz","88899900011","jh@gmail.com","jh1234");
    
    public void criarListaUsuarios(){
               
       //Adicionar usuarios na lista
       this.listaAdm.add(u1);
       this.listaDeUsuarios.add(u2);
       this.listaDeUsuarios.add(u3);
       this.listaDeUsuarios.add(u4);
       this.listaDeUsuarios.addAll(listaAdm);
       
    }
  
   
    //CRIAR LISTA DE ANUNCIOS-----------------------------------------------------------------------
    private ArrayList<Anuncio> listaDeAnuncios = new ArrayList();
    public void criarListaAnuncios(){
        //CRIAR ANUNCIOS
        /*Ao executar o programa, ele deve criar automaticamente pelo menos 21
        produtos/serviços anunciados de tipos variados.*/
    
        
    AnuncioBebidas anuncioBebida1 = new AnuncioBebidas(2,"sucos naturais",10.0,
    		1,u2,500.0,"caixa","suco natural");
	AnuncioBebidas anuncioBebida2 = new AnuncioBebidas(1,"sucos gostosos",15.0,
				1,u2,500.0,"caixa"," suco com gás");
	AnuncioMercado anuncioMercado1 = new AnuncioMercado(3,"mercadinho",25,3,u2,
				"carnes",1,"transgenico");
	AnuncioMercado anuncioMercado2 = new AnuncioMercado(4,"bolachas",5,8,u2,
				"café da manha",0.5,"organico");
	AnuncioRestaurante anuncioRestaurante1 = new AnuncioRestaurante(5,"macarronada",55.0,2,u3,
				6,"molho e milho","massas, queijo e frango");
	AnuncioRestaurante anuncioRestaurante2 = new AnuncioRestaurante(6,"pf",1.0,15,u3,30,
				"salada","arroz, feijao e carne");
	AnuncioRestaurante anuncioRestaurante3 = new AnuncioRestaurante(7,"dogão",1.0,5,u3,5,
				"mostarda","pão, salcicha milho e salada");
	AnuncioRestaurante anuncioRestaurante4 = new AnuncioRestaurante(8,"coxinha",3.0,10,u3,10,
				"maionese e ketchup","frango e queijo");
	AnuncioMercado anuncioMercado3 = new AnuncioMercado(9,"arroz",1,10,u4,
				"mantimentos",1,"organico");
	AnuncioBebidas anuncioBebida3 = new AnuncioBebidas(10,"cerveja",10,
				1,u4,400,"lata"," bebida alcoólica");
	AnuncioBebidas anuncioBebida4 = new AnuncioBebidas(11,"refrigerante",14,
				1,u4,2,"garrafa pet","gaseificado");
	AnuncioBebidas anuncioBebida5 = new AnuncioBebidas(12,"refrigerante de laranja",4,
				1,u4,2,"garrafa pet","gaseificado");
	AnuncioBebidas anuncioBebida6 = new AnuncioBebidas(13,"refrigerante de limão",54,
				1,u4,2,"garrafa pet","gaseificado");
	AnuncioBebidas anuncioBebida7 = new AnuncioBebidas(14,"refrigerante de tangerina",4,
				5,u4,22,"garrafa pet","gaseificado");
	AnuncioBebidas anuncioBebida8 = new AnuncioBebidas(15,"refrigerante de maracuja",11,
				5,u4,2,"garrafa pet","gaseificado");
	AnuncioBebidas anuncioBebida9 = new AnuncioBebidas(16,"refrigerante de uva",8,
				1,u4,2,"garrafa pet","gaseificado");
	AnuncioBebidas anuncioBebida10 = new AnuncioBebidas(17,"refrigerante de malancia",2,
				1,u4,2,"garrafa pet","gaseificado");
	AnuncioRestaurante anuncioRestaurante5 = new AnuncioRestaurante(18,"cochinha de carne",3.0,5,u4,10,
				"maionese e ketchup","carne e queijo");
	AnuncioRestaurante anuncioRestaurante6 = new AnuncioRestaurante(19,"cochinha de queijo",2.0,10,u4,15,
				"maionese e ketchup"," queijo");
	AnuncioMercado anuncioMercado4 = new AnuncioMercado(20,"feijão",1,10,u4,
				"mantimentos",1,"trangenico");
	AnuncioMercado anuncioMercado5 = new AnuncioMercado(21,"macarrão",1,50,u4,
				"mantimentos",1,"organico");
        
        //Adicionar anuncios na lista
        this.listaDeAnuncios.add(anuncioBebida1);
        this.listaDeAnuncios.add(anuncioBebida2);
        this.listaDeAnuncios.add(anuncioBebida3);
        this.listaDeAnuncios.add(anuncioBebida4);
        this.listaDeAnuncios.add(anuncioBebida5);
        this.listaDeAnuncios.add(anuncioBebida6);
        this.listaDeAnuncios.add(anuncioBebida7);
        this.listaDeAnuncios.add(anuncioBebida8);
        this.listaDeAnuncios.add(anuncioBebida9);
        this.listaDeAnuncios.add(anuncioBebida10);
        this.listaDeAnuncios.add(anuncioMercado1);
        this.listaDeAnuncios.add(anuncioMercado2);
        this.listaDeAnuncios.add(anuncioMercado3);
        this.listaDeAnuncios.add(anuncioMercado4);
        this.listaDeAnuncios.add(anuncioMercado5);
        this.listaDeAnuncios.add(anuncioRestaurante1);
        this.listaDeAnuncios.add(anuncioRestaurante2);
        this.listaDeAnuncios.add(anuncioRestaurante3);
        this.listaDeAnuncios.add(anuncioRestaurante4);
        this.listaDeAnuncios.add(anuncioRestaurante5);
        this.listaDeAnuncios.add(anuncioRestaurante6);
       
        
    }
    
   
    
    //CRIAR LISTAS DE FRETE-------------------------------------------------------------------------
    ArrayList<Frete> listaDeFretes = new ArrayList();
    public void criarListaFretes(){
        //CRIAR FRETES
        //Ao executar o programa, ele deve criar automaticamente pelo menos 3 fretes diferentes.
        Frete f1 = new Frete("Rapidex",90.0,2,1234);
        Frete f2 = new Frete("EntregaMix",30.0,30,6666);
        Frete f3 = new Frete("Buscape",20.0,4,6650);
        //Adicionar fretes na lista
        this.listaDeFretes.add(f1);
        this.listaDeFretes.add(f2);
        this.listaDeFretes.add(f3);
        
    }
    
    // Abaixo estão os métodos Getters e Setters
  

	public ArrayList<Usuario> getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	public void setListaDeUsuarios(ArrayList<Usuario> listaDeUsuarios) {
		this.listaDeUsuarios = listaDeUsuarios;
	}

	
	public ArrayList<UsuarioAdministrador> getListaAdm() {
		return listaAdm;
	}



	public void setListaAdm(ArrayList<UsuarioAdministrador> listaAdm) {
		this.listaAdm = listaAdm;
	}



	public ArrayList<Anuncio> getListaDeAnuncios() {
		return listaDeAnuncios;
	}

	public void setListaDeAnuncios(ArrayList<Anuncio> listaDeAnuncios) {
		this.listaDeAnuncios = listaDeAnuncios;
	}

	public ArrayList<Frete> getListaDeFretes() {
		return listaDeFretes;
	}

	public void setListaDeFretes(ArrayList<Frete> listaDeFretes) {
		this.listaDeFretes = listaDeFretes;
	}
    
    
    
}
