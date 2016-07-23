import java.util.Scanner;


public class IfElseIf {
	public static void main(String args[]){
		Scanner scanner; //Declaration of variable of Type Scanner
		scanner = new Scanner(System.in);
		System.out.println("Enter the Grade of the student");
		int gradeOfStudent = scanner.nextInt();//nextLine()  method of Scanner class is used to read the string from the console.
		if (gradeOfStudent > 100 ||gradeOfStudent < 0)
		{
		System.out.println("The entered Grade is Wrong");	
		}
		else if (gradeOfStudent >= 80 && gradeOfStudent <= 100 )
		{
			System.out.println("Grade of Student is A");
		
		}
	    else if(gradeOfStudent >= 50 && gradeOfStudent <= 79)
	    {
	    	System.out.println("Grade of Student is B");
	   
	    }
	    else
	    {
	    	System.out.println("Grade of Student is C");
	    }
		
		// Note : Make use of If Else If Condition when there are more than 2 variables to compare and if we have only one variable to compare make use of Switch Statement 
		
	}

}
