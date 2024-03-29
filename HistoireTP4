package personnages;
package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
        Humain prof = new Humain("Prof", "kombucha", 54);
        prof.direBonjour();
        prof.acheter("une boisson", 12);
        prof.boire();
        prof.acheter("un jeu", 2);
        prof.acheter("un kimono", 50);
	
        Commercant marco = new Commercant("Marco", 20);
        marco.direBonjour();
        int extorsion = marco.seFaireExtorquer();
        marco.recevoir(15 - extorsion);
        marco.boire();

        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "Warsong", 30);
        yakuLeNoir.direBonjour();
        Commercant victime = marco; // Victime extorquée
        yakuLeNoir.extorquer(victime);

        Ronin roro = new Ronin("Roro", 60);
        roro.direBonjour();
        roro.donner(marco);
        
     // Scenario avec réputation initialisée à 4
        yakuLeNoir = new Yakuza("Yaku Le Noir", "Warsong", 30);
        yakuLeNoir.direBonjour();
        roro.provoquer(yakuLeNoir);
        
	}
	
}
