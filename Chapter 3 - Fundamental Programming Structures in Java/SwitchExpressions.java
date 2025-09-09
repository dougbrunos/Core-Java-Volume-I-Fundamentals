public class SwitchExpressions {

    public static void main(String[] args) {

        int seasonCode = 1;
        String seasonName = switch (seasonCode) {
            case 0 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Fall";
            case 3 -> "Winter";
            default -> "???";
        };
        System.out.println(seasonName);

        // You can provide multiple labels for each case, separated by commas:
        int numLetters = switch (seasonName) {
            case "Spring", "Summer", "Winter" -> 6;
            case "Fall" -> 4;
            default -> -1;
        };
        System.out.println(numLetters);
        
        // Enumerated constants
        Size itemSize = Size.SMALL;
        String label = switch (itemSize) {
            case SMALL -> "S"; // no need to use Size.SMALL
            case MEDIUM -> "M";
            case LARGE -> "L";
            case EXTRA_LARGE -> "XL";
        };
        System.out.println(label);
    }

}
