import lab1.LaboratoryWork1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter laboratory work number (1-3): ");
        String laboratoryWorkNumber = in.nextLine().trim();

        switch (laboratoryWorkNumber) {
            case "1": {
                new LaboratoryWork1(in);
            }
            break;
            case "2": {
                System.out.println("not done");
            }
            break;
            default: {
                System.out.println("Un correct laboratory work number");
            }
            break;
        }
    }
}