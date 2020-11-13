
package Lista_Ex01;

public class Celula {
	Aluno Elem;
	Celula Next;
	
	public Celula(Aluno Elem) {
		this.Elem = Elem;
		this.Next = null;
	}

	public Aluno getElem() {
		return Elem;
	}

	public void setElem(Aluno elem) {
		Elem = elem;
	}

	public Celula getNext() {
		return Next;
	}

	public void setNext(Celula next) {
		Next = next;
	}

}
