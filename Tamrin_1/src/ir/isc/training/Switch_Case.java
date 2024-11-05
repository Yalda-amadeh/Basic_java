package ir.isc.training;

public class Switch_Case {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int score = 86;
	char grade;

	switch (score / 10) {
	    case 10: // Score is 100
	    case 9:  // Scores from 90 to 99
	        grade = 'A';
	        break;
	    case 8:  // Scores from 80 to 89
	        grade = 'B';
	        break;
	    case 7:  // Scores from 70 to 79
	        grade = 'C';
	        break;
	    case 6:  // Scores from 60 to 69
	        grade = 'D';
	        break;
	    default: // Scores below 60
	        grade = 'F';
	        break;
	}

	// Print the grade
	System.out.println("Grade: " + grade);


}
}