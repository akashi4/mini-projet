package mini_projet;

public class Salary {

	public static void main(String[] args) {
		Personnel collection=new Personnel();
		
		Representant Akashi=new Representant("Akashi","Seijuro","00004",18,"2015");// Akashi est un representant
		Akashi.setChiffre_affaire(50000);
		Manu Indilla=new Manu("Indilla"," ","00001",25," 2011");//       Indilla est manutentière
		Indilla.setNbr_heure(36);
		Manu_danger Benoit= new Manu_danger("Benoit", "BG","BG140 ",32,"2003");//       Benoit est manutentié des produits dangereux
		Benoit.setNbr_heure(29);
		Vendeur John=new Vendeur("John", "LaMort","0000",14,"2017");//       John est un vendeur
		John.setChiffre_affaire(15000);
		Prod Dilane =new Prod("Dilane","Rec","2040",50,"1958 " );//           Dilane est un producteur
		Dilane.setUnite_produit(80);
		Prod_danger TBACK=new Prod_danger("TBACK"," DANTE"," 16F347EG",20,"1998");//       Michel est un producteur de produits dangereux
		TBACK.setUnite_produit(50);
		
		collection.ajouterEmploye(Akashi);
		collection.ajouterEmploye(Indilla);
		collection.ajouterEmploye(Benoit);
		collection.ajouterEmploye(John);
		collection.ajouterEmploye(Dilane);
		collection.ajouterEmploye(TBACK);
		collection.CalculerSalaire();
		collection.SalaireMoyen();

	}

}
