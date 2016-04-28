import java.util.Scanner;

public class Assignment1Class2 implements Assignment1 {
	
	public void display(int number)
	{
		System.out.println ("Square of number is: " + number*number);
	}	
	public static void main (String args[]){
		
		Assignment1Class2 ac2 = new Assignment1Class2();
		
		Scanner scnr = new Scanner (System.in);
		
		System.out.println ("Enter the number:");
		int number = scnr.nextInt();
		
		scnr.close();
		
		ac2.display(number);
		
	}
}