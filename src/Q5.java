import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String localVariableDays : daysOfWeek) {
            switch (localVariableDays) {
                case "Sunday" : System.out.printf("We eat pot roast on %s%n", localVariableDays);
                break;
                case "Monday" : System.out.printf("We eat spaghetti on %s%n", localVariableDays);
                break;
                case "Tuesday" : System.out.printf("We eat tacos on %s%n", localVariableDays);
                break;
                case "Wednesday" : System.out.printf("We eat chicken on %s%n", localVariableDays);
                break;
                case "Thursday" : System.out.printf("We eat meatloaf on %s%n", localVariableDays);
                break;
                case "Friday" : System.out.printf("We eat hamburgers on %s%n", localVariableDays);
                break;
                case "Saturday" : System.out.printf("We eat pizza on %s%n", localVariableDays);
                break;
                default : System.out.println("Something has gone wrong!");
            }

        }
    }
}
