package controller;

import model.Fila_Atendimento;
import model.TabelaHash;

public interface ICadastrosController {
	
	//Editar Atendimentos 
	public Fila_Atendimento addAtendimento(TabelaHash tClientes, Fila_Atendimento fAtendimentos);
	public void verificarAtendimentos (Fila_Atendimento fAtendimentos);
	public Fila_Atendimento finalizaAtendimento(Fila_Atendimento fAtendimentos);
	//Editar Cadastros (Clientes e Pets)
	public TabelaHash editCadastros(TabelaHash tClientes);
	//Ordenar cadastros de clientes
	public TabelaHash ordenaCadastros(TabelaHash tClientes);

}
