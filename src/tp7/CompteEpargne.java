package tp7;

public class CompteEpargne extends Compte {
	private double tauxInteret;
	
	public CompteEpargne(Client unClient , int unNumero, int unSolde, double unTauxDInteret){
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
	public int getSolde(){
		return 0;
		
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+"CompteEpargne [tauxInteret=" + tauxInteret + "]";
	}
}
