package controller;

import java.io.IOException;

import model.Cliente;
import model.Lista_Cliente;
import model.Pet;
import model.TabelaHash;

public interface IArquivosController {

	//Inicializa o diretório TEMP e cria o registro txt de clientes e pets
	public void inicializaDirTemp() throws IOException;
	//Realiza a leitura de Clientes.txt e o registra na tabela hash
	public TabelaHash leituraClientes(TabelaHash tabelaClientes) throws IOException;
	//Realiza a leitura de Pets.txt e o registra na tabela hash
	public TabelaHash leituraPets(TabelaHash tabelaClientes) throws IOException;
	//Escreve o conteudo do cliente enviado no arquivo Cliente.txt
	public void insereCadastroCliente(Cliente cliente) throws IOException;
	//Escreve o conteudo do pet enviado no arquivo Pet.txt
	public void insereCadastroPet(Pet pet) throws IOException;
	//Escreve a lista de clientes ordenada em um arquivo Nome_do_algoritmo_de_ordenação.txt
	public void ordenaCadastroCliente(Lista_Cliente lista, String algoritmo) throws IOException;
	
}
