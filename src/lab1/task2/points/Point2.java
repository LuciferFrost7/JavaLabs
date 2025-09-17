package lab1.task2.points;

import java.util.Scanner;

public class Point2 {
    public Point2(Scanner in){
        System.out.print("Enter number from 1 to 9: ");
        String inputNumber = in.nextLine().trim();

        String result = switch(inputNumber){
            case "1" -> "one";
            case "2" -> "two";
            case "3" -> "three";
            case "4" -> "four";
            case "5" -> "five";
            case "6" -> "six";
            case "7" -> "seven";
            case "8" -> "eight";
            case "9" -> "nine";
            default -> "un correct entered number!";
        };

        System.out.println((result.length() <= 5 ? "Your number is - " : "Error - ") + result);
    }
}
