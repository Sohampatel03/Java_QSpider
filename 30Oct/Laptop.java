class Laptop{
    String brand;
    String processor;
    int price;
    String color;
    Laptop(String brand,String processor,int price,String color){
        this.brand = brand;
        this.processor = processor;
        this.price = price;
        this.color = color;
    }
    void display(){
        System.out.println(brand+" "+processor+" "+price+" "+color);
    }
}