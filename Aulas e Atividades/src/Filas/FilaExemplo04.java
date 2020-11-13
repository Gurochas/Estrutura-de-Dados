package Filas;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo04 {
	public static void main(String[] args){
		
//		Queue<Integer> fila = new LinkedList<>();
		Queue<Funcionario> fila_funcionario = new LinkedList<>();

//		for (int i=0; i<5; i++) fila.add(i);
		fila_funcionario.add(new Funcionario("Vagnin", "2"));
		fila_funcionario.add(new Funcionario("Gustavo", "4"));
		fila_funcionario.add(new Funcionario("Pedrão", "5"));
		fila_funcionario.add(new Funcionario("Dennis", "1"));
		fila_funcionario.add(new Funcionario("Lucao", "7"));	
		
//		System.out.println( "Elementos da Fila: " + fila);
		System.out.println("Fila -> ");
		for(int i=0; i < fila_funcionario.size(); i++){
			System.out.print(fila_funcionario.poll().getNome() + " ");
		}
		System.out.println(" ");
		
//		int elemento_removido = fila.remove();
//		System.out.println( "Elemento Removido: " + elemento_removido);
		Funcionario funcionario_removido = fila_funcionario.remove();
		System.out.println( "Elemento Removido: " + funcionario_removido.getNome());
		System.out.println("Fila -> ");
		for(int i=0; i < fila_funcionario.size(); i++){
			System.out.print(fila_funcionario.element().getNome() + " ");
		}
		System.out.println(" ");

//		int head = fila.peek();
//		System.out.println( "Cabeça da Fila: " + head);
		Funcionario head = fila_funcionario.peek();
		System.out.println( "Cabeça da Fila: " + head.getNome());
		
//		int tamanho = fila.size();
//		System.out.println( "Tamanho da Fila: " + tamanho);
		int tamanho = fila_funcionario.size();
		System.out.println( "Tamanho da Fila: " + tamanho);
	
	}
}