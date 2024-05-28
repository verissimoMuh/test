package prova;

public class main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		publicacao primeiro = new publicacao();
		
		primeiro.setTitulo("A culpa é das estrelas");
		primeiro.setAutor("murilo");
		primeiro.setAnoPublicacao(2015);
		
		livro primeiroLivro = new livro() ;
		
		primeiroLivro.setNumeroPaginas(315);
		primeiroLivro.setEditora("J.K Rowling");
		
		revista primeiraRevista = new revista();
		
		primeiraRevista.setMesPublicacao("Dezembro");
		primeiraRevista.setNumeroEdicao(23);
			
		 System.out.println("Publicação:");
	     System.out.println("Título: " + primeiro.getTitulo());
	     System.out.println("Autor: " + primeiro.getAutor());
	     System.out.println("Ano de Publicação: " + primeiro.getAnoPublicacao());
	     System.out.println();
			
		System.out.println("Livro:");
        System.out.println("Número de Páginas: " + primeiroLivro.getNumeroPaginas());
        System.out.println("Editora: " + primeiroLivro.getEditora());
        System.out.println();
        
		System.out.println("Revista:");
	    System.out.println("Mês de Publicação: " + primeiraRevista.getMesPublicacao());
	    System.out.println("Número da Edição: " + primeiraRevista.getNumeroEdicao());
			
	     
	
	
		

	}

}
