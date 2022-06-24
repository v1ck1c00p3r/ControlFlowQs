public class Q4 {

    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String localVariableDays : daysOfWeek) {
            if (localVariableDays.equals("Sunday")) {
                System.out.printf("We eat pot roast on %s%n", localVariableDays);
            } else if (localVariableDays.equals("Monday")) {
                    System.out.printf("We eat spaghetti on %s%n", localVariableDays);
            } else if (localVariableDays.equals("Tuesday")) {
                System.out.printf("We eat tacos on %s%n", localVariableDays);
            } else if (localVariableDays.equals("Wednesday")) {
                System.out.printf("We eat chicken on %s%n", localVariableDays);
            } else if (localVariableDays.equals("Thursday")) {
                System.out.printf("We eat meatloaf on %s%n", localVariableDays);
            } else if (localVariableDays.equals("Friday")) {
                System.out.printf("We eat hamburgers on %s%n", localVariableDays);
            } else if (localVariableDays.equals("Saturday")) {
                System.out.printf("We eat pizza on %s%n", localVariableDays);
            } else {
                System.out.println("Something has gone wrong!");
            }

        }
    }
}
