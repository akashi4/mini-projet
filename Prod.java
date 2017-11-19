package mini_projet;



	public class Prod extends Employe { //producteur=technicien
		protected int unite_produit;
		
		public void setUnite_produit(int i) {unite_produit=i;}
		public double salaire() {
			return  5*unite_produit+salaire;
			}
		
		public Prod() {}

		public Prod(String nom, String prenom, String matricule, int age, String  date) {
		super(nom, prenom, matricule, age, date);}
	}	
	
	
	class  Prod_danger extends Prod implements I1 {
		 
			public Prod_danger(String nom, String prenom, String matricule, int age, String  date) {
				super(nom, prenom, matricule, age, date);
				}
			public double salaire(){			
			return(5*unite_produit)+prime+salaire;
			 }
	}
