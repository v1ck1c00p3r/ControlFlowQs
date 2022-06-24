public class Q1Part3 {

    //Q1 part 3 - do again but only use four lines of code excluding main method and {s (use ternary operator)

    public static void main(String[] args) {
        String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int dayCounter=0; dayCounter<daysOfWeek.length; dayCounter++){
            String dayText = dayCounter % 2 == 1 ? (daysOfWeek[dayCounter]) : (daysOfWeek[dayCounter].toUpperCase());
            System.out.println(dayText);

        }
    }
}
