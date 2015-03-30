package tp7;

public class CompteCourant extends Compte {
	
	private double decouvert;
	
	public CompteCourant (){

	}
	
	public CompteCourant (Client unClient, int unNumero, double unSolde, double unDecouvert){
		super(unClient,unNumero,unSolde);
		this.decouvert = unDecouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return super.toString()+"CompteCourant [decouvert=" + decouvert + "]";
	}
	
	
}
