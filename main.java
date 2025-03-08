package exercices.exercice1;

import exercices.exercice1.calculatrice;
import exercices.exercice3.AnalysePhrase;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
/*    	System.out.print("Entrez le premier nbr: ");
    	Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(a);
        System.out.print("Entrez le deuxieme nbr: ");
        double b = sc.nextDouble();
        System.out.println(b);
        System.out.println(a+b);  
        System.out.println(a*b);
        System.out.println(a-b);
        if(b==0)
        	System.out.println("impossible");
        else {
            System.out.println(a/b);
            System.out.println(a%b);
        }
         
        System.out.println("Max: "+Math.max(a, b));
        System.out.println("Min: "+Math.min(a, b));
       
        if(b<0) 
        	System.out.println("Racine:|| "+Math.sqrt(Math.abs(b)));

        else
        	System.out.println("Racine: "+Math.sqrt(b));
        System.out.println("puissance: "+Math.pow(a, b));
        }*/
    
    	System.out.println("Menu principal: ");
    	System.out.println("1-addition(+): ");
    	System.out.println("2-soustraction(-): ");
    	System.out.println("3-multiplication(*): ");
    	System.out.println("4-division(/): ");
    	System.out.println("5-modulo(%): ");
    	System.out.println("6-Trouver le nombre secret(T): ");
    	System.out.println("7-Analyser phrase(A): ");
    	Scanner sc = new Scanner(System.in);
    	System.out.println("num1: ");
        int num1 = sc.nextInt();
    	System.out.println("num2: ");
    	int num2 = sc.nextInt();
    	System.out.println("saisir l'operateur: ");
    	char operateur = sc.next().charAt(0); 
    	calculatrice.Operation(num1, num2, operateur);    	
    	sc.close();
    }
    }
