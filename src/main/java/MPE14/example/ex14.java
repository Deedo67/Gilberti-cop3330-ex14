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
        double finorder = order;
        double tax = 0.055;
        double fintax = tax * order;

        //state check & output
        if (state.equals("WI"))
        {
            System.out.println("The subtotal is $"+String.format("%.2f", order)+".");
            System.out.println("The tax is $"+String.format("%.2f", fintax)+".");
            finorder = order + fintax;
        }

        //Output
        System.out.println("The total is $"+String.format("%.2f", finorder)+".");
    }
    //main method end
}
//class end
