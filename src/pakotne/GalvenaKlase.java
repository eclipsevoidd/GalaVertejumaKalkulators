package pakotne;

// tā kā nebija pieminēts nekur par JOptionPane izmantošanu, programma realizēta termināļa vidē.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GalvenaKlase {
	
	static FileWriter fw;
	static FileReader fr;
	
	static void glabatFaila() throws IOException {
		fw = new FileWriter("dati.txt");
		for(int i=0; i<MetozuKlase.studenti.length; i++) {
			for(int j=0; j<MetozuKlase.kriteriji.length; j++) {
				fw.write("Studenta "+MetozuKlase.studenti[i]+" vērtējums par kritēriju "+
			MetozuKlase.kriteriji[j]+" ir "+MetozuKlase.kriterijaVertejums[i][j]+", kura svars ir "+MetozuKlase.kriterijaSvars[j] + ".\n");
			}
			fw.write("Semestra vērtējums ir "+MetozuKlase.df.format(MetozuKlase.semestraVertejums[i])+" balles."
					+ "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			fw.flush();
		}
	}
	
	static void lasitFailu() throws IOException {
		fr = new FileReader("dati.txt");
		int i;
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		System.out.println("\n\n\n\n");
		
	}
	
	public static void main(String[] args) throws IOException {
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
				glabatFaila();
				break;
			case 10:
				lasitFailu();
				break;
			case 11:
				System.out.println("Visu labu!");
				fw.close();
				default:
					System.out.println("Nav tāda opcija!");
					break;
			}
		} while(input != 11);
		
	}
}