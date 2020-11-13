package Pilhas;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main (String [] args)
	{
		Pilha pilha = new Pilha();
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n \n1 - Empilhar um livro\n" + 
															                       	  "2 - Desempilha o ultimo livro\n" +
															                          "3 - Consultar livro do topo\n" +
															                          "4 - Verificar tamanho da pilha\n" +
															                          "9 - Sair"));
			switch (opc) {
				case 1:	Livro livro = new Livro (JOptionPane.showInputDialog("Digite o titulo do livro"),
												JOptionPane.showInputDialog("Digite o autor do livro"),
												Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de registro do livro")),
												Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do livro")));
						pilha.empilhar(livro);
						JOptionPane.showMessageDialog(null, "Livro empilhado com sucesso");
					break;
				case 2:	if (pilha.desempilhar()) {
							JOptionPane.showMessageDialog(null, "Livro desempilhado com sucesso");
						}else {
							JOptionPane.showMessageDialog(null, "Não foi possivel desempilhar o livro \n" + 
															 	"A pilha se encontra vazia", "ERRO", JOptionPane.ERROR_MESSAGE);
						}
				break; 
				case 3:	Livro l = pilha.topo();
						if (l == null){
							JOptionPane.showMessageDialog(null, "A pilha se encontra vazia", "ERRO", JOptionPane.ERROR_MESSAGE);
						}else {
							System.out.println("Livro encontrado: \n \n" + l.imprimirDados());
						}
					break;
				case 4: if(!pilha.verfVazia()) {
							System.out.println("No momento a pilha se encontra com " + pilha.getSize() + " livros");
						}else {
							System.out.println("A pilha se encontra vazia");
						}
					break;
				case 9: JOptionPane.showMessageDialog(null, "ENCERRANDO");
						System.exit(0);
				default:JOptionPane.showMessageDialog(null, "Valor inválido", "ERRO", JOptionPane.ERROR_MESSAGE, null);
			}
		}
	}
	
}
