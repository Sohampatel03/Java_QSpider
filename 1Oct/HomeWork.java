import java.util.Scanner;

class HomeWork{
    public static void main(String args[]){
        // sumOfEvenDigits();
        // sumOfOddDigits();
        // productOfEvenDigits();
        // productOfOddDigits();
        checkNeonNumber();
    }

    public static void sumOfEvenDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for sum of even digits");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 == 0) sum += temp;
            num /= 10;
        }
        System.out.println(sum);
    }

    public static void sumOfOddDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for sum of odd digits");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 != 0) sum += temp;
            num /= 10;
        }
        System.out.println(sum);
    }

    public static void productOfEvenDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for product of even digits");
        int num = sc.nextInt();
        int prod = 1;
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 == 0) prod *= temp;
            num /= 10;
        }
        System.out.println(prod);
    }

    public static void productOfOddDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for product of odd digits");
        int num = sc.nextInt();
        int prod = 1;
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 != 0) prod *= temp;
            num /= 10;
        }
        System.out.println(prod);
    }

    public static void checkNeonNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check neon number");
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;
        while(square != 0){
            int temp = square % 10;
            sum += temp;
            square /= 10;
        }
        if(sum == num) System.out.println("Neon Number");
        else System.out.println("Not a Neon Number");
    }
}