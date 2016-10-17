/**
 * Created by Narvik Tahmasian on 10/10/2016.
 */
import java.util.Scanner;
public class IVoteService {
	private int correct = 0, incorrect = 0, A= 0,B =0, C= 0, D = 0;;
	// for Single Choice Questions
	public IVoteService(String [] randomAnswers, int arraySize, String corectAnswer){
		for (int i = 0; i<arraySize ; i++ ){
			if (corectAnswer.equals(randomAnswers[i])){
				correct++; 
			}
			else{
				incorrect++;
			}
		}
	}
	//for Multiple Choice Questions
	public IVoteService (String [] randomAnswers, int arraySize){
	 
		for (int i = 0; i<arraySize ; i++ ){
			String temp = randomAnswers[i];
			Scanner s = new Scanner(temp);
			s.useDelimiter(",");
			while (s.hasNext()){
				String tem = s.next();
				if (tem.equals("A")){
					A++;
				}
				else if (tem.equals("B")){
					B++;
				}
				else if (tem.equals("C")){
					C++;
				}
				else{
					
					D++;
				}
			}
		}
	}
	public void PrintS(){
		System.out.println("Correct:   " + correct);
		System.out.println("Incorrect: " + incorrect);
	}
	public void PrintM(){
		System.out.println("A: " + A);
		System.out.println("B: " + B);
		System.out.println("C: " + C);
		System.out.println("D: " + D);
	}

}