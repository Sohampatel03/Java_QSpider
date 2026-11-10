class Flight{
    String name;
    long fNumber;
    double price;
    int numberOfTickets;
    double total;
    Flight(String n,long f,double p,int q){
        name = n;
        fNumber = f;
        price = p;
        numberOfTickets = q;
        totalAmount();
    }
    void totalAmount(){
         total = this.price*this.numberOfTickets;
         if(this.numberOfTickets > 3){
             total = total-((total*10) / 100);
         }
    }
    void display(){
        System.out.println("Flight Name - "+name);
        System.out.println("Flight Number - "+fNumber);
        System.out.println("Price - "+price);
        System.out.println("Number of Tickets - "+numberOfTickets);
         System.out.println("total amount is - "+total);
    }
}
