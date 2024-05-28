package prova;

public class publicacao {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
   

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getAnoPublicacao() {
		return anoPublicacao;
	}


	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	

	public void exibirDetalhes () {
		System.out.println("O titulo da publicação é " +titulo);
		System.out.println("O autor da publicação é " +autor);
		System.out.println("O ano da publicação é de " +anoPublicacao);
		
	
	}
	
}
