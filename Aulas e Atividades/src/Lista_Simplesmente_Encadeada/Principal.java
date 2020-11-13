package Lista_Simplesmente_Encadeada;

public class Principal {
	
	public static void main (String [] args) 
	{
		ListaSimples lista = new ListaSimples();
		
		Aluno a1 = new Aluno("Gustavo","7456",21);
		Aluno a2 = new Aluno("Gabriel","9571",25);
		Aluno a3 = new Aluno("Henrique","1562",68);
		Aluno a4 = new Aluno("Lucas","4158",22);
		Aluno a5 = new Aluno("Dennis","4564",19);
		Aluno a6 = new Aluno("Vagner","6528",20);
		Aluno a7 = new Aluno("Pedro","5921",23);
		
		if (lista.verfVazia()) System.out.println("A lista está vazia."); 
		
		System.out.println("\nO tamanho da lista é de : " + lista.getSize() + " elementos.");
		
		lista.addInicio(a3);
		
		System.out.println("\nO tamanho da lista é de : " + lista.getSize() + " elementos.");
		
		System.out.println("\n1 - " + lista.mostraLista());
		
		lista.removeLista("Henrique");
		
		lista.addFinal(a1);
		lista.addInicio(a2);
		lista.addInicio(a3);
		lista.addInicio(a4);
		lista.addInicio(a5);
		lista.addInicio(a6);
		
		System.out.println("\nO tamanho da lista é de : " + lista.getSize() + " elementos.");
		
		System.out.println("\n2 - " + lista.mostraLista());
		
		if(!lista.existeLista("Pedro") || lista.consultaLista("Pedro") == null) 
			System.out.println("\nO nome não foi encontrado");
		
		System.out.println("\nO tamanho da lista é de : " + lista.getSize() + " elementos.");
		
		System.out.println("\n3 - " + lista.mostraLista());
		
		lista.addFinal(a7);
		
		if(lista.existeLista("Pedro")) {
			System.out.println("\nO aluno foi encontrado: \n" + lista.consultaLista("Pedro").imprimirDados());
		}
		
		if (lista.removeLista("Vagner")) System.out.println("\nAluno removido com sucesso.");
		if (lista.removeLista("Pedro")) System.out.println("Aluno removido com sucesso.");
		if (lista.removeLista("Henrique")) System.out.println("Aluno removido com sucesso.");
		if (!lista.removeLista("Luiz")) System.out.println("Aluno não encontrado.");
		
		System.out.println("\nO tamanho da lista é de : " + lista.getSize() + " elementos.");
		
		System.out.println("\n4 - " + lista.mostraLista());
		
		if (!lista.verfVazia()) System.out.println("\nA lista está preenchida"); 
	
	}
	

}
