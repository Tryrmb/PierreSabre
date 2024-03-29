package personnages;

public class Yakuza extends Humain{

	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String clan, int argent) {
		super(nom, "whisky", argent);
        this.clan = clan;
        this.reputation = 0;
	}
	
	 public void extorquer(Commercant victime){
	        int argentVole = victime.seFaireExtorquer();
	        gagnerArgent(argentVole);
	        reputation++;
	        parler("J’ai piqué les " + argentVole + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	    }

	 public int perdre() {
	        int argentPerdu = argent;
	        argent = 0;
	        reputation--;
	        parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
	        return argentPerdu;
	    }

	 public void gagner(int gain) {
	        argent += gain;
	        reputation++;
	        parler("Je t'ai dépouillé de tes " + gain + " sous. Haha!");
	    }
	 
	 public int getReputation() {
	        return reputation;
	    }
}
