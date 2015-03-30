package tp7;

import java.util.ArrayList;

public class Client {
	private String nom;
	private String prenom;
	private ArrayList<Compte> lesComptes;
	
	public Client(String unNom , String unPrenom){
		this.nom = unNom;
		this.prenom = unPrenom;
		this.lesComptes = new ArrayList<Compte>();
	}
	public Client(){
	}

	//getters setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public ArrayList<Compte> getLesComptes() {
		return lesComptes;
	}

	public void setLesComptes(ArrayList<Compte> lesComptes) {
		this.lesComptes = lesComptes;
	}
	
	// methode
	public int getSolde(){
		int result = 0;
		for(Compte c : lesComptes){
			
		}
		return result;
		
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", lesComptes="
				+ lesComptes + "]";
	}
}
