class Marker {
    String color;
    int price;
    String material;

    Marker(String color) {
       this.color = color;
    }

    Marker(String color, int price) {
        this(color);
        this.price = price;
    }

    Marker(String color, int price, String material) {
        this(color, price);
        this.material = material;
    }

    void display() {
        System.out.println(color + " " + price + " " + material);
    }
}

