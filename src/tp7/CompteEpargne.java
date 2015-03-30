package tp7;

public class CompteEpargne extends Compte {
	private double tauxInteret;
	
	public CompteEpargne(Client unClient , int unNumero, double unSolde, double unTauxDInteret){
		super(unClient,unNumero,unSolde);
		this.tauxInteret = unTauxDInteret;
	}
	public CompteEpargne(){
	}
	
	//getter setters
	public double getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	
	
	
	//methode
	
	//get solde redefinit calcul avec interet
	public double getSolde(){
		double result = (super.getSolde() * tauxInteret) / 100;
		return result;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+"CompteEpargne [tauxInteret=" + tauxInteret + "]";
	}
}
