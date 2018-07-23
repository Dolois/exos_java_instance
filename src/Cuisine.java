
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
				message = prenom + ", mets du café, ajoutes de l'eau et appuies sur le bouton On de la machine";
			Thread.sleep(1000);
			if (cafe && !eau && !bouton)
				message = prenom + ", ajoutes de l'eau et appuies sur le bouton On de la machine";
			Thread.sleep(1000);
			if (!cafe && eau && !bouton)
				message = prenom + ", mets du café et appuies sur le bouton On de la machine";
			Thread.sleep(1000);
			if (!cafe && !eau && bouton)
				message = prenom + ", mets du café et Ajoutes de l'eau";
			Thread.sleep(1000);
			if (cafe && eau && !bouton)
				message = prenom + ", appuies sur le bouton On de la machine";
			Thread.sleep(1000);
			if (cafe && eau && bouton)
				message = prenom + ", ton café est prêt !!";
			Thread.sleep(2000);
		}
		return message;
	}
}
