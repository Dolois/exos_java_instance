
public class Cuisine {

	String tasse;
	String nom;
	String prenom;

	String machineCafe(boolean cafe, boolean eau, boolean bouton) throws InterruptedException
	{
		String message = "";
		if (prenom == "Pierre" || prenom == "Dominick")
		{
			if (!cafe && !eau && !bouton)
				message = prenom + ", mets du caf�, ajoutes de l'eau et appuies sur le bouton On de la machine";
			Thread.sleep(1000);
			if (cafe && !eau && !bouton)
				message = prenom + ", ajoutes de l'eau et appuies sur le bouton On de la machine";
			Thread.sleep(1000);
			if (!cafe && eau && !bouton)
				message = prenom + ", mets du caf� et appuies sur le bouton On de la machine";
			Thread.sleep(1000);
			if (!cafe && !eau && bouton)
				message = prenom + ", mets du caf� et Ajoutes de l'eau";
			Thread.sleep(1000);
			if (cafe && eau && !bouton)
				message = prenom + ", appuies sur le bouton On de la machine";
			Thread.sleep(1000);
			if (cafe && eau && bouton)
				message = prenom + ", ton caf� est pr�t !!";
			Thread.sleep(2000);
		}
		return message;
	}
}
