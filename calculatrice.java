package exercices.exercice1;

import java.util.Scanner;

import exercices.exercice2.jeu;
import exercices.exercice3.AnalysePhrase;

public class calculatrice {
public static void Operation(double num1, double num2, char operateur) {
	Scanner sc = new Scanner(System.in);
	do {
switch (operateur){
case '+':
	System.out.println("la somme: "+(num1+num2));
	break;
case '-':
	System.out.println("la difference: "+(num1-num2));
	break;
case '*':
	System.out.println("la multiplication: "+(num1*num2));
	break;
case '/':
	if(num2!=0)
	System.out.println("la division: "+(num1/num2));
	else
		System.out.println("error");
	break;
case '%':
	System.out.println("le modulo: "+(num1%num2));
	break;
case 'A':
	System.out.println("1-saisir une phrase: ");
	String phrase = sc.nextLine();
	char symbol = sc.next().charAt(0);
	System.out.println("Nombre de mots: "+AnalysePhrase.nombredemots(phrase));
	System.out.println("Phrases inversée: "+AnalysePhrase.inverserPhrase(phrase));
	System.out.println("Voyelle est remplacée: "+AnalysePhrase.remplacerVoyelle(phrase , symbol));
	break;
case 'T':
	jeu.trouvernombresecret();
default:
	System.out.println("operation invalide");
    break;
}
System.out.println("Entrez un nouvel opérateur (+, -, *, /, %, A) : ");
operateur = sc.next().charAt(0);
	}while(operateur=='+' ||operateur=='-' ||operateur=='*'||
	       operateur=='/'||operateur=='%'||operateur=='A');
sc.close();
}
}
