import java.util.Scanner;


public class SwitchCondition {
public static void main(String args[]){
	Scanner scanner;
	scanner = new Scanner(System.in);
	System.out.println("Enter the Day Number");
	int dayNumber = scanner.nextInt();
	switch (dayNumber){
	case 1 : 
	System.out.println("Its Monday");
	break;
	case 2 : 
		System.out.println("Its Tuesday");
		break;
	case 3 : 
		System.out.println("Its Wednesday ");
		break;
	case 4 : 
		System.out.println("Its Thursday ");
		break;
	case 5 : 
		System.out.println("Its Friday");
		break;
	case 6 : 
		System.out.println("Its Saturday");
		break;
	case 7 : 
		System.out.println("Its Sunday");
		break;
		default :
			System.out.println("Entered value is wrong");
	
	}
}
}
