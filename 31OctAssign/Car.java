class Car {
    String brand;
    int price;
    String fuelType;
    String color;
    Car(String brand) {
       this.brand = brand;
    }

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    Car(String brand, int price, String fuelType, String color) {
        this.brand = brand;
        this.price = price;
        this.fuelType = fuelType;
        this.color = color;
    }

    void display() {
        System.out.println(brand + " " + price + " " + fuelType + " " + color);
    }
}