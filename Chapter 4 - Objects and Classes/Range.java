public record Range(int from, int to) {

    /*
     * However, you are encouraged to use a compact form when implementing the
     * canonical constructor.
     */
    /*
     * public Range(int from, int to) {
     * if (from <= to) {
     * this.from = from;
     * this.to = to;
     * } else {
     * this.from = to;
     * this.to = from;
     * }
     * }
     */

    public Range // Compact form
    {
        if (from > to) // Swap the bounds
        {
            int temp = from;
            from = to;
            to = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Range(4, 2));
    }

}