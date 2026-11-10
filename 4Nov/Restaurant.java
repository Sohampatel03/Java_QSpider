class Restaurant{
    String name;
    String foodItem;
    int price;
    int quantity;
    double total;
    Restaurant(String n,String f,int p,int q){
        name = n;
        foodItem = f;
        price = p;
        quantity = q;
        this.total();
    }
    void total(){
       total = this.price*this.quantity;
       total = total+((total*5)/100);
    }
    void display(){
        System.out.println("Total amount with 5% gst is - "+ total );

    }
}