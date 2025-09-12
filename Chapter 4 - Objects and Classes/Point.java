public record Point(double x, double y) {

    public static Point ORIGIN = new Point(1, 3);
    public static Point DESTIN = new Point(2, 4);

    public static double distance(Point p, Point q) {
        return Math.hypot(p.x - q.x, p.y - q.y);
    }

    public static void main(String[] args) {
        System.out.println(distance(ORIGIN, DESTIN));
    }

}
