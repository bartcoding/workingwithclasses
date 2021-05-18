package be.intecbrussel;

import java.util.Scanner;

public class WelcomeApp {

    public static void main(String[] args) {
        // print the text hello + your name

        //declare variables
        String name;
        Scanner scan;

        scan = new Scanner(System.in);

        //show message to user, to ask for their name
        System.out.println("please enter your name: (of iets soortgelijk)");

        //read out user input
        name = scan.nextLine();

        //show message that welcomes the user (welcome user, to my application)
        System.out.println("Hello " + name + ", welcome to my application");

    }
}
