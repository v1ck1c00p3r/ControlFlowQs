public class Q6Part1 {

    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String localVariableDays : daysOfWeek) {
            String meals = switch (localVariableDays) {
                case "Sunday" -> "pot roast";
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case  "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                case "Saturday" -> "pizza";
                default -> "error";
            };
            System.out.printf("We eat %s on %s%n", initialCap(meals), localVariableDays);
        }
    }

    private static String initialCap(String wordToBeCapitalised) {
        return wordToBeCapitalised.substring(0,1).toUpperCase() + wordToBeCapitalised.substring(1);
    }
}
