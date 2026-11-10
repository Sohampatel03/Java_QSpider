class Bank{
    long accountNumber;
    String accountHolderName;
    String accountType;
    double balance;
    Bank(long a){
        accountNumber = a;
    }
    Bank(long a,String n){
        this(a);
        accountHolderName = n;
    }
    Bank(long a,String n,String t){
        this(a,n);
        accountType = t;
    }
    Bank(long a,String n,String t,double b){
        this(a,n,t);
        balance = b;
    }   
    void display(){
        System.out.println("Account Number - "+accountNumber);
        System.out.println("Account Holder Name - "+accountHolderName);
        System.out.println("Account Type - "+accountType);
        System.out.println("Balance - "+balance);
    }
}