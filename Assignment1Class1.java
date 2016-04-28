import java.util.Scanner;

public class Assignment1Class1 implements Assignment1 {
	
	public void display(int number)
	{
		System.out.println ("Number passed is: " + number);
	}	
	public static void main (String args[]){
		
		Assignment1Class1 ac1 = new Assignment1Class1();
		
		Scanner scnr = new Scanner (System.in);
		
		System.out.println ("Enter the number:");
		int number = scnr.nextInt();
		
		scnr.close();
		
		ac1.display(number);
		
	}
}