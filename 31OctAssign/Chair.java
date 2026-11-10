class Chair {
    String type;
    int legs;
    String color;
    String warranty;

    Chair(String type) {
        this.type = type;
    }

    Chair(String type, int legs) {
        this.type = type;
        this.legs = legs;
    }

    Chair(String type, int legs, String color, String warranty) {
        this.type = type;
        this.legs = legs;
        this.color = color;
        this.warranty = warranty;
    }

    void display() {
        System.out.println(type + " " + legs + " " + color + " " + warranty);
    }
}

