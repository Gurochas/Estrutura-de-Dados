package Lista_Simplesmente_Encadeada;

public class ListaSimples {
	Celula First;
	Celula Last;
	int Size;
	
	public ListaSimples() { 
		this.First = null;
		this.Last = null;
		this.Size = 0;
	}

	public Celula getFirst() {
		return First;
	}

	public void setFirst(Celula first) {
		First = first;
	}

	public Celula getLast() {
		return Last;
	}

	public void setLast(Celula last) {
		Last = last;
	}

	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}//-------------------------------------------------------------------------------------------------------------------
	
	public void addInicio(Aluno aluno) {
		Celula temp = new Celula(aluno);
		if(verfVazia()){
			setLast(temp);
		}
		temp.setNext(First);
		setFirst(temp);
		Size++;
	}//Adiciona um elemento ao início da lista.
	
	public void addFinal(Aluno aluno) {
		Celula temp = new Celula(aluno);
		if(verfVazia()){
			setFirst(temp);
		}else {
			Last.setNext(temp);
		}
		setLast(temp);		
		Size++;
	}//Adiciona um elemento ao final da lista.
	
	public boolean removeLista (String nome) {
		Celula atual = First;
		Celula ant = null;
		if(verfVazia()) return false;
		while(atual != null && !atual.getElem().getNome().equals(nome)) {
			ant = atual;
			atual = atual.getNext();
		}
		if (atual == null) {
			return false;
		}
		if(atual == First) {
			if(atual == Last) {
				setLast(null);
			}
			setFirst(First.getNext());
		}else {
			if(atual == Last) {
				setLast(ant);
			}
			ant.setNext(atual.getNext());
		}
		Size--;
		return true;
	}//Remove um elemento da lista.
	
	public Aluno consultaLista (String nome) {
		Celula atual = First;
		while(atual != null && !atual.getElem().getNome().equals(nome)) {
			if (!atual.getElem().getNome().equals(nome)) return atual.Elem;
			atual = atual.getNext();
		}
		return null;
	}//Consulta um aluno na lista.
	
	public boolean existeLista (String nome) {
		Celula atual = First;
		while(atual != null) {
			if (atual.getElem().getNome().equals(nome)) return true;
			atual = atual.getNext();
		}
		return false;
	}//Verifica se um aluno se encontra na lista.
	
	public String mostraLista () {
		if (verfVazia()) return "A lista se encontra vazia";
		String msg = "";
		for (Celula i = First; i != null; i=i.getNext()) {
			msg+= (i.getElem().getNome() + " -> ");
		}
		return msg;
	}//Mostra todos os elementos da lista.
	
	
	public boolean verfVazia() {
		return (this.First == null);		
	}//Verifica de a lista está vazia.
	
}
