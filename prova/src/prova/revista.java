package prova;

public class revista extends publicacao {
	
	private int numeroEdicao;
	private String mesPublicacao;
	
	
	public int getNumeroEdicao() {
		return numeroEdicao;
	}
	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	public String getMesPublicacao() {
		return mesPublicacao;
	}
	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}
	
	 public void exibirDetalhes () {
	    	
	    	super.exibirDetalhes ();
	    	System.out.println("O numero da edicao é " +numeroEdicao);
	    	System.out.println("O mes de da publicação é " +mesPublicacao);
	    	
	    	  }
	 
	    public void exibirDetalhes(boolean incluirEditora) {
		    exibirDetalhes(); 
		    
		    if (incluirEditora) {
		        System.out.println("A editora da publicação é " + mesPublicacao);
		    }
		   }
}
