package pakotne;


import java.text.DecimalFormat;
import java.util.Scanner;

public class MetozuKlase {
	static String[] kriteriji;
	static int[] kriterijaSvars;
	static int[][] kriterijaVertejums;
	static double[] semestraVertejums;
	static String[] studenti;
	
	
	static int maxSvars = 100, sk = 1;
	static double atlSvars;
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("0.#");
	
	static int studSk, kritSk;
	
	static void ievaditAudzeknus() {
		do {
			System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
			while(!scan.hasNextInt()) {
				System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
				scan.next();
			}
			studSk = scan.nextInt();
		}while(studSk<1);
		studenti = new String[studSk];
		for(int i=0; i<studenti.length; i++) {
			do {
				System.out.println("Ievadi "+(i+1)+". studentu");
				studenti[i] = scan.nextLine().trim();
			} while(!studenti[i].matches("^[\\p{L} ]+$"));
		}
	}
	
	static void ievaditKriterijus() {
		do {
			System.out.println("Kāds būs kritēriju skaits?");
			while(!scan.hasNextInt()) {
				System.out.println("Kāds būs kritēriju skaits?");
				scan.next();
			}
			kritSk = scan.nextInt();
		}while(kritSk<1);
		kriteriji = new String[kritSk];
		kriterijaSvars = new int[kritSk];
		kriterijaVertejums = new int[studSk][kritSk];
		semestraVertejums = new double[studSk];
		
		
		for(int i=0; i<kriteriji.length; i++) {
			do {
				System.out.println("Ievadi "+(i+1)+". kritēriju");
				kriteriji[i] = scan.nextLine().trim();
			} while(!kriteriji[i].matches("^[\\p{L} ]+$"));
		}
	}
	
	static void ievaditKritSvarus() {
		for (int i = 0; i < kriteriji.length; i++) {
			do {
				System.out.println("Ievadi "+(i+1)+". kritērija svaru (max: "+maxSvars+")");
				while(!scan.hasNextInt()) {
					System.out.println("Ievadi "+(i+1)+". kritērija svaru");
					scan.next();
				}
				kriterijaSvars[i] = scan.nextInt();
				atlSvars = (maxSvars - kriterijaSvars[i]) / (double)(kriteriji.length - sk);
			} while(kriterijaSvars[i]>maxSvars || kriterijaSvars[i]<5 || 
				  (i != kriteriji.length-1 && kriterijaSvars[i] == maxSvars) ||
				  (i == kriteriji.length-1 && (maxSvars - kriterijaSvars[i])  > 0) 
				  || atlSvars < 5);
			maxSvars -= kriterijaSvars[i];
			sk++;
			scan.nextLine();
		}
	}
	
	static void ievaditVertejumus() {
		for(int i=0; i<kriterijaVertejums.length; i++) {
			for(int j=0; j<kriterijaVertejums[i].length; j++) {
				do {
					System.out.println("Ievadi "+studenti[i]+" vērtējumu par kritēriju "+kriteriji[j]);
					while(!scan.hasNextInt()) {
						System.out.println("Ievadi "+studenti[i]+" vērtējumu par kritēriju "+kriteriji[j]);
						scan.next();
					}
					kriterijaVertejums[i][j] = scan.nextInt();
				}while(kriterijaVertejums[i][j]<0 || kriterijaVertejums[i][j]>10);
			}
		}
	}
	
	static void labotKriteriju() {
		for(int i=0; i<kriteriji.length; i++) {
			do {
				System.out.println("Ievadi "+(i+1)+". kritēriju");
				kriteriji[i] = scan.nextLine().trim();
			} while(!kriteriji[i].matches("^[\\p{L} ]+$"));
		}
	}
	
	static void labotKritSvaru() {
		ievaditKritSvarus();
	}
	
	static void labotIegutoVertejumu() {
		ievaditVertejumus();
	}
	
	static void glabatFaila() {
		// temp
		
	}
	
	static void aprekins() {
		double rezultats;
		for(int i=0; i<studenti.length; i++) {
			rezultats=0;
			for(int j=0; j< kriteriji.length; j++) {
				rezultats += ((double) kriterijaSvars[j]/100)* kriterijaVertejums[i][j];
			}
			semestraVertejums[i] = rezultats;
		}
	}
	
}
