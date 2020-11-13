package Lista_Sequencial;

public class ListaSequencial {
    
	private Object[] lista_de_objetos = new Object[5];
    private int total_de_objetos_na_lista = 0;
    
    public void adiciona(Object objeto) {
		garantaEspaco();
		lista_de_objetos[total_de_objetos_na_lista] = objeto;
		total_de_objetos_na_lista++;
	}
	
	public void adiciona(int posicao, Object objeto) {
		garantaEspaco();
		if(!posicaoValida(posicao)){
			throw new IllegalArgumentException("Posicao invalida!!!");
		}
		for(int i = total_de_objetos_na_lista-1; i>=posicao;i--) {
			lista_de_objetos[i+1] = lista_de_objetos[i];
		}
		lista_de_objetos[posicao] = objeto;
		total_de_objetos_na_lista++;
	}
	
	public Object getObjeto(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida!!!");
		}
		return lista_de_objetos[posicao];
	}
	
	public void remove(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida!!!");
		}
		for(int i = posicao; i<total_de_objetos_na_lista - 1; i++) {
			lista_de_objetos[i] = lista_de_objetos[i+1];
		}
		total_de_objetos_na_lista--;
	}
	
	public boolean contem(Object objeto) {
		boolean busca = false;
		for(int i =0; i<total_de_objetos_na_lista; i++) {
			if(objeto.equals(lista_de_objetos[i]));
				busca = true;
		}
		return busca;
	}
	
	public int tamanhoLista() {
		return total_de_objetos_na_lista;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total_de_objetos_na_lista;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao <= total_de_objetos_na_lista;
	}
	
	private void garantaEspaco() {
		if(total_de_objetos_na_lista == lista_de_objetos.length) {
			Object[] nova_lista_de_objetos = new
					Object[this.lista_de_objetos.length*2];
			for(int i = 0; i<lista_de_objetos.length;i++) {
				nova_lista_de_objetos[i] = lista_de_objetos[i];
			}
			lista_de_objetos = nova_lista_de_objetos;
		}
	}
	
}
