/**
 * Created by Narvik Tahmasian on 10/10/2016.
 */
import java.util.Random;
public class Student {
	
	// Instantiate the students and save their ID numbers in an array 
	public Student(int numOfStudents){
	Integer[] studentIds = new Integer[numOfStudents];
	for (int i =0; i<numOfStudents ; i++ ){
		studentIds[i] = Random();
		}
	}
	
	// Randomly generate four digit numbers for student IDs
	private int Random(){
		Random numOfStudents = new Random();
		int randomIdGenerator = 1000+numOfStudents.nextInt(9000);
		return randomIdGenerator;
	}

}