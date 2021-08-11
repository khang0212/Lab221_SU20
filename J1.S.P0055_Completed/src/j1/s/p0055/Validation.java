package j1.s.p0055;

import java.util.Scanner;

public class Validation {

    public Scanner sc = new Scanner(System.in);

    public String checkInputString(String str) {
        System.out.println("Enter " + str);
        while (true) {
            String result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println(str + " must not empty.");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public int checkInt(String input) {

        while (true) {
            try {
                int result = Integer.parseInt(input);
                return result;
            } catch (NumberFormatException e) {
                System.out.print("Enter again: ");
            }
        }
    }

    public int checkIntRange(String message, int min, int max) {
        System.out.println("Enter " + message + ":");
        int result;
        while (true) {
            try {
                result = Integer.parseInt(sc.nextLine());
                if (result < min || result > max) {
                    System.out.println("Input only " + min + " - " + max);
                    continue;
                }
                break;

            } catch (NumberFormatException e) {
                System.out.print("Enter again: ");
            }
        }
        return result;
    }

    public float checkTotal(String str) {
        System.out.println("Enter " + str + " : ");
        while (true) {
            try {
                float result = Float.parseFloat(sc.nextLine());
                if (result <= 0) {
                    System.out.println("Total area must be greater than 0 !");
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.print("Enter again: ");
            }
        }
    }

    public boolean checkYN() {
        System.out.print("Do you want to continue: ");
        while (true) {
            String c = checkInputString("Your choice");
            if (c.equalsIgnoreCase("y")) {
                return true;
            } else if (c.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Choose only Y/N.");
            System.out.print("Enter again: ");
        }
    }

}
