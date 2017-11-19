package mini_projet;



public class Vendeur extends Commerciaux {
	
	private int bonusv=100;

	public Vendeur() {
		// TODO Auto-generated constructor stub
	}

	public Vendeur(String nom, String prenom, String matricule, int age, String  date) {
		super(nom, prenom, matricule, age, date);
		// TODO Auto-generated constructor stub
	}
	public double salaire() {
		return ((0.2*chiffre_affaire)+salaire+bonusv);
			}
}
