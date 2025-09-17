package lab1;

import lab1.task1.TaskFirst;

import java.util.Scanner;

public class LaboratoryWork1 {
    public LaboratoryWork1(Scanner in) {
        System.out.print("Enter task number (1-5): ");

        String taskNumber = in.nextLine().trim();

        switch (taskNumber) {
            case "1": {
                new TaskFirst(in);
            }
            break;
            case "2": {

            }
            break;
            default: {
                System.out.println("Chosen un correct task number!");
            }
            break;
        }
    }
}
