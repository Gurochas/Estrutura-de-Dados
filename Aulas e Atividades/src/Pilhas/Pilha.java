package Pilhas;

public class Pilha {
	
	Livro Top;
	int Size;
	
	public Pilha () {
		Top= null;
		Size = 0;
	}//------------------------Construtor
	
	public Livro getTop() {
		return Top;
	}
	public void setTop(Livro top) {
		this.Top = top;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		this.Size = size;
	}//---------------------------------
	
	public void empilhar (Livro livro) {		
		livro.setLast(getTop());
		setTop(livro);
		Size++;
	}//Empilha um livro na pilha.
	
	public boolean desempilhar () {
		if (verfVazia()) return false;
		setTop(getTop().getLast());
		Size--;
		return true;
	}//Desempilha o livro do topo.
	
	public Livro topo() {
		if (verfVazia()) return null;
		return getTop();
	}//Retorna o livro do topo da pilha.
	
	public Livro get () {
		if (verfVazia()) return null;
		Livro livro = getTop();
		setTop(getTop().getLast());
		Size--;
		return livro;
	}//Retorna o elemento no topo o desempilhando
	
	public int Tamanho () {
		return Size;
	}//Retorna o tamanho da pilha
	
	public boolean verfVazia() {
		if (getSize() == 0) return true;
		return false;
	}//Verifica se a lista se encontra vazia.

}
