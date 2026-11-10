class Theatre{
    String moivieName;
    String customerName;
    int numberOfTickets;
    double price;
    double total;
    Theatre(String m){
        moivieName = m;
        this.totalAmount();
    }
    Theatre(String m,String c){
        this.Threatre(m);
        this.customerName = c;
        this.totalAmount();
    }
    Theatre(String m,String c,int n){
        this.Threatre(m,c);
        numberOfTickets = n;
        this.totalAmount();
    }
    Theatre(String m,String c,int n,double p){
        this.Threatre(m,c,n);
        price = p;
        this.totalAmount();
    }
    void totalAmount(){
        total = this.price*this.numberOfTickets;
    }
    void display(){
        System.out.println("Total amount is - "+ total);
    }
}