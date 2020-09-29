import java.io.IOException;
import java.util.Scanner;

public class mailmerge {

	public static void main(String[] args) throws IOException {
		Scanner Alex = new Scanner(System.in);
		 
		//accept first name
		System.out.println("Enter first name: ");
		String firstName = Alex.next();
		
		//accept last name
		System.out.println("Enter last name: ");
		String lastName = Alex.next();
		
		//accept house number
		System.out.println("Enter house number: ");
		String houseNumber = Alex.next();
		
		
		//accept street name
		System.out.println("Enter street name: ");
		String streetName = Alex.next();
		
		String text1 = "Dear first last," ;
		String text2 = "Please confirm that your address is house street";
		String text3 = "Your answer is anything ";
				
		
		text1 = text1.replace("first", firstName);
		text1 = text1.replace("last", lastName);
		
		text2 = text2.replace("house", houseNumber);
		text2 = text2.replace("street", streetName);
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println("Enter yes or no");
		
		String answer = Alex.next();
		text3 = text3.replace("anything", answer);
		System.out.println(text3);
		
		Alex.close();
		
		
		

	}
}


