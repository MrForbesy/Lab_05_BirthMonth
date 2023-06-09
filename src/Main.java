//class BirthMonth
//	main ()
//		num birthMonth = 0
//		output “What is your birth month number?”
//		input birthMonth
//		if birthMonth >= 1 && <= 12
//			output “Your birth month is:” + birthMonth
//		else
//output “You have entered an incorrect month value:” + birthMonth
//				endIf
//			return
//		end class

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Define variables//
        Scanner in = new Scanner(System.in);
        int birthMonth;

        //Ask user to input their birth month number//
        System.out.printf("What is the number of your birth month?");

        //Stores their number//
        birthMonth = in.nextInt();

        //Makes sure that the user has entered a correct number and displays the result if correct//
        if(birthMonth >=1 && birthMonth <= 12)
        {
            System.out.printf("Your birth month is " + birthMonth);
        }
        else
        {
            System.out.printf("You have entered an incorrect birth month value: " + birthMonth);
        }
    }
}