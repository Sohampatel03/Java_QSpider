import java.util.Scanner;

class ClassWork {
    public static void main(String args[]) {
        // count_Digit();
        count_Even_Digit();
    }

    public static void count_Digit() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.print("Count is " + count);
    }
    public static void count_Even_Digit() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            int temp = num%10;
            if(temp%2 == 0)
            count++;
            num /= 10;
        }
        System.out.print("Count is " + count);
    }
}