package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import model.CelulaCliente;
import model.Cliente;
import model.Lista_Cliente;
import model.Pet;
import model.TabelaHash;

public class ArquivosController implements IArquivosController{
	
	public ArquivosController() {
		super();
	}

	@Override
	public void inicializaDirTemp() throws IOException {
		File dir = new File("C:\\TEMP\\Ordenacao");
		File arqClientes = new File("C:\\TEMP\\Clientes.txt");
		File arqPets = new File("C:\\TEMP\\Pets.txt");
		if(!dir.exists()) {
			dir.mkdir();
		}//Cria o diretório c:\\temp caso não exista
		if(!arqClientes.exists()) {
			FileWriter fileWriter = new FileWriter(arqClientes, false);
			fileWriter.close();
		}//Cria o arquivo Clientes.txt caso não exista
		if(!arqPets.exists()) {
			FileWriter fileWriter = new FileWriter(arqPets, false);
			fileWriter.close();
		}//Cria o arquivo Pets.txt caso não exista
	}//Inicializa o diretório TEMP e cria o registro txt de clientes e pets

	@Override
	public TabelaHash leituraClientes(TabelaHash tabelaClientes) throws IOException {
		File arq = new File("C:\\TEMP\\Clientes.txt");
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);//Abre o arquivo
			InputStreamReader leitor = new InputStreamReader(fluxo);//Converte e lê o arquivo
			BufferedReader buffer = new BufferedReader(leitor);//Coloca o conteudo dentro do buffer
			String linha = buffer.readLine();//Reserva a primeira linha 
			linha = buffer.readLine();
			while (linha != null) { //Procurando a lnha vazia (EOF - End of File)
				Cliente cliente = new Cliente();
				cliente.setNome(linha);
				cliente.setEndereço(buffer.readLine());
				cliente.setTelefone(buffer.readLine());
				cliente.setCpf(buffer.readLine());
				cliente.setNumReg(Integer.parseInt(buffer.readLine()));
				tabelaClientes.addTabela(cliente);
				linha = buffer.readLine();
			}
			buffer.close();//Fecha o buffer
			leitor.close();//Fecha o leitor
			fluxo.close();//Fecha o arquivo
			return tabelaClientes;
		}else {
			throw new IOException("Arquivo não encontrado");
		}
	}//Realiza a leitura de Clientes.txt e o registra na tabela hash
	
	@Override
	public TabelaHash leituraPets(TabelaHash tabelaClientes) throws IOException {
		File arq = new File("C:\\TEMP\\Pets.txt");
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);//Abre o arquivo
			InputStreamReader leitor = new InputStreamReader(fluxo);//Converte e lê o arquivo
			BufferedReader buffer = new BufferedReader(leitor);//Colocava o conteudo dentro do buffer
			String linha = buffer.readLine();
			linha = buffer.readLine();
			while (linha != null) { //Procurando a lnha vazia (EOF - End of File)
				Pet pet = new Pet();
				pet.setNumIdentificacao(Integer.parseInt(linha));
				pet.setNome(buffer.readLine());
				pet.setIdade(Integer.parseInt(buffer.readLine()));
				pet.setAnimal(buffer.readLine());
				pet.setRaça(buffer.readLine());
				pet.setSexo(buffer.readLine());
				tabelaClientes.buscaNumReg(pet.getNumIdentificacao()).getListaPets().addPet(pet);
				linha = buffer.readLine();
			}
			buffer.close();//Fecha o buffer
			leitor.close();//Fecha o leitor
			fluxo.close();//Fecha o arquivo
			return tabelaClientes;
		}else {
			throw new IOException("Arquivo não encontrado");
		}
	}//Realiza a leitura de Pets.txt e o registra na tabela hash

	@Override
	public void insereCadastroCliente(Cliente cliente) throws IOException {
		inicializaDirTemp();
		File arq = new File("C:\\TEMP\\Clientes.txt");
		String conteudo = ("\r\n" + cliente.getNome() + "\r\n" + cliente.getEndereço() + "\r\n" + cliente.getTelefone() + "\r\n" + 
																cliente.getCpf() + "\r\n" + cliente.getNumReg());
		FileWriter fileWriter = new FileWriter(arq, true);//Abre o arquivo e define se vai fazer append
		PrintWriter print = new PrintWriter(fileWriter);//Inicializa a variavel que realizará a escrita
		print.write(conteudo);//Escreve o conteudo no arquivo
		print.flush();//Finaliza a escrita
		print.close();//Fecha a escrita
		fileWriter.close();//Fecha o arquivo
	}//Escreve o conteudo do cliente enviado no arquivo Cliente.txt
	
	@Override
	public void insereCadastroPet(Pet pet) throws IOException {
		inicializaDirTemp();
		File arq = new File("C:\\TEMP\\Pets.txt");
		String conteudo = ("\r\n" + pet.getNumIdentificacao() + "\r\n" + pet.getNome() + "\r\n" + pet.getIdade() + "\r\n" +
																pet.getAnimal() + "\r\n" + pet.getRaça() + "\r\n" + pet.getSexo());
		FileWriter fileWriter = new FileWriter(arq, true);//Abre o arquivo e define se vai fazer append
		PrintWriter print = new PrintWriter(fileWriter);//Inicializa a variavel que realizará a escrita
		print.write(conteudo);//Escreve o conteudo no arquivo
		print.flush();//Finaliza a escrita
		print.close();//Fecha a escrita
		fileWriter.close();//Fecha o arquivo
	}//Escreve o conteudo do pet enviado no arquivo Pet.txt
	
	@Override
	public void ordenaCadastroCliente(Lista_Cliente lista, String algoritmo) throws IOException {
		inicializaDirTemp();
		File arq = new File("C:\\TEMP\\Ordenacao\\" + algoritmo + ".txt");
		String conteudo = "";
		for (CelulaCliente i = lista.getFirst(); i != null; i=i.getNext())
			conteudo += ("\r\n" + i.getCliente().getNome() + "\r\n" + i.getCliente().getEndereço() + "\r\n" + i.getCliente().getTelefone()
					+ "\r\n" + i.getCliente().getCpf() + "\r\n" + i.getCliente().getNumReg());
		FileWriter fileWriter = new FileWriter(arq, false);//Abre o arquivo e define se vai fazer append
		PrintWriter print = new PrintWriter(fileWriter);//Inicializa a variavel que realizará a escrita
		print.write(conteudo);//Escreve o conteudo no arquivo
		print.flush();//Finaliza a escrita
		print.close();//Fecha a escrita
		fileWriter.close();//Fecha o arquivo
	}//Escreve a lista de clientes ordenada em um arquivo Nome_do_algoritmo_de_ordenação.txt

}