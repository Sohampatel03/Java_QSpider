class HomeWork {
    public static void main(String args[]){
        // Testing all functions
        // checkEvenOdd(12);
        // findGreater(15, 25);
        // checkScholarship(90, 250000);
        // checkRange(25);
        // checkAdmission(18, 75);
        // findLargest(10, 25, 18);
        // checkTriangle(3, 4, 5);
        // calculateGrade(85);
        // calculate(20, 10, '+');
        // calculateBonus(45000f, 6);
        // menuDemo(1, 5);
        calculateCabFare(25f, 1)
        
        // Task 10
        // int num = 12;
        // if(isPositive(num) && isEven(num) && isDivisibleBy3(num)){
        //     System.out.println(num + " satisfies all three conditions.");
        // } else {
        //     System.out.println(num + " does not satisfy all conditions.");
        // }
    }

    // 1
    public static void checkEvenOdd(int n){
        if(n % 2 == 0) System.out.println(n + " is Even");
        else System.out.println(n + " is Odd");
    }

    // 2
    public static void findGreater(int a, int b){
        if(a > b) System.out.println(a + " is greater");
        else if(b > a) System.out.println(b + " is greater");
        else System.out.println("Both are equal");
    }

    // 3
    public static void checkScholarship(int marks, int income){
        if(marks >= 85 && income < 300000) System.out.println("Eligible for Scholarship");
        else System.out.println("Not Eligible for Scholarship");
    }

    // 4
    public static void checkRange(int n){
        if(n >= 10 && n <= 50) System.out.println(n + " lies between 10 and 50");
        else System.out.println(n + " does not lie in range");
    }

    // 5
    public static void checkAdmission(int age, int marks){
        if(age >= 17 && marks >= 60) System.out.println("Student is eligible");
        else System.out.println("Student is not eligible");
    }

    // 6
    public static void findLargest(int a, int b, int c){
        if(a >= b){
            if(a >= c) System.out.println(a + " is the largest");
            else System.out.println(c + " is the largest");
        } else {
            if(b >= c) System.out.println(b + " is the largest");
            else System.out.println(c + " is the largest");
        }
    }

    // 7
    public static void checkTriangle(int a, int b, int c){
        if(a > 0 && b > 0 && c > 0){
            if((a + b > c) && (b + c > a) && (a + c > b)){
                System.out.println("Triangle is valid");
            } else {
                System.out.println("Triangle is not valid");
            }
        } else {
            System.out.println("Sides must be positive");
        }
    }

    // 8
    public static void calculateGrade(int marks){
        if(marks < 0 || marks > 100){
            System.out.println("Invalid marks! Rejected.");
        } else if(marks >= 90){
            System.out.println("Grade: A");
        } else if(marks >= 80){
            System.out.println("Grade: B");
        } else if(marks >= 70){
            System.out.println("Grade: C");
        } else if(marks >= 60){
            System.out.println("Grade: D");
        } else if(marks >= 35){
            System.out.println("Grade: E");
        } else {
            System.out.println("Fail");
        }
    }

    // 9
    public static void calculate(int a, int b, char op){
        if(op == '+') System.out.println(a + b);
        else if(op == '-') System.out.println(a - b);
        else if(op == '*') System.out.println(a * b);
        else if(op == '/'){
            if(b != 0) System.out.println(a / b);
            else System.out.println("Division by zero error");
        } else {
            System.out.println("Invalid operator");
        }
    }

    // 10
    public static boolean isPositive(int n){
        return n > 0;
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static boolean isDivisibleBy3(int n){
        return n % 3 == 0;
    }

    // 11
    public static void calculateBonus(float salary, int experience){
        if(experience >= 5 && salary < 50000){
            System.out.println("Bonus: " + (salary * 0.20f));
        } else if(experience >= 3){
            System.out.println("Bonus: " + (salary * 0.10f));
        } else {
            System.out.println("Bonus: " + (salary * 0.05f));
        }
    }

    // 12 and 13 both are samme
    public static void menuDemo(int choice, int val){
        if(choice == 1) System.out.println("Square: " + findSquare(val));
        else if(choice == 2) checkEvenOddMenu(val);
        else if(choice == 3) System.out.println("Max: " + findMax(val, 10));
        else if(choice == 4) System.out.println("Is Prime: " + checkPrime(val));
        else System.out.println("Invalid choice");
    }
    public static int findSquare(int n){
        return n * n;
    }

    public static void checkEvenOddMenu(int n){
        if(n % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }

    public static int findMax(int a, int b){
        if(a > b) return a;
        return b;
    }

    public static boolean checkPrime(int n){
        if(n <= 1) return false;
        int i = 2;
        while(i <= n / 2){
            if(n % i == 0) return false;
            i++;
        }
        return true;
    }

    // 14
    public static float calculateCabFare(float distance, int isPremium){
        float fare = 0;
        if(distance <= 20){
            fare = 50 + (distance * 15);
        } else {
            fare = 50 + (20 * 15) + ((distance - 20) * 12);
        }
        if(isPremium == 1){
            fare = fare - (fare * 0.10f);
        }
        return fare;
    }
}