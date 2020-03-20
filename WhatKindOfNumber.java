import java.util.Scanner;

public class WhatKindOfNumber {

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.print("Type any number: ");
        number = keyboard.nextInt();

        if(number < 0){
            System.out.println("Negative!");
        }

        if(number > 0){
            System.out.println("Positive!");
        }

        if(number == 0){
            System.out.println("Zero!");
        }

        keyboard.close();

    }
}
