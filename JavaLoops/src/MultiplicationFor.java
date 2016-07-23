import java.util.Scanner;


public class MultiplicationFor {
	public static void main(String args[]){
		int multipliedValue=0;
		System.out.println("enter the number to generate the multiplication table");
		Scanner scanner = new Scanner(System.in);
		int multiplicationNumber = scanner.nextInt();
		if (multiplicationNumber < 1){
			System.out.println("Table cannot be generated for the given number");
		}
		for(int i=1;i<=10;i++){
			
			multipliedValue = multiplicationNumber*i;
			System.out.println(multiplicationNumber+"*"+i+"="+multipliedValue);
		}
		
	}

}

