package javaAssignment;

import java.util.Scanner;

public class NumberAnalyzer {
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        displayMenu();

//        printNumDesc();
//
//        printEvenOrOdd();
//
//        System.out.println("Enter Num");
//        int numType = scanner.nextInt();
//        String result = checkNumberType(numType);
//        System.out.println("The Number Is  " +result);
//
//        System.out.println("Enter Num1");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter Num2");
//        int num2 = scanner.nextInt();
//        int sumResult  = calculateSum(num1,num2);
//        System.out.println("Total Sum IS " +sumResult );
        scanner.close();
    }

    /**
     * This method displays the numbers from 10 to 1 descending order.
     */
    public static void printNumDesc(){
        int numDesc = 1;
        for(int i=10;i>=numDesc;i--){
            System.out.println(" " + (i));
        }
    }

    /**
     * This method displays the numbers from 1 to 10 and specifies whether each number is odd or even.
     */
    public static   void printEvenOrOdd(){
        int maxNumber = 10;
        for(int i=1;i<=maxNumber;i++){
            if (i % 2 == 0) {
                System.out.println((i) + " -> " + "Even");
            }else{
                System.out.println((i) + " -> " + "Odd");
            }
        }
    }
    /**
     * This method checks whether the given number is positive, negative, or zero.
     * @param numType the number that will be checked
     * @return the number type as Positive, Negative, or Zero*/
    public static String checkNumberType(int numType){
        if(numType>0){
            return "Positive";
        } else if (numType< 0) {
            return "Negative";
        }else {
            return "Zero";
        }

    }
    /**
     * This method calculates the sum of two integer numbers.
     *
     * @param number1 the first number to be added
     * @param number2 the second number to be added
     * @return the sum of the two numbers
     */
    public static int calculateSum(int number1, int number2){
        return number1 + number2;
    }

    /**
     * This method displays the Number Analyzer menu options.
     */
    public static void displayMenu() {
        int choice;
        do {
            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printNumDesc();
                    break;
                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.println("Enter Num");
                    int numType = scanner.nextInt();
                    String result = checkNumberType(numType);
                    System.out.println("The " + numType + " Is  " + result);
                    break;


                case 4:
                    System.out.println("Enter Num1");
                    int num1 = scanner.nextInt();
                    System.out.println("Enter Num2");
                    int num2 = scanner.nextInt();
                    int sumResult = calculateSum(num1, num2);
                    System.out.println("Total Sum IS " + sumResult);
                    break;


                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        } while (choice != 5);
    }

}