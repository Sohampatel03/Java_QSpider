import java.util.*;
class HomeWork{
    public static void main(String args[]){
        countEvenOdd();
    }
    public static void countEvenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
            n /= 10;
        }
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}