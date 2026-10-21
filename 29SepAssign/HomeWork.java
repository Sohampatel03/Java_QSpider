import java.util.Scanner;

class HomeWork{
    public static void main(String args[]){
        // printForwardNumber();
        // printForwardEven();
        // printForwardOdd();
        // printForwardTable();
        // printReverseNumber();
        // printReverseEven();
        // printReverseOdd();
        printReverseTable();
    }
    public static void printForwardNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ending point from 1");
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= n);
    }

    public static void printForwardEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ending point from 1 for print even");
        int n = sc.nextInt();
        int i = 1;
        do{
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }while(i <= n);
    }

    public static void printForwardOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ending point from 1 for print odd");
        int n = sc.nextInt();
        int i = 1;
        do{
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }while(i <= n);
    }

    public static void printForwardTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter table number what you want to print in forward order");
        int j = sc.nextInt();
        int i = 1;
        do{
            System.out.println(j+"*"+i+"="+(j*i));
            i++;
        }while(i <= 10);
    }

    public static void printReverseNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ending point from 1");
        int i = sc.nextInt();
        do{
            System.out.println(i);
            i--;
        }while(i >= 1);
    }

    public static void printReverseEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ending point from 1 for print even");
        int i = sc.nextInt();
        do{
            if(i % 2 == 0){
                System.out.println(i);
            }
            i--;
        }while(i >= 1);
    }

    public static void printReverseOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ending point from 1 for print odd");
        int i = sc.nextInt();
        do{
            if(i % 2 != 0){
                System.out.println(i);
            }
            i--;
        }while(i >= 1);
    }

    public static void printReverseTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter table number what you want to print in reverse order");
        int j = sc.nextInt();
        int i = 10;
        do{
            System.out.println(j+"*"+i+"="+(j*i));
            i--;
        }while(i >= 1);
    }
}