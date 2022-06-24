public class Q2Part3 {

    //alternatively capitalised days with while loop, shortened code using Ternary operator

    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayCounter = 0;
        while (dayCounter < daysOfWeek.length) {
            String dayText = dayCounter % 2 == 0 ? (daysOfWeek[dayCounter]) : (daysOfWeek[dayCounter].toUpperCase());
            System.out.println(dayText);
            dayCounter++;
        }
    }

}