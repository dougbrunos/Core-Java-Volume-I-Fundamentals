public class Casts {

    public static void main(String[] args) {
        double x = 9.997;
        int nx = (int) x;
        int nxr = (int) Math.round(x);
        System.out.println("Normal Cast: " + nx);
        System.out.println("Roudend Cast: " + nxr);
    }

}
