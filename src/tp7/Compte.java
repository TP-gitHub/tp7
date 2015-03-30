package tp7;

public class Compte {
	private Client client;
	private int numero;
	private double solde;
	
	public Compte(Client unClient, int unNumero, double unSolde){
		this.client = unClient;
		this.numero = unNumero;
		this.solde = unSolde;
	}
	public Compte(){
	}
	// getters setters
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	
	// methodes
	public void crediterSolde(int somme){
		
	}
	
	//toString
	@Override
	public String toString() {
		return "Compte [client=" + client + ", numero=" + numero + ", solde="
				+ solde + "]";
	}
	
	
	
}