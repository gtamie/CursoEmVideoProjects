package exercicioPOO1;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro() {
		this.titulo="Duna - livro 1";
		this.autor="Frank Herbert";
		this.totPaginas=677;
		this.pagAtual=1;
		this.aberto=false;
		
			
	}
		
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


	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	

	/*public void detalhes() {
		System.out.println("Título: "+this.getTitulo()+
				"\nAutor: "+this.getAutor()+
				"\nTotal de páginas: "+this.getTotPaginas()+
				"\nPágina atual: "+this.getPagAtual()+
				"\nAberto: "+this.isAberto();
		
		
	}*/


	
	public String detalhes() {
		return "Título: " + titulo + "\nAutor: " + autor + "\nTotal de páginas: " + totPaginas +
				"\nPágina atual: " + pagAtual + "\nAberto:" + aberto + "\nLeitor: " + leitor.getNome();
	}

	@Override
	public void abrir() {
		this.setAberto(true);
		System.out.println("Livro aberto.");
		
	}


	@Override
	public void fechar() {
		this.setAberto(false);
		System.out.println("Livro fechado.");
		
	}


	@Override
	public void folhear (int n) {
		if(this.isAberto()==false)
		{
			this.setAberto(true);
		}
		this.setPagAtual(n);
		
	}


	@Override
	public void avancarPag() {
		if(this.isAberto()==false)
		{
			this.setAberto(true);
		}
		if(this.getPagAtual()<677)
		{
			this.setPagAtual(this.getPagAtual()+1);
		}
		else
		{
			this.setPagAtual(677);
		}
		System.out.println("Você está na página "+this.getPagAtual());
		
		
	}


	@Override
	public void voltarPag() {
		if(this.isAberto()==false)
		{
			this.setAberto(true);
		}
		if (this.getPagAtual()>1) 
		{
			this.setPagAtual(this.getPagAtual()-1);	
		}
		else 
		{
			this.setPagAtual(1);
		}
		System.out.println("Você está na página "+this.getPagAtual());
		
	}

}
