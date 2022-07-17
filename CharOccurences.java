package planit_task2;

import java.util.Scanner;

public class CharOccurences {
	
	
	final static int asciiSize = 256;
    static char getMaxOccurringChar(String str)
    {

        int count[] = new int[asciiSize];
        int len = str.length();
        
        for (int i=0; i<len; i++)
        {
            count[str.charAt(i)]++;
            
        }
        
        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) 
        {
            if (max < count[str.charAt(i)]) 
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }
     
    // Driver Method
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str =  sc.nextLine();
        System.out.println("Max occurring character is " +
                            getMaxOccurringChar(str));
    }
	
}
