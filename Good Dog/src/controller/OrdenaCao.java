package controller;

import java.io.IOException;

import javax.swing.JOptionPane;

import model.CelulaCliente;
import model.Cliente;
import model.Lista_Cliente;
import model.TabelaHash;

public class OrdenaCao {
	
//----------------------------------------------------------------------------------------------------------------------- Selection Sort
	public void selectionSort (TabelaHash tClientes) {
		Lista_Cliente lista = inicializaListas(tClientes);
		for(CelulaCliente i = lista.getFirst(); i.getNext() != null; i = i.getNext()) {
			CelulaCliente menor = i;
			for(CelulaCliente j = i.getNext(); j != null; j = j.getNext()) {
				if(menor.getCliente().getNome().compareTo(j.getCliente().getNome()) > 0) {
					menor = j;
				}
			}
			Cliente aux = i.getCliente();
			i.setCliente(menor.getCliente());
			menor.setCliente(aux);
		}
		salvaOrdenacao(lista, "SelectionSort");
		JOptionPane.showMessageDialog(null, "Arquivos ordenados", "Aviso", JOptionPane.INFORMATION_MESSAGE);
	}

//-------------------------------------------------------------------------------------------------------------------------- Quick Sort
	public void quickSort (TabelaHash tClientes) {
		Cliente [] vet = inicializaVetor(tClientes);//Transfere tabela hash para vetor
		limitaQuick(vet, 0, vet.length-1);//Chama método de ordenação
		salvaOrdenacao(inicializaLista(vet), "QuickSort");//Salva ordenação em txt
		JOptionPane.showMessageDialog(null, "Arquivos ordenados", "Aviso", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void limitaQuick (Cliente [] vet, int esquerda, int direita) {
		if(esquerda < direita) {
			int i = ordenarQuick(vet, esquerda, direita);
			limitaQuick(vet, esquerda, i-1);
			limitaQuick(vet, i+1, direita);		
		}
	}
	
	private int ordenarQuick (Cliente [] vet, int esquerda, int direita) {
		String pivo = vet[esquerda].getNome();
		int i = esquerda + 1;
		int j = direita;
		while(i <= j){
			if(vet[i].getNome().compareTo(pivo) <= 0) i++;
			else if (vet[j].getNome().compareTo(pivo) > 0) j--;
			else if (i <= j) {
				trocarVet(vet, i, j);
				i++;
				j--;
			}
		}
		trocarVet(vet, esquerda, j);
		return j;
	}
	
	private Cliente [] trocarVet (Cliente [] vet, int i, int j) {
		Cliente aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
		return vet;
	}//Troca os valores [i] com [j]
	
//------------------------------------------------------------------------------------------------------------------------- Merge Sort
	public void mergeSort(TabelaHash tClientes) {
		Cliente [] vet = inicializaVetor(tClientes);
		Cliente [] aux = new Cliente [vet.length];
		limitaMerge(vet, aux, 0, vet.length-1);
		salvaOrdenacao(inicializaLista(vet), "MergeSort");
		JOptionPane.showMessageDialog(null, "Arquivos ordenados", "Aviso", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void limitaMerge(Cliente [] vet, Cliente [] aux, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim)/2;
			limitaMerge(vet, aux, inicio, meio);
			limitaMerge(vet, aux, inicio, meio);
			intercalaMerge(vet, aux, inicio, meio, fim);
		}
	}
	
	public void intercalaMerge(Cliente [] vet, Cliente [] aux, int inicio, int meio, int fim) {
		for(int x = inicio; x <= fim; x++) 
			aux[x] = vet[x];
		int i = inicio;
		int j = meio + 1;
		for(int x = inicio; x <= fim; x++) {
			if (i > meio) vet[x] = aux[j++];
			else if (j > fim) vet[x] = aux[i++];
			else if (aux[i].getNome().compareTo(aux[j].getNome()) < 0) vet[x] = aux[i++];
			else vet[x] = aux[j++];
		}
	}
	
//------------------------------------------------------------------ Cria e armazena o resultado dos algoritmos de ordenação em um txt
	private void salvaOrdenacao(Lista_Cliente lista, String algoritmo) {
		IArquivosController arquivos = new ArquivosController();
		try {
			arquivos.ordenaCadastroCliente(lista, algoritmo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//------------------------------------------------------------------------- Passa a tabela hash para listas e vetores para a ordenação
	private Lista_Cliente inicializaListas(TabelaHash tClientes) {
		Lista_Cliente lista = tClientes.retornaLista();
		if (lista.verfVazia()) System.out.println("A lista se encontra vazia");
		return lista;
	}//Tabela hash para lista
	
	private Lista_Cliente inicializaLista (Cliente [] vet) {
		Lista_Cliente lista = new Lista_Cliente();
		for(int i = 0; i < vet.length; i++) 
			lista.addCliente(vet[i]);
		return lista;
	}//Vetor para lista 
	
	private Cliente [] inicializaVetor(TabelaHash tClientes) {
		Lista_Cliente lista = inicializaListas(tClientes);
		Cliente [] vet = new Cliente [lista.getSize()];
		int j = 0;
		for(CelulaCliente i = lista.getFirst(); i != null; i = i.getNext()) {
			vet[j] = i.getCliente();
			j++;
		}
		return vet;
	}//Lista para vetor
}
