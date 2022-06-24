public class Q2Part2 {

    //alternatively capitalised days with while loop

    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayCounter = 0;
        while (dayCounter < daysOfWeek.length) {
            if (dayCounter % 2 == 0) {
                System.out.println(daysOfWeek[dayCounter]);
            } else {
                System.out.println(daysOfWeek[dayCounter].toUpperCase());
            }
            dayCounter++;
        }
    }
}
