/**
 * Created by Narvik Tahmasian on 10/10/2016.
 */
import java.util.Random;
public class SingleChoiceQuestion implements Questions{
	
	//Randomly chose which question to be asked
	Random random = new Random();
	int randomQuestion = random.nextInt(6);
	
	@Override
	public String question() {
		String arrayOfQuestions[]=
			{"What is 1+1\nA) 1\nB) 2\nC) 3\nD) Undifined",
				"What is 2*2 \nA) 2 \nB) 4\nC) 8\nD) Undifined",
					"What is the time complexity of a for loop?\nA) O(n)\nB) O(n^2)\nC) O(n^3)\nD) O(log n)",
						"What is the time complexity of a nested for loop?\nA) O(n)\nB) O(n^2)\nC) O(n^number of loops)\nD) O(log n)",
							"Which one is a higher level Language?\nA) C\nB) Assembly\nC) Machine\nD) Hardware",
								"For you to be able to run a program successfully do you need to have a main method?\nA) Yes\nB) No\nC) I'm not sure\nD) Maybe"};
		
		return arrayOfQuestions[randomQuestion];
	}
	
	//Randomly choose the answer the student may have
	@Override
	public String RandomGeneratorAnswer(){
		int randomAnswer = random.nextInt(4);
		if (randomAnswer == 0){
			return "A";
		}
		else if (randomAnswer == 1){
			return "B";
		}
		else if (randomAnswer == 2){
			return "C";
		}
		else {
			return "D";
		}
	}
	
	//Correct answer to each question
	public String corectAnswers() {
		String arrayOfAnswers[] = {"B","B","A","C","A","B"};
		return arrayOfAnswers[randomQuestion];
	}
}