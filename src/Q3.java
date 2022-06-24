public class Q3 {

    //make while loop version

    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayCounter = 0;

        do {
            System.out.println(daysOfWeek[dayCounter]);
            dayCounter++;

        } while (dayCounter < daysOfWeek.length);

    }
}