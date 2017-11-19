package mini_projet;



public abstract class Employe {
	
	protected String nom, prenom,matricule;
	protected int age;
	protected String  date_entre;
	protected static double salaire=110000;
	public Employe() {
		nom="inconnu";
		prenom=" ";}
	
	public Employe(String nom, String prenom, String matricule, int age, String  date) {
		this.nom=nom;
		this.prenom=prenom;
		this.matricule=matricule;
		this.age=age;
		this.date_entre=date;}
	
	
	public abstract double salaire();
	
	public  String getNom() {
		return("L'employé(e) " +nom+" "+ prenom);
	}

}
