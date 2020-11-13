package controller;

import java.io.IOException;

import javax.swing.JOptionPane;

import model.Atendimento;
import model.Cliente;
import model.Fila_Atendimento;
import model.Lista_Pets;
import model.Pet;
import model.TabelaHash;

public class CadastrosController implements ICadastrosController {
	
//---------------------------------------------------------------------------------------------------------------------- Editar Atendimentos
	@Override
	public Fila_Atendimento addAtendimento(TabelaHash tClientes, Fila_Atendimento fAtendimentos) {
		Cliente cliente = autenticarCliente(tClientes);
		if (cliente == null) return fAtendimentos;
		String serviço = JOptionPane.showInputDialog("Insira o serviço a ser realizado");
		Atendimento atendimento = new Atendimento(cliente, serviço);
		fAtendimentos.add(atendimento);
		JOptionPane.showMessageDialog(null, "Atendimento cadastrado com sucesso");
		return fAtendimentos;
	}//Adicionar novo atendimento
	
	@Override
	public void verificarAtendimentos(Fila_Atendimento fAtendimentos) {
		System.out.println(fAtendimentos.mostraFila());
	}//Mostrar lista de atendimentos

	@Override
	public Fila_Atendimento finalizaAtendimento(Fila_Atendimento fAtendimentos) {
		fAtendimentos.remove();
		JOptionPane.showMessageDialog(null, "Atendimento encerrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		return fAtendimentos;
	}//Remove um atendimento do começo da fila 
	
//------------------------------------------------------------------------------------------------------- Editar Cadastros (Clientes e Pets)
	@Override
	public TabelaHash editCadastros(TabelaHash tClientes) {
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("\tPetShop - GOOD DOG\n\t Digite uma opção\n \n"
																				   + " 1 - Adicionar cliente \n"
																				   + " 2 - Verificar clientes cadastrados \n"
																				   + " 3 - Remover cliente \n"
																				   + " 4 - Adicionar novo pet \n"
																				   + " 5 - Verificar pets cadastrados \n"
																				   + " 6 - Remover pet \n"
																				   + " 9 - Voltar ao menu principal \n "));
			switch (opc) {
				case 1:
					addCliente(tClientes);
					break;
				case 2:
					verificarClientes(tClientes);
					break;
				case 3:
					tClientes = removeCliente(tClientes);
					break;
				case 4:
					tClientes = addPet(tClientes);
					break;
				case 5:
					verificarPets(tClientes);
					break;
				case 6:
					tClientes = removePet(tClientes);
					break;
				case 9: return tClientes;
				default:
					JOptionPane.showMessageDialog(null, "Valor inválido", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
		return tClientes;
	}
	
//-------------------------------------------------------------------------------------------------------------------------- Editar Clientes
	private TabelaHash addCliente(TabelaHash tClientes) {
		Cliente cliente = new Cliente();
		Pet pet = new Pet();
		cliente.setNome(JOptionPane.showInputDialog("Insira o nome do cliente"));
		cliente.setCpf(JOptionPane.showInputDialog("Insira o cpf do cliente"));
		cliente.setEndereço(JOptionPane.showInputDialog("Insira o endereço do cliente"));
		cliente.setTelefone(JOptionPane.showInputDialog("Insira o numero de telefone do cliente"));
		cliente.setNumReg(Integer.parseInt(JOptionPane.showInputDialog("Insira o número de registro do cliente")));
		JOptionPane.showMessageDialog(null, "Registro de Pet");
		pet.setNumIdentificacao(cliente.getNumReg());
		pet.setNome(JOptionPane.showInputDialog("Insira o nome do pet"));
		pet.setAnimal(JOptionPane.showInputDialog("Insira o tipo do pet"));
		pet.setRaça(JOptionPane.showInputDialog("Insira o raça do pet"));
		pet.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do pet")));
		pet.setSexo(JOptionPane.showInputDialog("Insira o sexo do pet"));
		cliente.getListaPets().addPet(pet);
		tClientes.addTabela(cliente);
		IArquivosController arquivos = new ArquivosController();
		try {
			arquivos.insereCadastroCliente(cliente);
			arquivos.insereCadastroPet(pet);//Registra o cliente e o pet no txt
		} catch (IOException e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		return tClientes;
	}//Adiciona um cliente e seu pet ao registro
	
	private void verificarClientes(TabelaHash tClientes) {
		tClientes.mostraRegistros();
	}//Exibe o nome de todos os clientes contidos no registro
	
	private TabelaHash removeCliente(TabelaHash tClientes) {
		Cliente cliente = autenticarCliente(tClientes);
		if (cliente == null) return tClientes;
		tClientes.removeTabela(cliente);
		JOptionPane.showMessageDialog(null, "Cliente removido com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		return tClientes;
	}//Remove um Cliente do registro
	
//------------------------------------------------------------------------------------------------------------------------------ Editar Pets
	private TabelaHash addPet(TabelaHash tClientes) {
		Cliente cliente = autenticarCliente(tClientes);
		if (cliente == null) return tClientes;
		Pet pet = new Pet();
		pet.setNumIdentificacao(cliente.getNumReg());
		pet.setNome(JOptionPane.showInputDialog("Insira o nome do pet"));
		pet.setAnimal(JOptionPane.showInputDialog("Insira o tipo do pet"));
		pet.setRaça(JOptionPane.showInputDialog("Insira o raça do pet"));
		pet.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do pet")));
		pet.setSexo(JOptionPane.showInputDialog("Insira o sexo do pet"));
		Lista_Pets lPets = cliente.getListaPets();
		lPets.addPet(pet);
		cliente.setListaPets(lPets);
		tClientes.editarTabela(cliente);
		IArquivosController arquivos = new ArquivosController();
		try {
			arquivos.insereCadastroPet(pet);
		} catch (IOException e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Pet adicionado com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		return tClientes;
	}//Adiciona um novo Pet a um cliente
	
	private void verificarPets(TabelaHash tClientes) {
		Cliente cliente = autenticarCliente(tClientes);
		if (cliente == null) return;
		System.out.println(cliente.getListaPets().mostraLista());
	}//Mostra todos os pets cadastrados nesse cliente
	
	private TabelaHash removePet(TabelaHash tClientes) {
		Cliente cliente = autenticarCliente(tClientes);
		if (cliente == null) return tClientes;
		String nome = JOptionPane.showInputDialog("Insira o nome do pet a ser retirado");
		Lista_Pets lPets = cliente.getListaPets();
		if(!lPets.existeLista(nome)) 
			 JOptionPane.showMessageDialog(null, "Pet não encontrado", "ERROR", JOptionPane.WARNING_MESSAGE);
		else {
			lPets.removePet(nome);
			cliente.setListaPets(lPets);
			tClientes.editarTabela(cliente);
			JOptionPane.showMessageDialog(null, "Pet removido com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
		}
		return tClientes;
	}// Remove o registro de um dos pets de um cliente
	
	private Cliente autenticarCliente(TabelaHash tClientes) {
		Cliente cliente = tClientes.buscaNome(JOptionPane.showInputDialog("Insira o nome do cliente"));
		if (cliente == null) {
			JOptionPane.showMessageDialog(null, "Cliente não encontrado", "ERROR", JOptionPane.WARNING_MESSAGE);
			return null;
		}
		return cliente;
	}//Valida se cliente se encontra no registro
	
//--------------------------------------------------------------------------------------------------- Exibe opções de ordenação dos Clientes
	@Override
	public TabelaHash ordenaCadastros(TabelaHash tClientes) {
		OrdenaCao ordenar = new OrdenaCao();
		LogDesempenho log = new LogDesempenho();
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("\tPetShop - GOOD DOG\n\t Digite uma opção\n \n"
																				   + " 1 - Selection Sort \n"
																				   + " 2 - Quick Sort \n"
																				   + " 3 - Merge Sort \n"
																				   + " 9 - Voltar ao menu principal \n "));
			switch (opc) {
				case 1:
					log.setTempoInicial(System.nanoTime());
					ordenar.selectionSort(tClientes);
					log.setTempoFinal(System.nanoTime());
					try {
						log.gerarLog("SelectionSort");
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 2:
					log.setTempoInicial(System.nanoTime());
					ordenar.quickSort(tClientes);
					log.setTempoFinal(System.nanoTime());
					try {
						log.gerarLog("QuickSort");
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 3:
					log.setTempoInicial(System.nanoTime());
					ordenar.mergeSort(tClientes);
					log.setTempoFinal(System.nanoTime());
					try {
						log.gerarLog("MergeSort");
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 9: break;
				default:
					JOptionPane.showMessageDialog(null, "Valor inválido", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
		return tClientes;
	}
	
}