class MarkerDriver {
    public static void main(String args[]) {
        Marker m1 = new Marker("Blue");                   
        Marker m2 = new Marker("Black", 25);         
        Marker m3 = new Marker("Red", 30, "plastic"); 

        m1.display();
        m2.display();
        m3.display();
    }
}