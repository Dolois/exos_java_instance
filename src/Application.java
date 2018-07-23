import java.util.Scanner;

public class Application 
{

	public static void main(String[] args) throws InterruptedException 
	{
		char reponse = 'O';
		while (reponse == 'O')
		{
			String retourCafe;
		
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);

			boolean cafe = false;
			boolean eau = false;
			boolean bouton = false;

			for (int i = 1; i < 4; i++)
			{
				System.out.print("Entrez true ou false : ");
				if (i == 1)
					cafe = sc.nextBoolean();
				if (i == 2)
					eau = sc.nextBoolean();
				if (i == 3)
					bouton = sc.nextBoolean();
			}
			System.out.println();
		
			// Création d'une instance cuisineSimplon de la classe Cuisine
			Cuisine cuisineSimplon = new Cuisine();
		
			// cuisineSimplon est le nom de l'instance de la classe Cuisine.
			// l'opérateur . (point) permet d'accèder a la variable tasse.
			cuisineSimplon.tasse	= "tasseSimplon";
			cuisineSimplon.prenom	= "Pierre";
			cuisineSimplon.nom		= "Peter-Pan";
				
			// appelle de la méthode machineCafe 
			// de l'instance cuisineSimplon de la classe Cuisine
			// et on stocke son resultat		
			// retour  =       instance.méthode(passons 3 arguments)
			if (cuisineSimplon.prenom == "Pierre")
			{
				retourCafe = cuisineSimplon.machineCafe(cafe, eau, bouton);
				System.out.println(retourCafe);
			}
		
			// Création d'une instance cuisineDominick de la classe Cuisine
			Cuisine cuisineDominick = new Cuisine();
		
			cuisineDominick.tasse	= "tasseDolois";
			cuisineDominick.prenom	= "Dominick";
			cuisineDominick.nom		= "Loisel";
		
			// appelle de la méthode machineCafe 
			// de l'instance cuisinePierre de la classe Cuisine
			// et on stocke son resultat
			// retour  =       instance.méthode(passons 3 arguments)
			if (cuisineDominick.prenom == "Dominick")
			{
				retourCafe = cuisineDominick.machineCafe(cafe, eau, bouton);
				System.out.println(retourCafe);
			}
			System.out.println();
			System.out.println("Voulez vous recommencer O/N : ");
			reponse = sc1.nextLine().charAt(0);
			System.out.println("reponse : " + reponse);
		}
	}
}
