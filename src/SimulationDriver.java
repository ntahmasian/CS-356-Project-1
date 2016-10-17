/**
 * Created by Narvik Tahmasian on 10/10/2016.
 */
import java.util.Random;
public class SimulationDriver {
	public static void main(String[] args) {
	
		//Randomly generate how many students show up in a class room with 30 students
		Random random = new Random();
		int randomIdGenerator = 1+random.nextInt(30);
		
		//Generate the IDs of the amount of students showing up to class
		Student students = new Student(randomIdGenerator);
		String[] arrayOfRandomAnswers = new String[30];
		
		//Randomly generate the question type to be single answer question or multiple answer question
		int randomGeneratedQuestionType = 1+random.nextInt(2);
		
		if ( randomGeneratedQuestionType == 1){
			SingleChoiceQuestion schq = new SingleChoiceQuestion();	// make an Object of Single Choice Question
			System.out.println("----------------------------------Question----------------------------------");
			System.out.println(schq.question());					// print out the question
			for (int i = 0; i<randomIdGenerator ; i++ ){			// loop it for the amount of students showed up to the class and generate random answers for them
				arrayOfRandomAnswers[i] = schq.RandomGeneratorAnswer();				
			}
			// call the IVoteService to to compute the correct answers and print it out
			IVoteService singleIVS = new IVoteService(arrayOfRandomAnswers, randomIdGenerator, schq.corectAnswers());
			System.out.println("\n-----------------------------------Answers-----------------------------------");
			singleIVS.PrintS();
		}
		if ( randomGeneratedQuestionType == 2){
			MultipleChoicesQuestions mchq = new MultipleChoicesQuestions();	// make an Object of Multiple Choice Question
			System.out.println("----------------------------------Question----------------------------------");
			System.out.println(mchq.question());							// print out the question
			for (int i =0; i<randomIdGenerator ; i++ ){						// loop it for the amount of students showed up to the class and generate random answers for them
				arrayOfRandomAnswers[i] = mchq.RandomGeneratorAnswer();
			}
			// call the IVoteService to to compute the answers and print it out
			IVoteService multipleIVS = new IVoteService(arrayOfRandomAnswers, randomIdGenerator);
			System.out.println("\n-----------------------------------Answers-----------------------------------");
			multipleIVS.PrintM();
		}	
	}
}