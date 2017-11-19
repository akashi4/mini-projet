package mini_projet;



public class Manu extends Employe {

	protected double nbr_heure;
	
	public void setNbr_heure(int i) {nbr_heure=i;}
	
	public double salaire() {
		return  nbr_heure*65+salaire;
		}
	
	
	public Manu() {
		this.nom="inconnu";
		this.prenom="inconnu";}

	public Manu(String nom, String prenom, String matricule, int age, String date) {
		
		super(nom, prenom, matricule, age, date) ;}

}	
	 class Manu_danger extends Manu implements I1{
		public Manu_danger() {}
		public Manu_danger(String nom, String prenom, String matricule, int age, String date) {
			
			super(nom, prenom, matricule, age, date) ;}
	
		public double salaire(){return salaire+(nbr_heure*65)+prime;}
		
	}


