package co.simplon.pf1;

import java.util.Scanner;

public class Quizz2 {

	/******************************************
	 *  attributs
	 *****************************************/

	// quizz elements
	private static TestItem[] quizz= new TestItem[3];

	// score total a calculer	
	private static int score= 0;



	/******************************************
	 *  methodes 
	 *****************************************/

	// methode main
	public static void main(String[] args) {

		// initialize quizz
		quizz[0]= new TestItem("Il est sympa Waby?", "oui", 1);
		quizz[1]= new TestItem("Combien il soulève en kg?", "130", 3);
		quizz[2]= new TestItem("Le PSG s'en sortira-t-il?", "oui", 7);

		// scanner pour récupérer saisie réponse
		Scanner input= new Scanner(System.in);

		/*
		for (int i=0; i<quizz.length; i++) {
			
			// print question
			quizz[i].printQuestion();
			
			// input answer
			String answer= input.nextLine();
			
			// if good answer, add points to score
			if (quizz[i].rightAnswer(answer)) {
				score+= quizz[i].getPoints();
				System.out.println("Bonne réponse! le score augmente de " + quizz[i].getPoints() + " points et atteint un total temporaire de " + score);
				System.out.println();
			}
			else {
				System.out.println("Mauvaise réponse! le score temporaire reste à " + score + " points");
				System.out.println();
			}
		}
		*/
		
		for (TestItem ti: quizz) {
			
			// print question
			ti.printQuestion();
			
			// input answer
			String answer= input.nextLine();
			
			// if good answer, add points to score
			if (ti.rightAnswer(answer)) {
				score+= ti.getPoints();
				System.out.println("Bonne réponse! le score augmente de " + ti.getPoints() + " points et atteint un total temporaire de " + score);
				System.out.println();
			}
			else {
				System.out.println("Mauvaise réponse! le score temporaire reste à " + score + " points");
				System.out.println();
			}
		}


		displayResult();
		input.close();
	}

	// methode pour affichage des résultats
	private static void displayResult() {
		System.out.println("Le score final est " + score);
	}

}
