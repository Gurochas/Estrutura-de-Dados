package Lista_Sequencial;

/*
 *Implemente a ListaSequencial apresentada na aula.
 *	• Crie uma classe Pessoa de acordo com o modelo proposto.
 *	• Crie uma classe Principal e, dentro dela, fazer os procedimentos abaixo: 
 *		o criaruma lista de pessoas;
 *		o Instanciar 10 objetos da classe Pessoa;
 *		o Escrevero tamanho da Lista de Pessoas.
 *		o Adicionaros 8 objetos da classe Pessoa à lista de pessoas;
 *	    o Escreveros nomes das pessoas que estão na lista.
 *		o Insirirum novo objeto da classe pessoa na posição 3 da lista de pessoas. 
 *		o Escreveros nomes das pessoas da Lista.
 *		o Verificarse o objeto de nome Antonio consta na lista de pessoas.
*/

public class Principal {
	
	public static void main (String args [])
	{
		
		ListaSequencial lista = new ListaSequencial();
		Pessoa p1 = new Pessoa("Gustavo");
		Pessoa p2 = new Pessoa("Dennis");
		Pessoa p3 = new Pessoa("Vagner");
		Pessoa p4 = new Pessoa("Lucas");
		Pessoa p5 = new Pessoa("Luiz");
		Pessoa p6 = new Pessoa("Augusto");
		Pessoa p7 = new Pessoa("Henrique");
		Pessoa p8 = new Pessoa("Erik");
		Pessoa p9 = new Pessoa("Diego");
		Pessoa p10 = new Pessoa("Pedro");
		
		System.out.println("A lista contem " + lista.tamanhoLista() + " objetos.");
		
		lista.adiciona(p1);
		lista.adiciona(p2);
		lista.adiciona(p3);
		lista.adiciona(p4);
		lista.adiciona(p5);
		lista.adiciona(p6);
		lista.adiciona(p7);
		lista.adiciona(p8);
		
		int tamanho = lista.tamanhoLista();
		for(int i = 0; i < tamanho; i++) {
			Pessoa nome = (Pessoa) lista.getObjeto(i);
			System.out.println(" - " + nome.getNome());
		}
		
		lista.adiciona(3, p9);
		
		tamanho = lista.tamanhoLista();
		for(int i = 0; i < tamanho; i++) {
			Pessoa nome = (Pessoa) lista.getObjeto(i);
			System.out.println(" - " + nome.getNome());
		}
		
		System.out.println("A lista contem " + lista.tamanhoLista() + " objetos.");
		
		if(lista.contem("Antonio")) System.out.println("Não contem o objeto Antonio.");
		else System.out.println("O nome antonio consta na lista.");
		
	}

}
