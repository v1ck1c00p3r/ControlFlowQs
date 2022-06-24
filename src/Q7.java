public class Q7 {

    //Iterate over all the days of the week in an array and add up the total number of characters in all the days of the week.
    //E.g., “Sunday”=6, “Monday”=6, etc. therefore, answer should be 50


    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int numberOfLettersTotal = 0;

        for (String day : daysOfWeek) {
            int numberOfLetters = day.length();
            numberOfLettersTotal += numberOfLetters;
        }

        System.out.println(numberOfLettersTotal);
    }
}
