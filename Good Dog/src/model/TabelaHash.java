package model;

public class TabelaHash {
	
	Lista_Cliente [] table;
	
	public TabelaHash() {
		table = new Lista_Cliente[26];
		inicializaListas();
	}//------------------------------------------------------------------------ Construtor
	
	private void inicializaListas() {
		for(int i = 0; i < 26; i++) 
			table[i] = new Lista_Cliente();
	}//Inicializa a lista de cada chave da nossa tabela 
	
	private int funcaoHash(String nome) {
		nome = nome.toLowerCase();
		int posicao = nome.charAt(0);
		return posicao - 97;
	}//Determina em qual indice da tabela será ocupado
	
//---------------------------------------------------------------------------- Operações com a tabela
	
	public void addTabela(Cliente cliente) {
		table[funcaoHash(cliente.nome)].addCliente(cliente);
	}//Adiciona um novo cliente a tabela
	
	public void editarTabela(Cliente cliente ) {
		removeTabela(cliente);
		addTabela(cliente);
	}//Edita um cliente na nossa tabela. Removendo o antigo, e adicionando o novo
	
	public void removeTabela(Cliente cliente) {
		table[funcaoHash(cliente.nome)].removeCliente(cliente.nome);
	}//Remove um cliente da nossa lista
	
	public Lista_Cliente buscaIndice (int i) {
		return table[i];
	}//Retorna a lista de clientes de cada indice da nossa tabela
	
	public Cliente buscaNome (String nome) {
		return table[funcaoHash(nome)].consultaLista(nome);
	}//Realiza uma busca pela nossa tabela pelo nome do cliente
	
	public Cliente buscaNumReg (int numReg) {
		for(int i = 0; i < 26; i++) {
			Cliente cliente = table[i].consultaLista(numReg);
			if (cliente != null) return cliente;
		}
		return null;
	}//Realiza uma busca na nossa tabela pelo numero de registro do cliente
	
	public void mostraRegistros () {
		String clientes = "";
		for(int i = 0; i < 26; i++) {
			clientes+= table[i].mostraLista();
		}
		if(clientes.equals("")) System.out.println("O registro de clientes se encontra vazio");
		else System.out.println(clientes);
	}//Mostra todos os clientes contidos em nossa lista
	
	public Lista_Cliente retornaLista () {
		Lista_Cliente lista = new Lista_Cliente();
		for(int i = 0; i < 26; i++) {
			for (CelulaCliente j = table[i].getFirst(); j != null; j=j.getNext()) {
				lista.addCliente(j.getCliente());
			}
		}
		return lista;
	}//Converte nossa tabela em uma longa lista de clientes
	
}
