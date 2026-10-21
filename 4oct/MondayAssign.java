import java.util.Scanner;

class MondayAssign{
    public static void main(String args[]){
        findFactors();
        sumOfFactors();
        findEvenFactors();
        countEvenFactors();
        productOfFactors();
        countOddFactors();
        checkPerfectNumber();
        findPerfectFactors();
    }

    public static void findFactors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for find factors");
        int num = sc.nextInt();
        int i = 1;
        while(i <= num){
            if(num % i == 0) System.out.println(i);
            i++;
        }
    }

    public static void sumOfFactors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for sum of factors");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= num){
            if(num % i == 0) sum += i;
            i++;
        }
        System.out.println(sum);
    }

    public static void findEvenFactors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for find even factors");
        int num = sc.nextInt();
        int i = 1;
        while(i <= num){
            if(num % i == 0 && i % 2 == 0) System.out.println(i);
            i++;
        }
    }

    public static void countEvenFactors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for count even factors");
        int num = sc.nextInt();
        int count = 0;
        int i = 1;
        while(i <= num){
            if(num % i == 0 && i % 2 == 0) count++;
            i++;
        }
        System.out.println(count);
    }

    public static void productOfFactors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for product of factors");
        int num = sc.nextInt();
        int prod = 1;
        int i = 1;
        while(i <= num){
            if(num % i == 0) prod *= i;
            i++;
        }
        System.out.println(prod);
    }

    public static void countOddFactors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for count odd factors");
        int num = sc.nextInt();
        int count = 0;
        int i = 1;
        while(i <= num){
            if(num % i == 0 && i % 2 != 0) count++;
            i++;
        }
        System.out.println(count);
    }

    public static void checkPerfectNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check perfect number");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i < num){
            if(num % i == 0) sum += i;
            i++;
        }
        if(sum == num) System.out.println("Perfect Number");
        else System.out.println("Not a Perfect Number");
    }

    public static void findPerfectFactors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for find perfect factors");
        int num = sc.nextInt();
        int i = 1;
        while(i < num){
            if(num % i == 0) System.out.println(i);
            i++;
        }
    }
}