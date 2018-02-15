package co.simplon.pf1;

import java.util.Scanner;

public class Quizz2 {

	/******************************************
	 *  attributs
	 *****************************************/
	
	// listes des questions
	private static String[] questions= {
			"Il est sympa Waby?",
			"Combien il soul�ve?",
			"Le PSG s'en sortira-t-il?"
	};
	
	// liste des r�ponses
	private static String[] answers= {
			"Oui, trop sympa, je le kiffe vegra!!!",
			"130 kg, la vache!",
			"oui bien s�r!"
	};
	
	// liste des scores a donner par reponse
	private static int[] scores= {1, 2, 3};

	// score a calculer	
	private static int score= 0;
	

	

	/******************************************
	 *  methodes 
	 *****************************************/

	// methode main
	public static void main(String[] args) {
		
		/* boucle sur la liste de questions :
		 * afficher la i eme question
		 * r�cup�rer la r�ponse
		 * comparer avec la i eme r�ponse de la liste des r�ponses OK
		 * si r�ponse OK, augmenter le score de la valeur du i eme score
		 */
		
		// scanner pour r�cup�rer saisie r�ponse
		Scanner in= new Scanner(System.in);
		
		for(int i=0; i != questions.length; ++i){
		     System.out.println(questions[i]);
		     String answer= in.nextLine();
		     if(answer.equals(answers[i])){
		         score+= scores[i];
		     }
		 }
		 displayResult();
	}
	
	// methode pour affichage des r�sultats
	private static void displayResult( ) {
		System.out.println("Le score total est " + score);
	}

}
