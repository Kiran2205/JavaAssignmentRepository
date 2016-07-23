import java.util.Scanner;


public class MultiplicationWhile {
	public static void main(String args[]){
		int multipliedNumber;
		System.out.println("Enter the number to generate multiplication table");
		Scanner scanner = new Scanner(System.in);
		int multiplicationNumber = scanner.nextInt();
		int i=1;
		while (i!=0 && i <=10 ){
			multipliedNumber = multiplicationNumber*i;
			System.out.println(multiplicationNumber+"*"+i+"="+multipliedNumber);
			i++;
		}
		
	}

}
