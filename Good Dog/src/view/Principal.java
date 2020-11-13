package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.ArquivosController;
import controller.CadastrosController;
import controller.IArquivosController;
import controller.ICadastrosController;
import model.Fila_Atendimento;
import model.TabelaHash;

public class Principal {
	
	public static void main (String [] args)
	{
		TabelaHash tClientes = new TabelaHash();
		IArquivosController arquivos = new ArquivosController();
		Fila_Atendimento fAtendimentos = new Fila_Atendimento();
		ICadastrosController cCadastros = new CadastrosController();
		
		try {
			arquivos.inicializaDirTemp();//Inicializa o diret�rio e cria os arquivos de dados
			arquivos.leituraClientes(tClientes);
			arquivos.leituraPets(tClientes);////Se houver, realiza a leitura dos clientes, pets e armazena na tabela hash
		} catch (IOException e) {
			e.printStackTrace();
		}//Inicializa o diret�rio temp com seus arquivos txt.
		
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("\tPetShop - GOOD DOG\n\t Digite uma op��o\n \n"
																				   + " 1 - Adicionar atendimento \n"
																				   + " 2 - Verificar lista de atendimentos \n"
																				   + " 3 - Finalizar atendimento \n"
																				   + " 4 - Editar cadastros \n"
																				   + " 5 - Ordenar cadastros \n"
																				   + " 9 - Sair \n "));
			switch (opc) {
				case 1:
					fAtendimentos = cCadastros.addAtendimento(tClientes, fAtendimentos);
					break;
				case 2:
					cCadastros.verificarAtendimentos(fAtendimentos);
					break;
				case 3:
					fAtendimentos = cCadastros.finalizaAtendimento(fAtendimentos);
					break;
				case 4:
					tClientes = cCadastros.editCadastros(tClientes);
					break;
				case 5:
					tClientes = cCadastros.ordenaCadastros(tClientes);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "ENCERRANDO", "Finalizar", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Valor inv�lido", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}