import java.util.Scanner;

class MondayAssign{
    public static void main(String args[]){
        // countOddDigits();
        // printEvenDigits();
        // printOddDigits();
        // divisibleByThree();
        divisibleByFour();
    }

    public static void countOddDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for count odd digits");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 != 0) count++;
            num /= 10;
        }
        System.out.println(count);
    }

    public static void printEvenDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for print even digits");
        int num = sc.nextInt();
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 == 0) System.out.println(temp);
            num /= 10;
        }
    }

    public static void printOddDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for print odd digits");
        int num = sc.nextInt();
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 != 0) System.out.println(temp);
            num /= 10;
        }
    }

    public static void divisibleByThree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for print digits divisible by 3");
        int num = sc.nextInt();
        while(num != 0){
            int temp = num % 10;
            if(temp % 3 == 0) System.out.println(temp);
            num /= 10;
        }
    }

    public static void divisibleByFour(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for count digits divisible by 4");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0){
            int temp = num % 10;
            if(temp != 0 && temp % 4 == 0) count++;
            num /= 10;
        }
        System.out.println(count);
    }
}