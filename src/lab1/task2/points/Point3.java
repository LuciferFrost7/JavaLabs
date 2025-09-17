package lab1.task2.points;

import java.util.Scanner;

public class Point3 {
    public Point3(Scanner in){
        System.out.print("Enter number of day of week: ");

        String dayNumber = in.nextLine().trim();

        String result = switch(dayNumber){
            case "1" -> "Monday";
            case "2" -> "Tuesday";
            case "3" -> "Wednesday";
            case "4" -> "Thursday";
            case "5" -> "Friday";
            case "6" -> "Saturday";
            case "7" -> "Sunday";
            default -> "un correct entered day of week!";
        };

        System.out.println((result.length() <= 9 ? "Your day named - ": "Error - ") + result);
    }
}
