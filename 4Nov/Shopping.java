class Shopping{
    String name;
    int price;
    int quantity;
    double total;

    Shopping(String n,int p,int q){
        name = n;
        price = p;
        quantity = q;
        this.totalAmount();
    }
    void totalAmount(){
         total = this.price*this.quantity;
        if(total > 5000){
            total = total-((total*10) / 100);
        }
    }
    void display(){
         System.out.println("total amount is - "+total);
    }
}