package Filas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo3 {
	public static void main(String[] args) {
		
		Queue<String> waitingQueue = new LinkedList<>();

		waitingQueue.add("Vagnin");
		waitingQueue.add("Gustavo");
		waitingQueue.add("Pedro");
		waitingQueue.add("Luquinhas");
		waitingQueue.add("Dennis");
		
		System.out.println("=== Interações em uma Fila usando Java8 forEach() ===");
		waitingQueue.forEach(name ->{
			System.out.println(name);
		});
		
		System.out.println("\n=== Interações em uma Fila usando iterator() ===");
		Iterator<String> waitingQueueIterator = waitingQueue.iterator();
		while(waitingQueueIterator.hasNext()){
			String name = waitingQueueIterator.next();
			System.out.println(name);
		}
		
		System.out.println("\n=== Interações em uma Fila usando iterator() e Java8 forEachRemaining() ===");
		waitingQueueIterator = waitingQueue.iterator();
		waitingQueueIterator.forEachRemaining(name -> {
			System.out.println(name);
		});	
		
		System.out.println("\n=== Interações sobre uma Fila usando o loop for-each ===");
		for(String name : waitingQueue){
			System.out.println(name);
		}
	}
	
}
