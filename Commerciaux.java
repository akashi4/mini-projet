package mini_projet;


public   class Commerciaux extends Employe {
	protected double  chiffre_affaire;
	public void setChiffre_affaire(int i) {chiffre_affaire=i;}

	 public Commerciaux() {}

	 
	 public Commerciaux(String nom, String prenom, String matricule, int age, String  date) {
		super(nom, prenom, matricule, age, date);
		
	}
	 public double salaire() {
		 return (0.2*chiffre_affaire)+salaire;
		  }
	
}
