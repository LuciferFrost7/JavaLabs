package lab1.task2.points;

import java.util.Scanner;

public class Point1 {
    public Point1(Scanner in) {
        System.out.print("Enter X: ");
        int x = in.nextInt();

        System.out.print("Enter Y: ");
        int y = in.nextInt();

        System.out.println("Is divisible x by y? - " + (x % y == 0 ? "Yes" : "No"));
    }
}
