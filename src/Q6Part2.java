public class Q6Part2 {

    //Improve on 6.1 to make it smart enough to output: “We eat Pot Roast on Sunday”
    //ie - it should capitalize each word of a multi-word meal name

    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String localVariableDays : daysOfWeek) {
            String meals = switch (localVariableDays) {
                case "Sunday" -> "pot roast";
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                case "Saturday" -> "pizza";
                default -> "error";
            };
            System.out.printf("We eat %s on %s%n", initialCap(meals), localVariableDays);
        }
    }

    private static String initialCap(String meals) {

        String[] splitMealName = meals.split(" ");
        String fullMealName = "";

        for (String localVarSplitMealName : splitMealName) {
            String capitalisedWord = localVarSplitMealName.substring(0, 1).toUpperCase() + localVarSplitMealName.substring(1);
            fullMealName = fullMealName + " " + capitalisedWord;
        }
        return fullMealName;
    }
}
