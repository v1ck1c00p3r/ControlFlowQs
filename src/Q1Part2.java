public class Q1Part2 {

    //Q1 part 2 do again but with every other line FULLY capitalised

    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int dayCounter=0; dayCounter<daysOfWeek.length; dayCounter++){
            if (dayCounter % 2 == 1) {
                System.out.println(daysOfWeek[dayCounter]);;
            } else {
                System.out.println(daysOfWeek[dayCounter].toUpperCase());
            }
        }
    }


}
