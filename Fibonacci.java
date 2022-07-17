package planit_task2;


import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		        Scanner sc = new Scanner(System.in);
		         
		        System.out.println("Enter positive number :");
		         
		        int inputNumber = sc.nextInt();
		         
		        int firstTerm = 0;
		         
		        int secondTerm = 1;
		         
		        int thirdTerm = 0;
		        
		        System.out.print("  " +firstTerm + " " +secondTerm);
		         
		        while (thirdTerm < inputNumber)
		        {
		            thirdTerm = firstTerm + secondTerm;
		            
		            System.out.print("  " +thirdTerm );
		             
		            firstTerm = secondTerm;
		             
		            secondTerm = thirdTerm;
		        }
		         
		        if(thirdTerm == inputNumber)
		        {
		            System.out.println("\n" + thirdTerm+ " Number belongs to Fibonacci series");
		        }
		        else
		        {
		            System.out.println("\n Number doesn't belongs to Fibonacci series");
		            
		            System.out.println("\n Closest index of given input number is "  +thirdTerm);
		        }
		    }   
		
	}


