package EnumerationClasses;

public class Main {

    public static void main(String[] args) {
        Size s = Enum.valueOf(Size.class, "SMALL");
        System.out.println(s);

        Size[] values = Size.values();
        for(int i = 0; i < values.length; i++)
            System.out.println(values[i] + " - " + values[i].getAbbreviation());
    }

}
