package lab1.task2;

import lab1.task2.points.*;

import java.util.Scanner;

public class TaskSecond {
    public TaskSecond(Scanner in) {
        System.out.print("Choose point of task (1-7): ");

        String taskNumber = in.nextLine().trim();

        switch (taskNumber) {
            case "1": {
                new Point1(in);
            }
            break;
            case "2": {
                new Point2(in);
            }
            break;
            case "3": {
                new Point3(in);
            }
            break;
            case "4": {
                new Point4();
            }
            break;
            case "5": {
                new Point5();
            }
            break;
            case "6": {
                new Point6();
            }
            break;
            case "7": {
                new Point7();
            }
            break;
            default: {
                System.out.println("Chosen un correct point!");
            }
            break;
        }
    }
}
