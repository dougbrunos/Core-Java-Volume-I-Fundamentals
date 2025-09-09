public class SwitchExpression {

    public static void main(String[] args) {
        String seasonName = "Spring";

        int numLetters = switch (seasonName) {
            case "Spring", "Summer", "Winter" -> 6;
            case "Fall" -> 4;
            default -> -1;
        };

        // is better than
        switch (seasonName) {
            case "Spring", "Summer", "Winter" ->
                numLetters = 6;
            case "Fall" ->
                numLetters = 4;
            default ->
                numLetters = -1;
        }

    }

}