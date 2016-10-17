/**
 * Created by Narvik Tahmasian on 10/10/2016.
 */
import java.util.Random;
public class MultipleChoicesQuestions implements Questions{
	
	//Randomly chose which question to be asked
	Random random = new Random();
	int randomQuestion = random.nextInt(5);

	@Override
	public String question() {
		String arrayOfQuestions[]=
			{"Which programing languages do you Know?\nA) C\nB) C++\nC) C#\nD) Java ",
				"Which programing languages do you like the most?\nA) C\nB) C++\nC) C#\nD) Java",
					"How can you add 2 numbers so the result come out to be 44?\nA) 1+43\nB) 33+10\nC) 52-8\nD) 22+22",
						"In programing, how can you loop infinitly?\nA) While loop\nB) For loop\nC) Do While loop\nD) If statement",
							"In a program how many interfaces can you have?\nA) 1\nB) 2\nC) As many as you want\nD) None"};

		return arrayOfQuestions[randomQuestion];
	}
	
	//Randomly choose the answer the student may have
	@Override
	public String RandomGeneratorAnswer() {
		int randomAnswer = random.nextInt(8);
		if (randomAnswer == 0){
			return "A,B";
		}
		else if (randomAnswer == 1){
			return "B,D";
		}
		else if (randomAnswer == 2){
			return "C,D";
		}
		else if (randomAnswer == 3){
			return "A,B,D";
		}
		else if (randomAnswer == 4){
			return "B";
		}
		else if (randomAnswer == 5){
			return "C,B";
		}
		else if (randomAnswer == 6){
			return "D";
		}
		else {
			return "A";
		}
	}	
}
