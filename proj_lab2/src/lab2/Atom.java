package lab2;

public class Atom {
	private int protons;
	private int neutrons;
	private int electrons;
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons) {
		protons = givenProtons;
		neutrons = givenNeutrons;
		electrons = givenElectrons;
	}
	public int getAtomicMass(){
		return protons + neutrons;
	}
	public int getAtomicCharge(){
		return protons - electrons;
	}
	public void decay(){
		protons = protons -2;
		neutrons = neutrons -2;
	}
}
