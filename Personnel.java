package mini_projet;


import java.util.LinkedList;
import java.util.List;

public class Personnel {
	
	private static List<Employe> collection;
	
	public Personnel() {
		 collection=new LinkedList<Employe>();
	}
	
	

		public  void ajouterEmploye(Employe Employe) {
			collection.add(Employe);}
	
	
		public  void  CalculerSalaire() {
			for(int i=0; i<collection.size(); i++) {
			System.out.println(collection.get(i).getNom()+" " +" a un salaire de "+ collection.get(i).salaire()+" FCFA");}
			}

	
		public  void SalaireMoyen() {
			double n=0;
			int a=0;
			for (int i=0; i<collection.size();i++) {
				n=collection.get(i).salaire()+n;
				a++;
			}
		System.out.println("Le salaire moyen des employés de la collection est de "+ n/a +" FCFA");
	}
}
