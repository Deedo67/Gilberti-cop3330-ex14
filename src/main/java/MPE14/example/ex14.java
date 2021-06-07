package MPE14.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex14 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is the order amount? ");
        String strorder = in.nextLine();
        System.out.print("What is the state? ");
        String state = in.nextLine();

        //string convert
        double order = Double.parseDouble(strorder);

        //math
        double tax = .05;

        //Output
        System.out.println("The total is $"+String.format("%.2f", order)+".");

        //state check & output
        if (state == "WI")
        {
            System.out.println("The subtotal is $"+String.format("%.2f", order)+".");
        }
        else
        {

        }
    }
}
