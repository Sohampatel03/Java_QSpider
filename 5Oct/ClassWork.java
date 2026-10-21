import java.util.*;
class ClassWork{
    public static void main(String args[]){
        // useBreak1();
        // useBreak2();
        checkDigit();

    }
    public static void useBreak1(){
        int i =1;
while(i<=10){
    if(i==5) break;
    System.out.println(i);
    i++;
}
    }
    public static void useBreak2(){
        int i =1;
        do{
            if(i==5) break;
            System.out.println(i);
            i++;
        }while(i<=10);

    }
    public static void checkDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num");
        int num = sc.nextInt();
        System.out.print("enter digit");
        int dig = sc.nextInt();
        boolean res = false;
        while(num != 0){
            if(num%10 == dig){
                res = true;
                System.out.print("its present");
                break;
            }
            num /= 10;
        }
        if(res == false) System.out.print("not present");
    }
    public static void duckNum(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = false;
        while(num != 0){
            if(num % 10 == 0){
                res = true;
                System.out.print("its duck num");
                break;
            }
        }
        if(res = false) System.out.print("its not duck num");
            }
             public static void rev(){
            int num =123;
            int rev = 0;
            while(num != 0){
                int rem = num%10;
                rev = (rev*10)+rem;
                num /= 10;
        }
    }
    public static void checkPalindrome(){
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(num != 0){
            rev = (rev*10)+(num%10);
            num /= 10;
        }
        if(temp == rev){
            System.out.print("palindrome");
        }else{
            System.out.print(" not palindrome");
        }
    }
}