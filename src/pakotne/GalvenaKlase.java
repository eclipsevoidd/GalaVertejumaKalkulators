package pakotne;

public class GalvenaKlase {
	
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
				MetozuKlase.glabatFaila();
				break;
			case 10:
				MetozuKlase.lasitFailu();
				break;
			case 11:
				System.out.println("Visu labu!");
				default:
					System.out.println("Nav tāda opcija!");
					break;
			}
		} while(input != 11);
		
		// Ievada audzēkņu vārdus, uzvārdus
		
		
		// Definē kritērijus
			
		// Norāda katra kritērija svaru
		
		// Norāda vērtējumu kādu ieguvis katrs audzēknis par katru kritēriju
		
		
		// Gala vērtējumu izvadīšana
	}
}