package lab1.task1;

import java.util.Scanner;

public class TaskFirst {
    public TaskFirst(Scanner in) {
        System.out.print("Choose point of task: ");

        String pointNumber = in.nextLine().trim();

        switch (pointNumber) {
            case "1": {
                new Point1();
            }
            break;
            case "2": {
                new Point2();
            }
            break;
            default: {
                System.out.println("Chosen un correct point");
            }
            break;
        }
    }
}
