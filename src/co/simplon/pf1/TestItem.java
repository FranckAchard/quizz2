package co.simplon.pf1;

public class TestItem {
	// attibutes
	private String question;
	private String answer;
	private int points;

	// constructors
	public TestItem() {
		question="";
		answer="";
		points=0;
	}
	
	public TestItem(String question, String answer, int points) {
		this.question = question;
		this.answer = answer;
		this.points = points;
	}


	// getters + setters
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	// toString
	public String toString() {
		return "TestItem [question=" + question + ", answer=" + answer + ", points=" + points + "]";
	}
	
	// print attributes methods
	public void printQuestion() {
		System.out.println("question= " + this.question);
	}
	
	public void printAnswer() {
		System.out.println("answer= " + this.answer);
	}
	
	public void printPoints() {
		System.out.println("points= " + this.points);
	}
	
	
	public boolean rightAnswer(String answer) {
		boolean result=false;
		if (this.answer.equals(answer)) {
			result= true;
		}
		return result;
	}
}
