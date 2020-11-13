package Pilhas;

public class Livro {
	String Titulo;
	String Autor;
	int NumReg;
	double Preco;
	Livro Last;
	
	Livro(String Titulo, String Autor, int NumReg, double Preco){
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.NumReg = NumReg;
		this.Preco = Preco;
		this.Last = null;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getNumReg() {
		return NumReg;
	}

	public void setNumReg(int numReg) {
		NumReg = numReg;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	public Livro getLast() {
		return Last;
	}

	public void setLast(Livro last) {
		Last = last;
	}
	
	public String imprimirDados() {
		return ("Titulo  : " + Titulo + "\n" +
				"Autor   : " + Autor + "\n" +
				"Registo : " + NumReg + "\n" + 
				"Preço   : " + Preco);
	}
	
}
