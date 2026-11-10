class CarDriver {
    public static void main(String args[]) {
        Car c1 = new Car("Toyota");
        Car c2 = new Car("Honda", 25000);
        Car c3 = new Car("Tesla", 45000, "Electric", "Red");

        c1.display();
        c2.display();
        c3.display();
    }
}