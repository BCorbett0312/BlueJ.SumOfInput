
/**
 * Write a description of class SumOfInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SumOfInput
{
    public int choice;
      
     /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Please choose a number. ");
       choice = in.nextInt();
       
       sumOfDigitsToN(choice);
       
    }   
    
    public void sumOfDigitsToN(int choice)
    {
        int result = 0;
        
        for (int x = 1; x <= choice; x++)
        result = result + x;
        
        System.out.println(result);
               
        
    }
    
    
}
