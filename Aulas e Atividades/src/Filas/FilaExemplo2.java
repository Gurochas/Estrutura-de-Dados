package Filas;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo2 {
	public static void main (String [] args)
	{
		Queue<String> waitingQueue = new LinkedList<>();
		
		waitingQueue.add("Vagnin");
		waitingQueue.add("Gustavo");
		waitingQueue.add("Pedro");
		waitingQueue.add("Luquinhas");
		waitingQueue.add("Dennis");
		
		System.out.println("Fila: " + waitingQueue);
		
		System.out.println("A fila está vazia? :  " + waitingQueue.isEmpty());
		
		System.out.println("Tamanho da fila : "+ waitingQueue.size());
		
		String name = "Luquinhas";
		if(waitingQueue.contains(name)){
			System.out.println("Fila contem: " + name);
		}else{
			System.out.println("Fila não contem: " + name);
		}
		
		String firstPersonInWaintingQueue = waitingQueue.element();
		System.out.println("Primeira pessoa da fila (element()) : " + firstPersonInWaintingQueue);
		
		firstPersonInWaintingQueue = waitingQueue.peek();
		System.out.println("Primeira pessoa da fila : " + firstPersonInWaintingQueue);
	}

}
