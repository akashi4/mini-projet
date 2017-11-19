package mini_projet;



public class Representant extends Commerciaux {
		private int bonusr=200;
	
	public double salaire() {
		return  (0.2*chiffre_affaire)+salaire+bonusr;
		}
	
	public Representant() {}

	public Representant(String nom, String prenom, String matricule, int age, String  date) {
		super(nom, prenom, matricule, age, date);
	}

	
}
