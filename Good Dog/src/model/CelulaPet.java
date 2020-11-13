package model;

public class CelulaPet {
	
	Pet pet;
	CelulaPet next;
		
	public CelulaPet(Pet pet) {
		this.pet = pet;
		this.next = null;
	}//-------------------------------------------------- Construtor

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public CelulaPet getNext() {
		return next;
	}

	public void setNext(CelulaPet next) {
		this.next = next;
	}//------------------------------------------------------------------------ Get/Set

}