class Building {
    int floors;
    String locations;
    int rooms;
    String type;

    Building(int floors) {
        this.floors = floors; 
    }

    Building(int floors, String locations) {
        this(floors); 
        this.locations = locations;
    }

    Building(int floors, String locations, int rooms, String type) {
        this(floors, locations); 
        this.rooms = rooms;
        this.type = type;
    }

    void display() {
        System.out.println(floors + " " + locations + " " + rooms + " " + type);
    }
}

