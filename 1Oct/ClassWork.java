class ClassWork{
    public static void main(String args[]){
        // sumOfEvenDigits();
        // sumOfOddDigits();
        // productOfEvenDigits();
        // productOfOddDigits();
        checkNeonNumber();
    }

    public static void sumOfEvenDigits(){
        int num = 123;
        int sum = 0;
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 == 0) sum += temp;
            num /= 10;
        }
        System.out.println(sum);
    }

    public static void sumOfOddDigits(){
        int num = 123;
        int sum = 0;
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 != 0) sum += temp;
            num /= 10;
        }
        System.out.println(sum);
    }

    public static void productOfEvenDigits(){
        int num = 123;
        int prod = 1;
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 == 0) prod *= temp;
            num /= 10;
        }
        System.out.println(prod);
    }

    public static void productOfOddDigits(){
        int num = 123;
        int prod = 1;
        while(num != 0){
            int temp = num % 10;
            if(temp % 2 != 0) prod *= temp;
            num /= 10;
        }
        System.out.println(prod);
    }

    public static void checkNeonNumber(){
        int num = 9;
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