import java.util.Scanner;
import java.util.Random;
public class IntegerSearchTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		IntegerSearch searchObject = new IntegerSearch(7);
		System.out.println(searchObject);
		
		System.out.println("enter a value or -1 to quit");
		int choice = input.nextInt();
		
		if(choice !=-1)
			System.out.println("the value "+choice+" is found at index " +searchObject.linearSearch(choice));
		else if(choice ==-1)
			System.out.println("the value "+choice +" was not found");

	}

}
