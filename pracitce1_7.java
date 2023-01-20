class Pracitce1_7 {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        System.out.println(x + "," + y);
        int z = x;
        x = y;
        y = z;
        System.out.println(x + "," + y);
    }
}
