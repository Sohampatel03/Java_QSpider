class BuildingDriver {
    public static void main(String args[]) {
        Building b1 = new Building(5);
        Building b2 = new Building(10, "bangalore");
        Building b3 = new Building(15, "bangalore", 120, "Commercial");

        b1.display();
        b2.display();
        b3.display();
    }
}