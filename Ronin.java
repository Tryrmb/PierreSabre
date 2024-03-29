package personnages;

public class Ronin extends Humain{
	private int honneur;
	
	public Ronin(String nom, int argent) {
        super(nom, "shochu", argent);
        this.honneur = 1;
    }
	
	 public void donner(Commercant beneficiaire) {
	        int argentDonne = getArgent() / 10;
	        beneficiaire.gagnerArgent(argentDonne);
	        perdreArgent(argentDonne);
	        beneficiaire.parler(argentDonne + " sous ! Je te remercie généreux donateur!");
	    }
	 
	 public void provoquer(Yakuza adversaire) {
	        int force = honneur * 2;
	        if (force >= adversaire.getReputation()) {
	            gagnerDuel(adversaire);
	        } else {
	            perdreDuel(adversaire);
	        }
	    }
	 
	 private void gagnerDuel(Yakuza adversaire) {
	        argent += adversaire.getArgent();
	        parler("Je t’ai eu petit yakusa!");
	        adversaire.perdre();
	        honneur++;
	    }

	    private void perdreDuel(Yakuza adversaire) {
	        honneur--;
	        argent = 0;
	        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
	    }
}
