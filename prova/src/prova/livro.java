package prova;

public class livro extends publicacao {
	 
	
	private int numeroPaginas;
	private String editora;
	
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
	 public void exibirDetalhes () {
	    	
	    	super.exibirDetalhes ();
	    	System.out.println("A quantidade de páginas é " +numeroPaginas);
	    	System.out.println("A editora é " +editora);
	    	
	    	
	    }
	 
	 public void exibirDetalhes(boolean incluirEditora) {
		    exibirDetalhes(); 
		    
		    if (incluirEditora) {
		        System.out.println("A editora da publicação é " + editora);
		    }
		    
		   
		     }
			
		  
	 }

