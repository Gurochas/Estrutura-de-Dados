package Lista_Com_Vetor;

public class Vetor {
	
	private Object [] objetos = new Object[5];
	private int totalDeObjetos = 0;
	
	public void adiciona(Object objeto) {
		garantaEspaço();
		objetos[this.totalDeObjetos] = objeto;
		totalDeObjetos++;
	}
	
	
	public void adiciona(int posicao, Object objeto) {
		this.garantaEspaço();
		if(!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for (int i = totalDeObjetos - 1; i >= posicao; i--) {
			objetos[i+1]=objetos[i];
		}
		
		objetos[posicao] = objeto;
		totalDeObjetos++;
	}
	
	
	public Object pega (int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return objetos[posicao];
	}
	
	
	public void remove(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i = posicao; i < totalDeObjetos - 1; i++) {
			objetos[i] = objetos[i+1];
		}
		totalDeObjetos--;
	}
	
	
	public boolean contem (Object objeto) {
		for (int i = 0; i < totalDeObjetos; i++) {
			if(objeto.equals(objetos[i])) {
				return true;
			}
		}
		return false;
	}
	
	
	public int tamanho() {
		return totalDeObjetos;
	}
	
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeObjetos;
	}
	
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeObjetos;
	}
	
	
	private void garantaEspaço() {
		if (totalDeObjetos == objetos.length) {
			Object [] novaArray = new Object [objetos.length * 2];
			for(int i = 0; i < objetos.length; i++) {
				novaArray[i] = objetos[i];
			}
			objetos = novaArray;
		}
	}
	
}
