package Lista_Ex01;

import javax.swing.JOptionPane;

public class Principal {
	public static void main (String [] args)
	{
		ListaSimples lista = new ListaSimples();
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n \n1 - Adicionar um aluno a lista\n" + 
															                       	  "2 - Remover um aluno da lista\n" +
															                          "3 - Consultar aluno\n" +
															                          "4 - Mostrar lista\n" +
															                          "9 - Sair"));
			switch (opc) {
				case 1:	Aluno aluno = new Aluno(JOptionPane.showInputDialog("Digite o nome do aluno"),
												JOptionPane.showInputDialog("Digite o nome do diciplina"),
												JOptionPane.showInputDialog("Digite o número da matricula"),
												Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da p1")),
												Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da p2")),
												Float.parseFloat(JOptionPane.showInputDialog("Digite a nota Sub")),
												Float.parseFloat(JOptionPane.showInputDialog("Digite a nota Ex")));
						lista.addLista(aluno);
						JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
					break;
				case 2:	if (lista.removeLista(JOptionPane.showInputDialog("Digite o número da matricula do aluno a ser removido"))) {
							JOptionPane.showMessageDialog(null, "Aluno removido com sucesso");
						}else {
							JOptionPane.showMessageDialog(null, "Aluno não encontrado na lista", "ERRO", JOptionPane.ERROR_MESSAGE);
						}
				break; 
				case 3:	Aluno a = lista.consultaLista(JOptionPane.showInputDialog("Digite o número da matricula do aluno que deseja consultar"));
						if (a == null){
							JOptionPane.showMessageDialog(null, "Aluno não encontrado na lista", "ERRO",JOptionPane.ERROR_MESSAGE);
						}else {
							System.out.println("Aluno encontrado: \n");
							float media = (a.NotaP1 + a.NotaP2)/2;
							System.out.println(a.imprimirDados() + "\nMédia  : " + media);
						}
					break;
				case 4: System.out.println(lista.mostraLista());
					break;
				case 9: JOptionPane.showMessageDialog(null, "ENCERRANDO");
						System.exit(0);
				default:JOptionPane.showMessageDialog(null, "Valor inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}