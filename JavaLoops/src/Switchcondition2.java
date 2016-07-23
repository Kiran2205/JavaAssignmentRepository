import java.util.Scanner;


public class Switchcondition2 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day string");
		String dayString = scanner.nextLine();
		switch(dayString){
			case "Monday" :
			System.out.println("The day Number is 1");
			break;
			case"Tuesday" :
				System.out.println("The day Number is 2");
				break;
			case"Wednesday" :
				System.out.println("The day Number is 3");
				break;
			case "Thursday" :
				System.out.println("The day Number is 4");
				break;
			case "Friday" :
				System.out.println("The day Number is 5");
				break;
			case "saturday" :
				System.out.println("The day Number is 6");
				break;
			case "Sunday" :
				System.out.println("The day Number is 7");
				break;
				default :
					System.out.println("The entered value is wrong");
			
			
		}
	}

}
