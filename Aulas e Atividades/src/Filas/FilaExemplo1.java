package Filas;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo1 {
	public static void main (String [] args)
	{
		//Queue<String> waitingQueue = new LinkedList<>();
		Queue<Funcionario> fila_funcionario = new LinkedList<>();
		
		/*waitingQueue.add("Vagnin");
		waitingQueue.add("Gustavo");
		waitingQueue.add("Pedro");
		waitingQueue.add("Luquinhas");
		waitingQueue.add("Dennis");*/
		fila_funcionario.add(new Funcionario("Vagnin", "2"));
		fila_funcionario.add(new Funcionario("Gustavo", "4"));
		fila_funcionario.add(new Funcionario("Pedrão", "5"));
		fila_funcionario.add(new Funcionario("Dennis", "1"));
		fila_funcionario.add(new Funcionario("Lucao", "7"));	
		
		//System.out.println("Fila: " + waitingQueue);
		System.out.print("Fila -> ");
		for(int i=0; i < fila_funcionario.size(); i++){
			System.out.print(fila_funcionario.poll().getNome() + " ");
		}
		System.out.println(" ");
		
		
		/*String name = waitingQueue.remove();
		System.out.println("Removido da fila: " + name + " | Nova Fila: " + waitingQueue);*/
		Funcionario funcionario = fila_funcionario.remove();
		System.out.print("Removido da fila: " + funcionario.getNome() + " | Nova fila: ");
		for(int i=0; i < fila_funcionario.size(); i++){
			System.out.print(fila_funcionario.poll().getNome() + " ");
		}
		System.out.println(" ");
		
		/*name = waitingQueue.poll();
		System.out.println("Removido da fila: " + name + " | Nova Fila: " + waitingQueue);*/
		System.out.print("Fila -> ");
		for(int i=0; i < fila_funcionario.size(); i++){
			System.out.print(fila_funcionario.poll().getNome() + " ");
		}
		System.out.println(" ");
	}

}
