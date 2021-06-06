package base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;
/**
 Exercise 14 - Tax Calculator
 You don’t always need a complex control structure to solve simple problems. Sometimes a program requires an extra step in one case, but in all other cases there’s nothing to do.

 Write a simple program to compute the tax on an order amount. The program should prompt for the order amount and the state. If the state is “WI,” then the order must be charged 5.5% tax. The program should display the subtotal, tax, and total for Wisconsin residents but display just the total for non-residents.

 Example Output
 What is the order amount? 10
 What is the state? WI
 The subtotal is $10.00.
 The tax is $0.55.
 The total is $10.55.
 Or

 What is the order amount? 10
 What is the state? MN
 The total is $10.00

 Constraints
 Implement this program using only a simple if statement—don’t use an else clause.
 Ensure that all money is rounded up to the nearest cent.
 Use a single output statement at the end of the program to display the program results.
 Challenges
 Allow the user to enter a state abbreviation in upper, lower, or mixed case.
 Also allow the user to enter the state’s full name in upper, lower, or mixed case.
 */
public class App 
{
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        App myApp = new App();

        Integer amount = myApp.getamount();
        in.nextLine();
        State m = new State();
        String msg = m.output(amount);
        if(myApp.getstate().equals("WI"))
        {
            State s = new WI();
            msg = s.output(amount);
        }
        myApp.output(msg);
    }

    public void output(String msg)
    {
        System.out.println(msg);
    }

    public String getstate()
    {
        System.out.print("What is the state? ");
        String state = in.nextLine();
        return state;
    }

    public Integer getamount()
    {
        System.out.print("What is the order amount? ");
        Integer amount = in.nextInt();
        return amount;
    }
}
