package exercices.exercice2;

import java.util.Random;
import java.util.Scanner;

public class jeu {
public static void trouvernombresecret() {
	Random random = new Random();
	int nombreAleatoire = random.nextInt(100);
	Scanner sc = new Scanner(System.in);
	int count=0;
	int nbr ; 
	do {
		count++;
    	System.out.println("Saisir un nombre: ");
		nbr = sc.nextInt();
		if(nbr>nombreAleatoire)
			System.out.println("Trop grand");
		else if(nbr<nombreAleatoire)
			System.out.println("Trop petit");
		else if(nbr == nombreAleatoire) {
			System.out.println("c'est le bon nombre");
			System.out.println("Vous avez trouvé dans "+count+" cout");			
		}
	}while(nbr != nombreAleatoire);
	
	}
}
