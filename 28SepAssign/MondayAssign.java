import java.util.Scanner;
class MondayAssign{
    public static void main(String args[]){
printReverseNumber();
printReverseEven();
printReverseOdd();
printReverseTable();
    }
public static void printReverseNumber(){
        int i = 10;
        while(i>= 1){
            System.out.println(i);
            i--;
        }
    }
    public static void printReverseEven(){
        int i = 10;
        while(i >= 1){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i--;
        }
    }

    public static void printReverseOdd(){
        int i = 10;
        while(i >= 1){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i--;
        }
    }

    public static void printReverseTable(){
        int j = 10;
        int i = 10;
        while(i >= 1){
            System.out.println(j+ "*"+i+"="+(j*i));
            i--;
        }
    }


    // public static void printReverseNumber(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter ending point from 1");
    //     int i = sc.nextInt();
    //     while(i>= 1){
    //         System.out.println(i);
    //         i--;
    //     }
    // }
    // public static void printReverseEven(){
    //      Scanner sc = new Scanner(System.in);
    //     System.out.println("enter ending point from 1 for print even");
    //     int i = sc.nextInt();
    //     while(i >= 1){
    //         if(i % 2 == 0){
    //             System.out.println(i);
    //         }
    //         i--;
    //     }
    // }

    // public static void printReverseOdd(){
    //      Scanner sc = new Scanner(System.in);
    //     System.out.println("enter ending point from 1 for print odd");
    //     int i = sc.nextInt();
    //     while(i >= 1){
    //         if(i % 2 != 0){
    //             System.out.println(i);
    //         }
    //         i--;
    //     }
    // }

    // public static void printReverseTable(){
    //      Scanner sc = new Scanner(System.in);
    //     System.out.println("enter table number what you want to print in reverse order");
    //     int j = sc.nextInt();
    //     int i = 10;
    //     while(i >= 1){
    //         System.out.println(j+ "*"+i+"="+(j*i));
    //         i--;
    //     }
    // }
}