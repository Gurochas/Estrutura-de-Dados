package Lista_Ex01;

public class Aluno {
	String Nome;
	String Diciplina; 
	String numMatricula;
	float NotaP1;
	float NotaP2;
	float NotaSUB;
	float NotaEX;
	
	public Aluno(String Nome, String Diciplina, String numMatricula, 
				 float NotaP1, float NotaP2, float NotaSUB, float NotaEX) {
		this.Nome = Nome;
		this.Diciplina = Diciplina;
		this.numMatricula = numMatricula;
		this.NotaP1 = NotaP1;
		this.NotaP2 = NotaP2;
		this.NotaSUB = NotaSUB;
		this.NotaEX = NotaEX;
	}

	
	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getDiciplina() {
		return Diciplina;
	}


	public void setDiciplina(String diciplina) {
		Diciplina = diciplina;
	}


	public String getNumMatricula() {
		return numMatricula;
	}


	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}


	public float getNotaP1() {
		return NotaP1;
	}


	public void setNotaP1(float notaP1) {
		NotaP1 = notaP1;
	}


	public float getNotaP2() {
		return NotaP2;
	}


	public void setNotaP2(float notaP2) {
		NotaP2 = notaP2;
	}


	public float getNotaSUB() {
		return NotaSUB;
	}


	public void setNotaSUB(float notaSUB) {
		NotaSUB = notaSUB;
	}


	public float getNotaEX() {
		return NotaEX;
	}


	public void setNotaEX(float notaEX) {
		NotaEX = notaEX;
	}

	public String imprimirDados() {
		return ("Nome   : " + Nome + "\n" +
				"RA     : " + Diciplina + "\n" +
				"Idade  : " + numMatricula + "\n" + 
				"NotaP1 : " + NotaP1 + "\n" +
				"NotaP2 : " + NotaP2 + "\n" +
				"NotaSUB: " + NotaSUB + "\n" +
				"NotaEx : " + NotaEX);
	}
	
}