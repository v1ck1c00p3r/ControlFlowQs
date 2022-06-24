public class Q3Part2 {

    //alternatively capitalised days with while loop

    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayCounter = 0;
        do {
            if (dayCounter % 2 == 0) {
                System.out.println(daysOfWeek[dayCounter]);
            } else {
                System.out.println(daysOfWeek[dayCounter].toUpperCase());
            }
            dayCounter++;
        } while (dayCounter < daysOfWeek.length);
    }
}
