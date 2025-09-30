package pakotne;

import java.io.IOException;
import java.io.PrintWriter;

public class GalvenaKlase {
	
	static PrintWriter pw;
	
	static void glabatFaila() throws IOException {
		pw = new PrintWriter("dati.txt");
		for(int i=0; i<MetozuKlase.studenti.length; i++) {
			for(int j=0; j<MetozuKlase.kriteriji.length; j++) {
				pw.println("Studenta "+MetozuKlase.studenti[i]+" vērtējums par kritēriju "+
			MetozuKlase.kriteriji[j]+" ir "+MetozuKlase.kriterijaVertejums[i][j]+", kura svars ir "+MetozuKlase.kriterijaSvars[j]);
			}
			pw.println("Semestra vērtējums ir "+MetozuKlase.df.format(MetozuKlase.semestraVertejums[i])+" balles"
					+ "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		}
	}
	
	static void lasitFailu() {
		
	}
	
	public static void main(String[] args) {
		int input;
		do {
			System.out.println("1. Ievadīt audzēkņus\n2. Ievadīt kritērijus\n"
					 + "3. Ievadīt kritēriju svarus\n4. Ievadīt vērtejumus\n"
					 + "5. Labot kritēriju\n6. Labot kritērija svaru\n"
					 + "7. Labot iegūto vērtējumu\n8. Aprēķināt gala vērtējumu\n"
					 + "9. Saglabāt rezultātus failā\n10. Nolasīt rezultātus no faila\n11. Beigt programmu");
			input = MetozuKlase.scan.nextInt();
			
			switch(input) {
			case 1:
				MetozuKlase.ievaditAudzeknus();
				break;
			case 2:
				MetozuKlase.ievaditKriterijus();
				break;
			case 3:
				MetozuKlase.ievaditKritSvarus();
				break;
			case 4:
				MetozuKlase.ievaditVertejumus();
				break;
			case 5:
				MetozuKlase.labotKriteriju();
				break;
			case 6:
				MetozuKlase.labotKritSvaru();
				break;
			case 7:
				MetozuKlase.labotIegutoVertejumu();
				break;
			case 8:
				MetozuKlase.aprekins();
				break;
			case 9:
				try {
					glabatFaila();
				} catch (IOException e) {
					System.out.println("Kautkas neiet kopā...");
				}
				break;
			case 10:
				lasitFailu();
				break;
			case 11:
				System.out.println("Visu labu!");
				default:
					System.out.println("Nav tāda opcija!");
					break;
			}
		} while(input != 11);
		
	}
}