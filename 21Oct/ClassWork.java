import java.util.Scanner;
class ClassWork{
    public static void main(String args[]){
        // checkVowel();
        atm();

    }
    static void checkVowel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character");
        char a = sc.nextLine().toLowerCase().charAt(0);
        switch(a){
            case 'a': System.out.print("Vowel"); break;
            case 'e': System.out.print("Vowel"); break;
            case 'i': System.out.print("Vowel"); break;
            case 'o': System.out.print("Vowel"); break;
            case 'u': System.out.print("Vowel"); break;
            default : System.out.print("Not Vowel");
        }
    }
    static void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1");
        int val1 = sc.nextInt();
        System.out.print("Enter the Number 2");
        int val2 = sc.nextInt();
        System.out.print("Enter the Operator");
        char opr = sc.nextLine().toLowerCase().charAt(0);
        switch(opr){
            case '+': System.out.print(val1+val2); break;
            case '-': System.out.print(val1-val2); break;
            case '*': System.out.print(val1*val2); break;
            case '/': System.out.print(val1/val2); break;
            case '%': System.out.print(val1%val2); break;
            default : System.out.print("Invalid operator");
        }
    }
    static void check(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for check positive or negative");
        int num = sc.nextInt();
        if(num >= 0){
            System.out.print("positive");
        }else{
            System.out.print("Negative");
        }
    }

    static void calculateArea(){
        int command = 0;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Menu Options \n 1.for calculate area of circle \n 2.square of number \n 3.for cube of number \n 4.for exit");
       command = sc.nextInt();
        System.out.print("Enter the Number for Calculation");
        int num = sc.nextInt();
        switch(command){
             case 1: System.out.print("circle"+ 2*3.14*num); break;
            case 2: System.out.print("Square"+ num*num); break;
            case 3: System.out.print("cube"+ num*num*num); break;
            case 4: System.out.print("Exit from loop"); break;
            default : System.out.print("Invalid Option");
        }
        }while(command != 4);
    }
    static void atm(){
        int command = 0;
        int bal = 10000;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Menu Options \n 1.for check balance \n 2.for deposite \n 3.for withdraw \n 4.for exit");
         command = sc.nextInt();
        switch(command){
             case 1: System.out.print("balance is"+ bal); break;
            case 2: System.out.print("Enter deposite amount");
            bal = bal+sc.nextInt();
            System.out.print("After deposite bal"+ bal);
             break;
            case 3: System.out.print("Enter withdraw amount");
            bal = bal-sc.nextInt();
            System.out.print("After withdraw bal"+ bal); break;
            case 4: System.out.print("Exit from loop"); break;
            default : System.out.print("Invalid Option");
        }
        }while(command != 4);
    }

    
}