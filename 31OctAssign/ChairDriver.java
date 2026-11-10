class ChairDriver {
    public static void main(String args[]) {
        Chair ch1 = new Chair("Office");
        Chair ch2 = new Chair("Dining", 4);
        Chair ch3 = new Chair("Gaming", 5, "Black", "2 Years");

        ch1.display();
        ch2.display();
        ch3.display();
    }
}