package pakotne;

public class VertejumuAprekinasana {
	
	static void aprekins() {
		double rezultats;
		for(int i=0; i<GalvenaKlase.studenti.length; i++) {
			rezultats=0;
			for(int j=0; j<GalvenaKlase.kriteriji.length; j++) {
				rezultats += ((double) GalvenaKlase.kriterijaSvars[j]/100)* GalvenaKlase.kriterijaVertejums[i][j];
			}
			GalvenaKlase.semestraVertejums[i] = rezultats;
		}
	}
	
}
